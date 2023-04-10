package com.dal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		System.out.println("From User Not Found Exception");
	}
}

public class MyMainClass {

	public static void main(String[] args) throws IOException {
		String uname = null;
		String pwd = null;
		try {
			int x = 0, y = 0, z = 0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter uname:");
			x = Integer.parseInt(br.readLine());
			System.out.println("enter psd");
			y = Integer.parseInt(br.readLine());
			z = x + y;
			System.out.println("Z :" + z);

			if (uname.equals("salo") && pwd.equals("pass")) {
				System.out.println("welcome" + uname);
			} else {
				throw new UserNotFoundException();
			}
		} catch (Exception ex) {
			System.out.println("expect");
		}
	}
}
