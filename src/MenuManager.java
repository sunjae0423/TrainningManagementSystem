import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TrainningManager TrainningManager = new TrainningManager(input);
		int num = 0;
			
		while ( num != 5){
			System.out.println("1. Add Trainning Program");
		    System.out.println("2. Delete Trainning Program");
		    System.out.println("3. Edit Trainning Program");
            System.out.println("4. View Trainning Program");
	        System.out.println("5. Exit");
	        System.out.print("Select one number between 1-5 : ");
	        num = input.nextInt();    
	        if(num == 1) {
	        	TrainningManager.AddTrainningProgram();
	        }
	        else if(num == 2) {
	        	TrainningManager.DeleteTrainningProgram();
	        }
	        else if(num == 3) {
	        	TrainningManager.EditTrainningProgram();
	        }
	        else if(num == 4) {
	        	TrainningManager.ViewTrainningProgram();
	        }
	        else {
	        	continue;
	        }
	        
	       
		}

	}
	
}

