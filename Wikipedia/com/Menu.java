package com;

import java.util.*;
import java.io.*;

public class Menu {
	private static Scanner in;

	// Login and Registration menu
	public static void showLoginAndRegistrationMenu() {
		in = new Scanner(System.in);
		RegisterSetAndGet ob = new RegisterSetAndGet();

		System.out.println("     Wikipedia");
		System.out.println("-------------------");
		System.out.println("1 - Login");
		System.out.println("2 - Sign up");
		System.out.println("3 - Exit");
		System.out.println("-------------------");

		try {
			System.out.print("\nEnter:");
			int n = in.nextInt();

			if (n == 1)
				new Login().login(ob);
			if (n == 2) {
				new Registration().enterValues(ob);
				new Registration().writeToDatabase(ob);
			}
			if (n == 3) {
				System.out.println("Program closed...");
				System.exit(0);
			}
			if (n <= 0 || n > 3) {
				System.out.println("\nPlease choose 1-2-3\n");
				showLoginAndRegistrationMenu();
			}

		} catch (Exception e) {
			System.out.println("\nPlease choose 1-2-3\n");
			showLoginAndRegistrationMenu();
		}

	}

	// Search and Add menu
	public static void showSearchAndAddMenu() {
		in = new Scanner(System.in);
		RegisterSetAndGet ob = new RegisterSetAndGet();

		try {
			System.out.println("\n     Wikipedia");
			System.out.println("-------------------");
			System.out.println("1 - Search");
			System.out.println("2 - Add");
			System.out.println("3 - Sign out");
			System.out.println("4 - Exit");
			System.out.println("-------------------");
			System.out.print("\nEnter: ");
			int n = in.nextInt();

			if (n == 1) {
				new Search().search();
				backToMenu();
			}
			if (n == 2) {
				new Add().add();
				backToMenu();
			}
			if (n == 3) {
				showLoginAndRegistrationMenu();
				backToMenu();
			}
			if (n == 4) {
				System.out.println("Program closed...");
				System.exit(0);
			}
			if (n <= 0 || n >= 5) {
				System.out.println("\nPlease choose 1-2-3-4-5-6");
				showSearchAndAddMenu();
			}

		} catch (Exception e) {
			System.out.println("\nPlease choose 1-2-3-4-5-6");
			showSearchAndAddMenu();
		}
	}

	// Back menu
	public static void backToMenu() {
		in = new Scanner(System.in);
		try {
			do {
				System.out.println("---------------------");
				System.out.println("1 - Back to menu");
				System.out.println("2 - Exit");
				System.out.println("---------------------");
				System.out.print("\nEnter: ");
				int n = in.nextInt();

				if (n == 1)
					showSearchAndAddMenu();
				if (n == 2) {
					System.out.println("Program closed...");
					System.exit(0);
				}
				if (n >= 3 || n <= 0) {
					System.out.println("\nPlease choose 1 or 2\n");
					backToMenu();
				}

			} while (true);
		} catch (Exception e) {
			System.out.println("\nPlease choose 1-2");
			backToMenu();

		}
	}

	// Edit and Delete menu
	public static void showEditAndDeleteMenu() {
		System.out.println("---------------------");
		System.out.println("1 - Edit");
		System.out.println("2 - Delete");
		System.out.println("3 - Back to menu");
		System.out.println("4 - Exit");
		System.out.println("---------------------");
		System.out.print("\nEnter: ");
		int n = in.nextInt();

		if (n == 1)
			new Edit().edit();
		if (n == 2)
			new Delete().delete();
		if (n == 3)
			showSearchAndAddMenu();
		if (n == 4) {
			System.out.println("Program closed...");
			System.exit(0);
		}
		if (n >= 3 || n <= 0) {
			System.out.println("\nPlease choose 1 or 2\n");
			backToMenu();
		}
	}
}
