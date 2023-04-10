package com.dal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.dal.model.EmpDetials;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int x = 0, y = 0, z = 0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter x:");
			x = Integer.parseInt(br.readLine());
			System.out.println("enter y");
			y = Integer.parseInt(br.readLine());
			z=x+y;
			System.out.println("Z :"+ z);
			}
		catch(Exception ex)
		{
			System.out.println("exception");
		}
	}

}
