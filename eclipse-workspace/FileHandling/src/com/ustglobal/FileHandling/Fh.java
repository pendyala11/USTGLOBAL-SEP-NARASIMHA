package com.ustglobal.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class Fh{

	public static void main(String[] args) {

		String path = "C:\\Users\\Narasimha\\Desktop\\file1.txt.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			int i;
			while ((i = reader.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
