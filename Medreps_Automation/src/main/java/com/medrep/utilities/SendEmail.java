package com.medrep.utilities;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.medrep.base.BaseClass;
public class SendEmail extends BaseClass {

	public static void SendEmailNow(String body,String link) {
		
	final String username = "automatedtestingemails@medreps.com";
	final String password = "Xoz20698";	

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(""));
            
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(""));
            String currentDateTime = new SimpleDateFormat("dd-MMM-yyyy_h:mm a z").format(Calendar.getInstance().getTime());
            message.setSubject("Uat Env Web Automation Tests Run Report on "+currentDateTime);
            message.setText("Report is attached as a zip file, download, extract it in a folder and you can see report files there.");
            Multipart multipart = new MimeMultipart();
            BodyPart textPart = new MimeBodyPart(); 
            body+=link;
            textPart.setText(body);
          
	            multipart.addBodyPart(textPart);

	            // Send the complete message parts
	            message.setContent(multipart );
	            Transport.send(message);
	            System.out.println("Email Sent");

	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
	    }
}
