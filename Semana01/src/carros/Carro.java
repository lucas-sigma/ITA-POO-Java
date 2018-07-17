package carros;

public class Carro {
	int potencia, velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade /= 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O carro " + nome + " está a velocidade de " + getVelocidade() + " Km/h.");
	}
}
