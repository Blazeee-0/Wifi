import java.util.Scanner; 

public class MovieDriver
{
	public static void main(String[] args) {
	    
	    int counter = 0; 
	    
	    while(counter < 10){
	    
	    Scanner movieTitle = new Scanner(System.in); 
	    
		System.out.println("Enter the name of a movie");
		
		String movie = movieTitle.nextLine();
		
		System.out.println("Enter the rating of the movie");
		
		String rating = movieTitle.nextLine(); 
		
		System.out.println("Enter the number of tickets sold for this movie"); 
		
		String tickets = movieTitle.nextLine();  
		
		System.out.println(movie); System.out.println (rating); System.out.println(tickets);
		
		
	    }
	    
		
	}
}
