package entrega_introducao;

import java.util.*;


public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a idade do cidadão: ");
		int idade = sc.nextInt();
		
		if (idade < 16)
			System.out.println("Eleitor não apto a votar!");
		else if (idade < 18)
			System.out.println("Eleitor voto facultativo!");
		else if (idade < 70)
			System.out.println("Eleitor voto obrigatório!");
		else if (idade > 70)
			System.out.println("Eleitor voto facultativo!");
		}
	}