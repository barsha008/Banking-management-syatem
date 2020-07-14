/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

/**
 *
 * @author aashirbad JAY
 */  import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class maill {
   
  public static void main(String[] args) {
  }
  public static void msg(String reciver)
  {
      System.err.println("IN MAIN");
        try {
            System.err.println("Is it in ?");
            String host = "smtp.gmail.com";
            String user = "srhreeramsoft@gmail.com";
            String pass = "Cool@111";
            String to = reciver;
            String from = "srhreeramsoft@gmail.com";
            String subject = " Bank Of ODISHA ,OTP for ur Account" ; 
            String messageText = " Hii, Welcome to Our Bank !!!"
                    + " Ypur OTP is  : "  ;
            boolean sessionDebug = false;
            
            Properties props = System.getProperties();
            
            props . put ("mail.smtp.starttls.enable","true");
            props . put("mail.smtp.host",host);
            props . put ("mail.smtp.port",587);
            props . put("mail.smtp.auth", "true" ) ; 
            props .put ("mail.smtp.starttls.required", "true");
            Session mailSession = Session . getDefaultInstance(props,null);
            mailSession . setDebug(sessionDebug);
            Message msg  = new MimeMessage(mailSession);
            msg . setFrom(new InternetAddress (from) );
            InternetAddress[] address = {new InternetAddress(to)};
            msg . setRecipients(Message . RecipientType.TO , address);
            msg . setSubject (subject) ; msg.setSentDate(new Date ());
            msg . setText(messageText);
            Transport transport = mailSession . getTransport("smtp");
            transport.connect(host, user, pass);
            transport . sendMessage(msg, msg . getAllRecipients());
            transport . close();
            System.out.println("Message sent successfully..");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
   	}   

  }      
        

