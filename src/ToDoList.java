import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;

import java.util.ArrayList;
import java.util.Collection;

public class ToDoList {

	private HashMap<String, Task> tasks = new HashMap<String, Task>();
	
	public void addTask (Task task) {
		tasks.put(task.getDescription(), task);
		
	}
	public void completeTask(String description) {
		Task task = null;
		if ((task = tasks.get(description)) != null){
			task.setComplete(true);
		};
	}
	public boolean getStatus(String description) {
		Task task = null;
		if ((task = tasks.get(description)) != null){
			return task.isComplete();
		};
		return false;
	}
	public Task getTask(String description) {
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();
	}
	public Collection<Task> getCompletedTasks() {
		Collection<Task> completedTasks = new ArrayList<Task> ();
		Collection<Task> allTasks = new ArrayList<Task> ();
		allTasks = getAllTasks();
		for (Task task: allTasks) 
			if (task.isComplete() == true) completedTasks.add(task);
		return completedTasks;
	}

	
	// test
	

	public static void main(String[] args) {
		ToDoList todoList = new ToDoList();
		System.out.println("Enter \n 1 - to add task \n 2 - to show all task");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Your tasks are " + todoList.getAllTasks());
		System.out.println("Enter what task to add: ");
		s = in.nextLine();
		Task theTask = new Task(s);
		todoList.addTask(theTask);
		Collection<Task> alltasks = todoList.getAllTasks();


		Iterator iterator = alltasks.iterator();

		// while loop
		while (iterator.hasNext()) {
			Task t = (Task) iterator.next();
			System.out.println("Your tasks are " + t.getDescription());

		}
		System.out.println("Enter more task to add: ");
		s = in.nextLine();
		theTask = new Task(s);
		todoList.addTask(theTask);
		
		alltasks = todoList.getAllTasks();

		iterator = alltasks.iterator();

		// while loop
		while (iterator.hasNext()) {
			Task t = (Task) iterator.next();
			System.out.println("Your tasks are " + t.getDescription());
		}
	}
}


