import java.util.Scanner;

public class Task {
	private String description = null;
	private boolean isComplete = false;
	
	
	public Task(String description) {
		super();
		this.description = description;
	}
	
	public Task(String description, boolean isComplete) {
		super();
		this.description = description;
		this.isComplete = isComplete;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 1 to add task \n 2 to show all task");
		Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Enter what task to add "+s);
               
	}

}
