package aplication;

import java.util.Locale;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS!");
		
		for(int i = 0; i<n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
