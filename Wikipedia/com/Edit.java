package com;

import java.util.*;
import java.io.*;

public class Edit {
	public static void edit() {
		try {
			Runtime runtime = Runtime.getRuntime();
			Process pro = runtime.exec("notepad " + "D:\\Database\\"
					+ new Search().name + ".txt");
		} catch (Exception e) {
		}
	}
}
