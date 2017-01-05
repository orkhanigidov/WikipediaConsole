package com;

import java.util.*;
import java.io.*;

public class Delete {
	public static void delete() {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("------------------");
			System.out.println("Are you sure?");
			System.out.println("1 - Yes");
			System.out.println("2 - No");
			System.out.println("------------------");
			System.out.print("Enter: ");
			int n = in.nextInt();

			if (n == 1) {
				File file2 = new File("D:\\Database\\" + (new Search().name)
						+ ".txt\\");

				if (file2.delete())
					System.out.println("\nDeleted...\n");
			}
			if (n == 2) {
				new Menu().backToMenu();
			}

		} catch (Exception e) {
		}
	}
}
