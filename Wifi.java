import java.util.Scanner; 

public class Wifi
{
	public static void main(String[] args) {
	    //initialize user input variable 
	    Scanner wifiissue = new Scanner(System.in);
	   
	    
		System.out.println("If you're having touble with internet conectivity,\nthis Wifi diagnosis may be able to asist you...");
		System.out.println("\t");
		System.out.println("First step: Reboot your computer\nAre you able to connect with the internet? (yes or no)");
		
		//Combine input(wifiissue) variable with String variable to use throught the code. 
		String UserInput = wifiissue.nextLine();

		if (UserInput.equals("yes")) {
		    
		    System.out.println("If Rebooting your computer worked exit program. Goodbye !"); 
		}
		else {
		    
		    System.out.println("Second step: Reboot your router\nAre you able to connect to the internet? (yes or no)");
		    
		}
		
		if (UserInput.equals("yes")){
		
		  System.out.println("If Rebooting your router worked exit program. Goodbye !"); 
		  
     	}
        else {
            
            System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power.\nNow are you able to connect to the internet? (yes or no)");
            
        }
        
        if (UserInput.equals ("yes")) {
            
            System.out.println("If checking your cables worked, exit program. Goodbye !");
        }
        else {
            System.out.println("Fourth step: move your computer closer to your router.\n Now are you able to connect to the internet? (yes or no)");
        }

        if (UserInput.equals ("yes")) {
            
            System.out.println("If moving your computer closer to your router worked, exit program. Goodbye !");
            
        }
        else {
            System.out.println("Contact your ISP (Internet Service Provider) Make sure your ISP is connected to your router");
        }

	}
}
