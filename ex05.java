package problems;

import java.util.Locale;
import java.util.Scanner;

import entities.School;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		School grade = new School();
		
		System.out.print("Name: ");
		grade.name = sc.nextLine();
		
		grade.tri1 = sc.nextDouble();
		grade.tri2 = sc.nextDouble();
		grade.tri3 = sc.nextDouble();
		
		if (grade.pass() < 90.00)
		{
			System.out.print("Final grade: " + grade);
			System.out.println("FAILED");
			System.out.println("MISSING " + grade.failed() + " POINTS");
		} 
		else 
		{
			System.out.print("Final grade: " + grade);			
			System.out.println("PASS");
		}
		
		sc.close();
	}
}
