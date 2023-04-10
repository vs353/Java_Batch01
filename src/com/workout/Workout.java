package com.workout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.dal.view.*;

public class Workout {
	
public void readFile() {
//	try {
//		FileInputStream fis =  new FileInputStream("C:\\Users\\vaishnavi.s\\OneDrive - Dedalus S.p.A\\New Folder\\demo.txt");
//		System.out.println("File generated");
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		System.out.println("expect");
//	}
	
	try {
		  //creating FileInputStream object.
		  File fis = 
                  new File("C:\\Users\\vaishnavi.s\\OneDrive - Dedalus S.p.A\\New Folder\\demo.txt");
//		  int i;
//		  //read file.
//		  while((i=fis.read())!=-1){
//			System.out.print((char)i);
//		  }
		  fis.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
