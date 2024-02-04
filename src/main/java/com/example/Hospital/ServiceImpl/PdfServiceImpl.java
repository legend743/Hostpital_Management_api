



package com.example.Hospital.ServiceImpl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Hospital.DTO.PatientsDetailsDto;
import com.example.Hospital.Service.Hosp_service;
import com.example.Hospital.Service.pdfService;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;



@Service
public class PdfServiceImpl implements pdfService {
    
    private org.slf4j.Logger logger = LoggerFactory.getLogger(PdfServiceImpl.class);
    
    @Autowired
    private Hosp_service hospService; // Inject the service interface
    
    @Override
    public ByteArrayInputStream pdfService(Long patientId) {
        logger.info("PDF generation started");
        
        // Retrieve patient details using the service method
        Optional<PatientsDetailsDto> patientDetailsOptional = hospService.getpatientsdetails(patientId);
        
        // Check if patient details are present
        if (patientDetailsOptional.isPresent()) {
            PatientsDetailsDto patientDetails = patientDetailsOptional.get();
            
            // Construct the content for the PDF using patient details
            String title = "Patient Details";
            String content = "Name: " + patientDetails.getFullName() + "\n"
                            + "Blood pressure: " + patientDetails.getBloodPressure() + "\n"
                            + "Gender: " + patientDetails.getGender() + "\n"
                            + "Address: " + patientDetails.getAddress() + "\n"
                           
							+ "Insurance: "+patientDetails.getInsuranceDetails()+"\n"
                            + "Maritial Status: "+patientDetails.getMaritalStatus()+"\n"
                            + "Nationality: "	+patientDetails.getNationality()+"\n"
                            + "email:" + patientDetails.getEmailAddress();
            
            // Generate the PDF document
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            Document document = new Document();
            
            try {
                PdfWriter.getInstance(document, out);
                document.open();
                
                // Add title
                Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
                Paragraph titlePara = new Paragraph(title, titleFont);
                titlePara.setAlignment(Element.ALIGN_CENTER);
                document.add(titlePara);
                
                // Add content
                Font contentFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
                Paragraph contentPara = new Paragraph(content, contentFont);
                document.add(contentPara);
                
                document.close();
            } catch (DocumentException e) {
                logger.error("Error generating PDF: {}", e.getMessage());
            }
            
            return new ByteArrayInputStream(out.toByteArray());
        } else {
            logger.error("Patient details not found for ID: {}", patientId);
            return null; // Or handle the case where patient details are not found
        }
    }
}
