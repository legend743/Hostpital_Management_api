package com.example.Hospital;
import io.undertow.Undertow;
import spark.Spark;
import io.undertow.server.RoutingHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Hospital.ServiceImpl.CBCReportDownload;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Hospital-Api",
				version="1.0..0",
				description="Hospital Management apis",
				contact=@Contact(
						name="Mohd Faisal",
						email="fmohd743@gmail.com")
				)
		
		)
public class HospitalDataApplication {

	public static void main(String[] args) {
        // Configure Spark routes
        Spark.get("/hello", (req, res) -> "Hello World");
        
        // Create a RoutingHandler for Undertow
        RoutingHandler routingHandler = new RoutingHandler();
        routingHandler.get("/hello", exchange -> {
            exchange.getResponseSender().send("hello brother");
        });
        Spark.get("/downloadFile", (req, res) -> {
            // Call the method to download the file
            // Replace DownloadManager with the name of your class containing the download method
            CBCReportDownload.configureRoutes();
            return null; // Return null since we don't need to return anything to the client
        });

        // Start Undertow server
        Undertow server = Undertow.builder()
                .addHttpListener(4567, "localhost")
                .setHandler(routingHandler) // Set the RoutingHandler
                .build();
        server.start();
    

		SpringApplication.run(HospitalDataApplication.class, args);
	}

}
