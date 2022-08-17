package aplication;

import java.util.Locale;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.print("Valores: ");

		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);
		}
		double soma= 0 ;
		
		for(int i = 0; i<n;i++) {
			soma+= vect[i];
		}
		double media = soma/n;
		
		System.out.println("Soma: "+ soma);
		System.out.println("Media: "+ media);
		sc.close();
	}

}
