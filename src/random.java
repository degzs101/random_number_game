
import java.util.Scanner;


public class random {



	
	private static int ans;

	public static void main(String[] args) {
		int x,y = 0; 
		x = num (); // declare x between 1 and 50
		y = num(); // declare y between 1 and 50 
	
		ans = askforsum (x,y);
		checkans(x,y,ans); // call methods
		System.exit(0);
	}
		
		 
		 
	private  static   int num(){ // use a method
		int num;
	    num = (int)(1 + Math.random()*50); // use the random to give random number
	    return num;
	}
	
					 
	public static int askforsum(int x,int y){ // to be able to call the method back
			
		Scanner input = new Scanner(System.in);// import scanner
	    System.out.println("whats is " + x + " + "   + y);
		int askfor = input.nextInt(); // making sure its a Int and user inputs some thing
		return  askfor;
		 	}
		 
	public static void checkans (int x, int y, int ans){
				 if (x + y==ans) // use a if statement
					 System.out.println("the answer is right"); // will give out the right answer
				 else
					 System.out.println("the wrong answer"); // will give out wrong
			}
				 
				 
	}

	
		 


		
