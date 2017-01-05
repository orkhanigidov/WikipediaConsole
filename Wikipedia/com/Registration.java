package com;

import java.util.*;
import java.io.*;

public class Registration {
	private static Scanner in;
	static int code = 0;

	// Enter Registration
	public static void enterValues(RegisterSetAndGet ob) {
		in = new Scanner(System.in);

		try {
			System.out.print("Name: ");
			ob.setName(in.nextLine());

			System.out.print("Surname: ");
			ob.setSurname(in.nextLine());

			System.out.print("Username: ");
			ob.setUsername(in.next());

			checkUsername(ob);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Write to database
	public static void writeToDatabase(RegisterSetAndGet ob) {

		try {
			File file = new File("D:\\Registration.txt\\");
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			if ((ob.getPassword()).equals(ob.getRePassword())
					&& (ob.getCode() == code)
					&& (ob.getPassword().length() >= 8)) {

				bw.newLine();
				bw.append("--------------------");
				bw.newLine();
				bw.newLine();
				bw.append("User:" + ob.getUsername());
				bw.newLine();
				bw.append(ob.getUsername() + "::");
				bw.append(ob.getPassword());
				bw.newLine();
				bw.append("Name: " + ob.getName());
				bw.newLine();
				bw.append("Surname: " + ob.getSurname());
				bw.newLine();
				bw.append("E-mail: " + ob.getEmail());
				bw.close();
				System.out.println("\nSuccesfully");
				new Menu().showSearchAndAddMenu();
			} else {
				if (!ob.getPassword().equals(ob.getRePassword())) {
					System.out.println("\nPassword didn't match, retry please\n");
				}
				else if(ob.getCode() != code){
					System.out.println("\nCode didn't match, retry please\n");
				}
				else if(ob.getPassword().length() < 8){
					System.out.println("\nPassword is short, retry please\n");
				}
				new Menu().showLoginAndRegistrationMenu();
			}
		} catch (Exception e) {
		}
	}

	public static void checkUsername(RegisterSetAndGet ob) {
		in = new Scanner(System.in);
		Random random = new Random();

		try {
			FileReader fr = new FileReader("D:\\Registration.txt\\");
			BufferedReader br = new BufferedReader(fr);

			boolean check = true;
			String find = ("User:").concat(ob.getUsername());
			String line = "";

			while ((line = br.readLine()) != null) {
				if (find.equals(line))
					check = false;
			}

			if (check == false) {
				System.out
						.println("\nThis username already has used, please again\n");
				enterValues(ob);
			} else {
				System.out.print("E-mail:");
				ob.setEmail(in.next());

				System.out.println("\nMinimum length of password must be 8");
				System.out.print("Password: ");
				ob.setPassword(in.next());

				System.out.print("Confirm password: ");
				ob.setRePassword(in.next());

				// Security Code
				code = random.nextInt(1000000) + 1;
				System.out.println("Security code: " + code);
				System.out.print("Code: ");
				ob.setCode(in.nextInt());
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
}
