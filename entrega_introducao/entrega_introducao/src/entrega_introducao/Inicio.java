package entrega_introducao;

import java.util.*;


public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a idade do cidadão: ");
		int idade = sc.nextInt();
		if (idade < 16)
			System.out.println("Você não está habilitado a votar!");
		else
			System.out.println("Eleitor! Exerça o seu direito!");
		}
	}