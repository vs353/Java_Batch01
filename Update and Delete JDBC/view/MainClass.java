package com.dal.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.dal.controller.EmployeeController;
import com.dal.controller.EmployeeInterface;
import com.dal.exception.UserNotFoundException;

public class MainClass {

	public static void main(String[] args) throws IOException, UserNotFoundException {
		String uname = null;
		String pwd = null;

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter uname:");
			uname = br.readLine();
			System.out.println("enter psd");
			pwd = br.readLine();

			BiPredicate<String, String> res = (un, pw) -> (un.contains("salo") && pw.contains("pass"));
			if (res.test(uname, pwd)) {

				System.out.println("welcome" + " " + uname);
				System.out.println("Welcome");
				EmployeeInterface ec = new EmployeeController();
				Scanner sc = new Scanner(System.in);
				String choice = null;
				do {
					System.out.println("Enter your choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Serialize Emplist");
					System.out.println("4. Deserialize Emplist");
					System.out.println("5. Sort Emp by ID");
					System.out.println("6. Sort by Emp name");
					System.out.println("7. Update Employee name");
					System.out.println("8. To delete Employee ");
					int ch = sc.nextInt();
					switch (ch) {
					case 1: {
						ec.addEmployee();
						break;
					}
					case 2: {
						ec.viewEmployee();
						break;
					}
					case 3: {
						ec.serializeEmp();
						break;
					}

					case 4: {
						ec.deserializeEmp();
						break;
					}
					case 5: {
						ec.sortByEid();
						break;
					}
					case 6: {
						ec.sortByEname();
						break;
					}
					case 7: {
						ec.updateEmp();
						break;
					}
					case 8: {
						ec.deleteEmp();
						break;
					}
					default: {
						System.out.println("Enter right choice");
						break;
					}
					}
					System.out.println("Do u want to continue Y or y");
					choice = sc.next();
				} while (choice.equals("Y") || choice.equals("y"));
				System.out.println("Exited");
				System.exit(0);

			}
			else {
				throw new UserNotFoundException();
			}
		} 
	}


