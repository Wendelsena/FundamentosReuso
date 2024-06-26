package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// o parametro T me permite dar um tipo de objeto.
		PrintService<Integer> psi = new PrintService<>();
		PrintService<String> pss = new PrintService<>();

		char x;

		System.out.print("String ou Integer? (s/i): ");
		x = sc.next().charAt(0);

		if (x == 's') {
			System.out.print("How many names? ");
			int n = sc.nextInt();

			sc.nextLine();

			for (int i = 0; i < n; i++) {
				System.out.print(": ");
				String value = sc.nextLine();
				pss.addValue(value);
			}

			pss.print();
			System.out.println("First: " + pss.first());
		} else if (x == 'i') {
			System.out.print("How many values? ");
			int n = sc.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.print(": ");
				int value = sc.nextInt();
				psi.addValue(value);
			}

			psi.print();
			System.out.println("First: " + psi.first());
		} else {
			System.out.println("Enter s or i!");
		}

		sc.close();

	}

}
