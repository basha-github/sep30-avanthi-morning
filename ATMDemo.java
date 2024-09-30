import java.io.IOException;
import java.util.Scanner;

public class ATMDemo {
	static int balance = 5000;
	static Scanner takeData = new Scanner(System.in);

	private static void doProcess(int opt) {
		int amt;
		switch (opt) {
		case 1:
			System.out.println("Please enter amount to Deposit");
			amt = takeData.nextInt();
			balance = balance + amt;
			System.out.println("Successfully Deposited Amount..." + amt);
			break;
		case 2:
			System.out.println("Please enter amount to WithDraw");
			amt = takeData.nextInt();
			balance = balance - amt;
			System.out.println("Successfully WithDrawn Amount..." + amt);
			break;
		case 3:
			System.out.println("AVL Balance Amount....." + balance);
			break;
		default:
			System.out.println("please select correct Option");
		}

	}

	public static void main(String[] args) throws IOException {
		char ch;
		do {
			System.out.println("1.Deposit");
			System.out.println("2.WithDraw");
			System.out.println("3.CheckBalance");
			int opt = takeData.nextInt();
			doProcess(opt);
			System.out.println("do u want to repeat");
			ch = takeData.next().charAt(0);

		} while (ch == 'y');
		System.out.println("Program Ends");

	}

}
