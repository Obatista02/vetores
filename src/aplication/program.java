package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.armazenar;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		armazenar[] vect = new armazenar[n];
		
		for(int i = 0; i <n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i]= new armazenar(name, price);
		}
		double soma = 0;
		for (int i = 0; i<n; i++) {
			soma += vect[i].getPrice();
		}
		double media = soma /n;
		
		System.out.printf("Media dos preços: %.2f%n",media);

		sc.close();
	}

}
