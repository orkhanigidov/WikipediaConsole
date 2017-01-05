package com;

import java.io.*;
import java.util.*;

public class Login {
	public static void login(RegisterSetAndGet ob) {
		boolean check = false;

		try {
			FileReader fr = new FileReader("D:\\Registration.txt\\");
			BufferedReader br = new BufferedReader(fr);
			Scanner in = new Scanner(System.in);

			System.out.print("\nUsername: ");
			ob.setUsername(in.next());
			System.out.print("Password: ");
			ob.setPassword(in.next());

			String find = ob.getUsername().concat("::")
					.concat(ob.getPassword());

			String line;
			while ((line = br.readLine()) != null) {
				if (find.equals(line)) {
					check = true;
				}
			}
			
			if (check == true) {
				System.out.println("Successfully");
				new Menu().showSearchAndAddMenu();
			} else {
				System.out.println("Try again...\n");
				new Menu().showLoginAndRegistrationMenu();
			}

		} catch (Exception e) {
		}
	}
}
