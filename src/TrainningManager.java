import java.util.Scanner;

public class TrainningManager {
	Trainning trainning;
	Scanner input;
	TrainningManager(Scanner input){
		this.input = input;
	}
		
		
	public void AddTrainningProgram() {		
        trainning = new Trainning();		
		Scanner input = new Scanner(System.in);
		System.out.print("TrainningProgram : ");
		trainning.Trainning = input.next();
		System.out.print("Reps: ");
		trainning.Reps= input.nextInt();
		System.out.print("Sets: ");
		trainning.Sets = input.nextInt();
	}
	public void DeleteTrainningProgram() {
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
		if(trainning.equals(null)) {
			System.out.println("the trainning  has not been registerd");
		}
		if(trainning.Trainning.equals(Trainning)){
			trainning = null;
			System.out.println("the trainning is Deleted");		
		}
	}
		
    public void EditTrainningProgram() {
    	System.out.print("TrainningProgram : ");
    	String Trainning = input.next();
    	if(trainning.Trainning.equals(Trainning)) {
    		System.out.println("the trainning to be edited is " +trainning);
    	}
	}
    public void ViewTrainningProgram() {
		System.out.print("TrainningProgram : ");
		String Trainning = input.next();
		if(trainning.Trainning.equals(Trainning)) {
			trainning.printInfo();
		}
	  }
	    
	
}


