package imc;

public class Principal {
	

	public static void main(String[] args) {
		Paciente p1 = new Paciente(45.54, 1.76);
		Paciente p2 = new Paciente(54.6, 1.81);
		Paciente p3 = new Paciente(87.8, 1.55);
		
		System.out.println(p1.calcularIMC());
		System.out.println(p1.diagnostico());
		
		System.out.println(p2.calcularIMC());
		System.out.println(p2.diagnostico());

		System.out.println(p3.calcularIMC());
		System.out.println(p3.diagnostico());

	}

}
