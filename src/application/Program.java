package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("DIGITE OS DADOS DO FUNCIONARIO");
		System.out.println("Digite o Nome Completo: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Digite o Salário Bruto: ");
		funcionario.salarioB = sc.nextDouble();
		System.out.println("Digite o imposto sobre o Salário Bruto: ");
		funcionario.imposto = sc.nextDouble();
		
		
		System.out.println("DADOS ATUALIZADOS DO FUNCINÁRIO");
		System.out.println("FUNCIONÁRIO(A): " + funcionario.nome + " | SALÁRIO: " + funcionario.salarioLiquido());
		
		System.out.println("Digite o valor do incremento do salário: ");
		Double salarioB = sc.nextDouble();
		funcionario.incremento(salarioB);
		
		System.out.println("DADOS ATUALIZADOS DO FUNCINÁRIO");
		System.out.println(funcionario);

		sc.close();
	}

}
