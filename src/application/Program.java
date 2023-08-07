package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da Conta");
		
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();		
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();				
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();
		
		Conta cont = new Conta(numero, titular, saldo, limiteSaque);		
		System.out.println();
		System.out.print("Informe a quantia para sacar: ");
		double quantia = sc.nextDouble();
		
		try {
			cont.saque(quantia);
			System.out.printf("Novo saldo: %.2f%n", cont.getSaldo());		
		}		
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();

	}

}
