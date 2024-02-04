package com.example.Hospital.Controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital.ServiceImpl.PdfServiceImpl;

@RestController
@RequestMapping("/pdf")
public class pdfController {
	@Autowired
	private PdfServiceImpl pdfservice;
	
	@GetMapping("/pdfDownload/{id}")
	public ResponseEntity<InputStreamResource> pdfService(@PathVariable Long id) {
		ByteArrayInputStream pdf=pdfservice.pdfService(id);
		 HttpHeaders httpheaders=new HttpHeaders();
		 httpheaders.add("Content-Deposition","inline,file=mynewpdf");
		return ResponseEntity.
				ok()
				.headers(httpheaders)
				.contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdf));
		
	}

}
