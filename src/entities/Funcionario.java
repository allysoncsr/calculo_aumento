package entities;

public class Funcionario {
	
		// declarado abaixo os atributos da class que receberão os valores imputados pelo usuário 
	
	public String nome;
	public double salarioB;
	public double imposto;
	
	public double salarioLiquido() {
		double calc = (imposto * salarioB) / 100;
		return salarioB - calc;
	}

		// criado uma class chamada incremento
	
	public double incremento(double salarioB) {
		this.salarioB += salarioB; // foi utilizado o this que serve para referenciar que o salarioB (azul)é o la de cima, que é diferente do salarioB (marron) que irá ser recebido
		return (imposto / 100) * salarioB;
	}
	
	public String toString() {
		return nome
			+ " | " 
			+ salarioB;
	}
	
	
}
