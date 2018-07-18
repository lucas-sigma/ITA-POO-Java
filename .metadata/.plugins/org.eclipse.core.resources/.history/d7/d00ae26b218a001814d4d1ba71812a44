package imc;

public class Paciente {
	double peso, altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double calcularIMC() {
		return (getPeso() / (getAltura() * getAltura()));
	}

	public String diagnostico() {
		if (calcularIMC() < 16)
			return "Baixo peso muito grave";
		else if (calcularIMC() > 16 && calcularIMC() < 16.99)
			return "Baixo peso grave";
		else if (calcularIMC() > 17 && calcularIMC() < 18.49)
			return "Baixo peso";
		else if (calcularIMC() > 18.5 && calcularIMC() < 24.99)
			return "Peso normal";
		else if (calcularIMC() > 25 && calcularIMC() < 29.99)
			return "Sobrepeso";
		else if (calcularIMC() > 30 && calcularIMC() < 34.99)
			return "Obesidade grau I";
		else if (calcularIMC() > 35 && calcularIMC() < 39.99)
			return "Obesidade grau II";
		return "Obesidade grau III (obesidade mórbida)";
	}
}
