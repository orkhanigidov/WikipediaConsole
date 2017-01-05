package com;

import java.util.*;
import java.io.*;

public class Search {
	static String name;

	public static void search() {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter name of file: ");
			name = in.nextLine().toLowerCase().trim();

			FileReader file = new FileReader("D:\\Database\\" + name + ".txt");
			BufferedReader br = new BufferedReader(file);

			System.out.println("Information");
			System.out.println("------------");
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		} catch (Exception e) {
			System.out.println("\nNot found...\n");
			new Menu().backToMenu();
		}
		new Menu().showEditAndDeleteMenu();
	}
}
