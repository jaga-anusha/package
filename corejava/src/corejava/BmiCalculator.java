package corejava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class BmiCalculator {

	static int Weight;
	static String name;
	static int Height;

	public static void main(String[] args) {

		File file = new File("student.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		writeData();

		double bmi = bmi();

		printbmivalu(bmi);

	}

	public static void writeData() {

		char[] in = new char[50];
		int size = 0;
		try {
			File file = new File("fileWrite2.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			bw.write(name);
			bw.write(String.valueOf(Weight));
			bw.write(String.valueOf(Height));
			bw.flush();
			bw.close();

			// FileWriter fw = new FileWriter(file);
			// fw.write(Weight);

			// fw.flush();
			// fw.close();

			// FileReader fr =

			// new FileReader(file);
			// size = fr.read(in);
			// System.out.print(size + " ");
			// for(char c : in)
			// System.out.print(c);
			// fr.close();

			/*
			 * BufferedReader br =
			 * 
			 * new BufferedReader(new FileReader(file)); size = br.read(in);
			 * System.out.print(size + " "); for(char c : in)
			 * System.out.print(c); br.close();
			 */

		} catch (IOException e) {
		}
	}

	public static double bmi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Weight");
		int weight = scanner.nextInt();

		System.out.println("Enter your name");
		String name = scanner.next();

		System.out.println("Enter your Height");
		int height = scanner.nextInt();
		double bmi = weight / (height * height);

		System.out.println(bmi);
		return bmi;
	}

	public static void printbmivalu(double bmi) {
		if (bmi < 20) {

			System.out.println("Thin");

		} else if (bmi >= 20 && bmi <= 25) {

			System.out.println("Less Weight");

		} else if (bmi > 25 && bmi < 30) {

			System.out.println("Normal");

		} else if (bmi >= 35) {

			System.out.println("Obese");
		}
	}

}
