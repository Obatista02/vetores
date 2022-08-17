package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.alturas;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		alturas[] vect = new alturas[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vect[1] = new alturas(name, idade, altura);

		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getAltura();
		}
		int menor = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				menor++;
			}
		}
		double media = soma / n;

		double porcentagem = ((double) menor / n) * 100;

		System.out.printf("\nAltura media = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}

		sc.close();
	}

}
