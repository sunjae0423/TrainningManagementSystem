import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TrainningManager TrainningManager = new TrainningManager(input);
		 
		selectMenu(input, TrainningManager);
	}
	
	public static void selectMenu(Scanner input,TrainningManager TrainningManager ) {
		int num = 0;	
		while ( num != 5){
			try {
				showMenu();
		        num = input.nextInt();  
		        switch(num) {
		        case 1:
		        	TrainningManager.AddTrainning();
		        	break;
		        case 2:
		        	TrainningManager.DeleteTrainning();
		        	break;
		        case 3:
		        	TrainningManager.EditTrainning();
		        	break;
		        case 4:
		        	TrainningManager.ViewTrainning();
		        	break;
		        default:
		        	continue;
		        }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1-5");
				if(input.hasNext()) {
					input.next();
				}
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("1. Add Trainning Program");
	    System.out.println("2. Delete Trainning Program");
	    System.out.println("3. Edit Trainning Program");
        System.out.println("4. View Trainning Program");
        System.out.println("5. Exit");
        System.out.print("Select one number between 1-5 : ");
	}
	
}

