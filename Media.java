package me.guiihcolusso;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, total, media;
		String status;
	
		
		java.util.Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite a Primeira Nota : ");
		n1 = scn.nextFloat();
		
		System.out.println("Digite a Segunda Nota : ");
		n2 = scn.nextFloat();
		
		System.out.println("Digite a Terceira Nota : ");
		n3 = scn.nextFloat();
		
		System.out.println("Digite a Quarta Nota : ");
		n4 = scn.nextFloat();
		
		
		scn.close();
		
		total = n1 + n2 + n3 + n4;
		media = total / 4;
		
		
		if (media <= 5) {
			status = ("Reprovou");			
		}else {
			status = ("Passou");
		}
		
		
		for (int i = 0; i < 100; ++i)  
		       System.out.println();  
		
		System.out.println("--------------------------------------------------");
		System.out.println("Sua Media É : " + media);
		System.out.println("O Valor Total de Suas Nota É : " + total);
		System.out.println("Status : " + status);
		System.out.println("--------------------------------------------------");

	}

}
