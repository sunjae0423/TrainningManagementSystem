import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		
		while ( num != 6){
            System.out.println("1. Add Trainning Program");
		    System.out.println("2. Delete Trainning Program");
		    System.out.println("3. Edit Trainning Program");
            System.out.println("4. View Trainning Program");
	        System.out.println("5. Show A Menu");
	        System.out.println("6. Exit");
	        System.out.println("Select one number between 1-6");
	        num = input.nextInt();
	        switch(num) {
	        case 1:
	         	System.out.print("Trainning Program");
		    	String Trainningname = input.next();
		    	System.out.print("Reps");
		    	int Reps = input.nextInt();
		    	System.out.print("Set");
		    	int Set = input.nextInt();
		    case 2:
		    case 3:
		    case 4:
		    	System.out.print("Trainning Program");
		    	String Trainningname2 = input.next();
		    
		    	  
		    }
		      
		}

	}

}
