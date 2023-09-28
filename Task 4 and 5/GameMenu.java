import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{

	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions){
		this.actions = new ArrayList<>(actions);

	}
	public void displayMenu(){

		for(String items: actions){
			System.out.println(items);
		}

		
	}
	public String getAction(){
		System.out.println("Type a number to choose an action");
		for(String options: actions)
			System.out.println(options);
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		return choice;
	}
}