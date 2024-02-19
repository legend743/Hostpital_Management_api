package com.example.Hospital.ServiceImpl;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.example.Hospital.Service.emailService;

import org.slf4j.Logger;


@Service
public class EmailServiceImpl implements emailService {
    String message = "write the eamail which you want to send";
    String subject = "Testing mail";
    String to = "mail";
    String cc = "mailtowhom wanna send ";
    String from = "email by you want to send mail";
    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    public void sendmail() {
        sendingEmail(message, subject, to, from, cc);
        
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }

    private static void sendingEmail(String message2, String subject2, String to2, String from2, String cc) {
        String host = "smtp.gmail.com";
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("use your email", "use ur password generated by gmail");
            }
        });
        session.setDebug(true);

        MimeMessage m = new MimeMessage(session);
        try {
            m.setFrom(new InternetAddress(from2));
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to2));
            m.addRecipient(Message.RecipientType.CC, new InternetAddress(cc));
            m.setSubject(subject2);
            m.setText(message2);
            Transport.send(m);
            System.out.println("sent success!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
