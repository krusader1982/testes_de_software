package entrega_introducao;

import java.util.*;


public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a idade do cidad�o: ");
		int idade = sc.nextInt();
		if (idade < 16)
			System.out.println("Voc� n�o est� habilitado a votar!");
		else
			System.out.println("Eleitor! Exer�a o seu direito!");
		}
	}