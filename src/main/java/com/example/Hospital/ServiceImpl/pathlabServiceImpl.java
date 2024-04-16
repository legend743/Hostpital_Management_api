package com.example.Hospital.ServiceImpl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.Dao.cbcDAO;
import com.example.Hospital.Entity.CBCReportEntity;
import com.example.Hospital.Service.PathlabService;
import spark.*;
import spark.utils.SparkUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Service

public class pathlabServiceImpl implements PathlabService {

	private static final Logger LOGGER = Logger.getLogger(pathlabServiceImpl.class.getName());

	@Autowired
	private cbcDAO cbcdao;

	public String savecbcdetails(CBCReportEntity cbcreport) {
		try {
			LOGGER.info("Saving CBC details: " + cbcreport.toString()); // Log information about the CBC report being
																		// saved
			cbcdao.save(cbcreport);
			LOGGER.info("CBC details saved successfully."); // Log success message
			return "succesful";
		} catch (Exception e) {
			LOGGER.severe("Error occurred while saving CBC details: " + e.getMessage()); // Log error message
			e.printStackTrace();
		}
		return "not successful";
	}

	@Override
	public void fileDownload(Long id) {

		// Define the path to the file to be downloaded
		String filePath = "C://Users//Lenovo//Downloads//Meeting Requirements 01-02-2024.txt"; // Change this to the
																								// actual file path

		// Define the port on which the server will run
		int port = 4567; // Change this to your desired port number

		// Initialize Spark
		Spark.port(port);

		// Define a route to handle file download requests
		Spark.get("/download", (request, response) -> {
			File file = new File(filePath);
			if (!file.exists()) {
				throw new FileNotFoundException("File not found: " + filePath);
			}

			// Set response headers
			response.header("Content-Disposition", "attachment; filename=" + file.getName());
			response.header("Content-Type", "application/octet-stream");
			response.header("Content-Length", String.valueOf(file.length()));

			// Copy file content to response output stream
			try (FileInputStream fis = new FileInputStream(file)) {
				byte[] buffer = new byte[1024];
				int bytesRead;
				while ((bytesRead = fis.read(buffer)) != -1) {
					response.raw().getOutputStream().write(buffer, 0, bytesRead);
				}
				response.status(200);
				return response.raw();
			} catch (Exception e) {
				response.status(500);
				return e.getMessage();
			}
		});

	}
}