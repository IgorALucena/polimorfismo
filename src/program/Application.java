package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Fisica(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployess = sc.nextInt();
				list.add(new Juridica(name, anualIncome,numberEmployess));
			}
			
		}
		System.out.println("TAXES PAID: ");
		for(Pessoa c: list) {
				System.out.println(c);
		}
		
		double sum =0.0;
		for(Pessoa c:list) {
			sum+= c.calculoImposto();
			
		}
		
		System.out.print(String.format("TOTAL TAXER: $ %.2f", sum));
			
	
		
		sc.close();

	}

}
