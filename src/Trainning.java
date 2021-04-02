
public class Trainning {
    String Trainning;
    int Reps;
    int Sets;
    
    public Trainning() {
    	
    }
    
    public Trainning(String Trainning) {
    	this.Trainning = Trainning;
       
    }
        
    public Trainning(String Trainning , int Reps, int Sets) {
    	this.Trainning = Trainning;
        this.Reps = Reps;
        this.Sets = Sets;
    }
    
    public void printInfo() {
    	System.out.println("Trainning : " + Trainning+ ", Reps : " + Reps + ", Sets : " + Sets);
    	
    }
}
