import java.util.Scanner;

public class Practice {
	
	public static void Fruit(String one) {
		if(one.equalsIgnoreCase("Strawberry") || one.equalsIgnoreCase("Apple") || one.equalsIgnoreCase("Blueberry")) {
			System.out.print("fruit");
		} else if( one.equalsIgnoreCase("Carrot") || one.equalsIgnoreCase("Squash") || one.equalsIgnoreCase("pepper")) {
			System.out.print("vegetables");
		} else {
			System.out.print("Invalid input");
		}
	}

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String food = in.next();
		Fruit(food);
	}
}
