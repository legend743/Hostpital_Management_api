package com.example.Hospital.ServiceImpl;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital.Dao.cbcDAO;
import com.example.Hospital.Entity.CBCReportEntity;
import com.example.Hospital.Service.PathlabService;

@Service

public class pathlabServiceImpl implements PathlabService{
	
	 private static final Logger LOGGER = Logger.getLogger(pathlabServiceImpl.class.getName());

	    @Autowired
	    private cbcDAO cbcdao;


	  public String savecbcdetails(CBCReportEntity cbcreport) {
	        try {
	            LOGGER.info("Saving CBC details: " + cbcreport.toString()); // Log information about the CBC report being saved
	            cbcdao.save(cbcreport);
	            LOGGER.info("CBC details saved successfully."); // Log success message
	            return "succesful";
	        } catch (Exception e) {
	            LOGGER.severe("Error occurred while saving CBC details: " + e.getMessage()); // Log error message
	            e.printStackTrace();
	        }
	        return "not successful";
	    }
	}