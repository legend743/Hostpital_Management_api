package com.example.Hospital.ServiceImpl;
import spark.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class CBCReportDownload {

    public static void configureRoutes() {
        // Define the path to the file to be downloaded
        String filePath = "C://Users//Lenovo//Downloads//Meeting Requirements 01-02-2024.txt"; // Change this to the actual file path

        // Define a route to handle file download requests
        Spark.port(4568); // Use a different port for Spark
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
