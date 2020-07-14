/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminbank;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author aashirbad JAY
 */
public class AccMail {
      
       
        public static void sendAccPass(String rec,String acc,String pas,String n)
        {
            String accNo = acc;
            String p = pas;
            String nm = n;
  String reciver = rec ; //"aashirbad.maharana3@gmail.com";
      System.err.println("IN MAIN");
        try {
            System.err.println("Is it in ?");
            String host = "smtp.gmail.com";
            String user = "srhreeramsoft@gmail.com";
            String pass = "Cool@111";
            String to = reciver;
            String from = "srhreeramsoft@gmail.com";
            String subject = " Bank Of ODISHA, Here is Your  Account" ; 
            String messageText = " Hii " + nm + ", Welcome to Our Bank !!!\n"
                    + " Your Account Number is  : " + accNo +"\nPassword is \t: "+ p  ;
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
