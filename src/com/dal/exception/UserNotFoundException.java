package com.dal.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserNotFoundException extends Exception {
  public UserNotFoundException() {
	  System.out.println("expect : user not found");
  }

}
