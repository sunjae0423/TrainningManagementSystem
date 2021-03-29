import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		
		int num = 0;
		int Reps=0;
		int Set= 0;
		Scanner input = new Scanner(System.in);
		
		
		
		while ( num != 6){
			System.out.println("1. Add Trainning Program");
		    System.out.println("2. Delete Trainning Program");
		    System.out.println("3. Edit Trainning Program");
            System.out.println("4. View Trainning Program");
	        System.out.println("5. Show A Menu");
	        System.out.println("6. Exit");
	        System.out.print("Select one number between 1-6 : ");
	        num = input.nextInt();    
	        if(num == 1) {
	        	AddTrainningProgram();
	        }
	        else if(num == 2) {
	        	DeleteTrainningProgram();
	        }
	        else if(num == 3) {
	        	EditTrainningProgram();
	        }
	        else if(num == 4) {
	        	ViewTrainningProgram();
	        }
	        else {
	        	continue;
	        }
	        
	       
		}

	}
	public static void AddTrainningProgram() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
		System.out.print("Reps: ");
		int Rep= input.nextInt();
		System.out.print("Sets: ");
		int Set = input.nextInt();
	}
	public static void DeleteTrainningProgram() {
		Scanner input = new Scanner(System.in);
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
	}
    public static void EditTrainningProgram() {
    	Scanner input = new Scanner(System.in);
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
	}
    public static void ViewTrainningProgram() {
    	Scanner input = new Scanner(System.in);
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
    }
    
}

