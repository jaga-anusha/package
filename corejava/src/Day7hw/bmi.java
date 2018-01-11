package Day7hw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bmi {
	File file = new File ("student3.txt");
	

	private static final String FILENAME = ".txt";

	public static void main(String[] args) {

		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			String content = "This is the content to write into file\n";
Scanner input =new Scanner(System.in);
System.out.println("enter your name");
String s= input.nextLine();

System.out.println("enter your height");
int i = input.nextInt();

		//	bw.write(String.valueOf(i));
			//bw.write(s);

			// no need to close it.
			//bw.close();

			System.out.println("Done");

		} //catch (IOException e) {

			//e.printStackTrace();

		//}

	}

//}