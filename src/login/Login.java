package login;

import javax.swing.JOptionPane;
import java.util.Scanner;
import static java.lang.System.out;

	public class Login  {
		
		public static void main(String args[]) {
	        Scanner keyboard = new Scanner(System.in);
	        out.println("Write your login");
	        String login = keyboard.next();
	        String emailvalidator = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
	                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	        while(!login.matches(emailvalidator)) {
	        	System.out.println("Write valid email");
	            login = keyboard.next();
	         } 
	        System.out.println("Write your password");
	        String pswd = keyboard.next();
	        String passwordvalidator = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
		    while(!pswd.matches(passwordvalidator)) {
		    	System.out.println("Write valid password");
		    	pswd = keyboard.next();
		    }
		    System.out.println("You are in");
		}
		    
	}

