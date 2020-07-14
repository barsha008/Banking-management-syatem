/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminbank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aashirbad JAY
 */
public class xdate {
    public static void main(String[] args) {
       new xdate(). date();
    
}
     public String date() {
     
      Date date = new Date();
    String strDateFormat = "hh : mm : ss a";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate= dateFormat.format(date);
    System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate); 
      
    Date now = new Date();
        Date today = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        String folderName = simpleDateformat.format(today);
        System.out.println("folldr " + folderName);
        
        
        Date date11 = Calendar.getInstance().getTime();  
DateFormat dateFormat11 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
String strDate = dateFormat11.format(date11); 
System.out.print(strDate);
        return strDate ;
             
    
}
}
