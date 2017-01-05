package com;

import java.util.*;
import java.io.*;

public class Add {
	public static void add() {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter name of file: ");
		String name = in.nextLine().toLowerCase().trim();

		try {
			File file = new File("D:\\Database\\" + name + ".txt\\");
			BufferedWriter bw = new BufferedWriter(new FileWriter(
					file.getAbsoluteFile(), true));

			Scanner in1 = new Scanner(System.in);
			System.out.print("Enter informations: ");
			String info = in1.nextLine();

			bw.append(name.substring(0, 1).toUpperCase()
					+ name.substring(1).toLowerCase());
			bw.newLine();
			bw.newLine();
			bw.append(info);
			bw.close();

			System.out.println("\nWrote...\n");
		} catch (Exception e) {
		}
	}
}
