package com.srhna.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Import {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
	            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\jl79\\Documents\\GitHub\\srhna\\srhna\\src\\test\\java\\com\\srhna\\app\\test.txt"));
	            String str;
	            str = in.readLine();
	            while ((str = in.readLine()) != null) {
	                System.out.println(str);
	            }
	            in.close();
	        } catch (IOException e) {
	            System.out.println("File Read Error");
	        }
		

	}

}
