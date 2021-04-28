package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		System.out.printf("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List <Person> list = new ArrayList <>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.printf("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.printf("Name: ");
			String name = sc.next();
			
			System.out.printf("Annual income: ");
			double income = sc.nextDouble();
			
			if (ch == i) {
				System.out.printf("Health expenditures: ");
				double expend = sc.nextDouble();
				list.add(new Individual(name, income, expend));
				
			} else {
				System.out.println("Number of employees: ");
				int emp = sc.nextInt();
				list.add(new Company(name, income, emp));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Person lst : list) {
			System.out.println(lst.getName() + ": $ " + String.format("%.2f", lst.tax()));
		}

		System.out.println();
		double sum = 0.0;
		for (Person lst : list) {
			sum += lst.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}