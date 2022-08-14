package digitallibrarymanagementsystem;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

import javax.mail.Session;

public class SimpleEmail {

    public static void main(String[] args) {
        
               
        try {
            EmailUtil.sendMail("olihossain934@gmail.com");
        } catch (Exception ex) {    
            System.out.println("pari nai");
            Logger.getLogger(SimpleEmail.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
