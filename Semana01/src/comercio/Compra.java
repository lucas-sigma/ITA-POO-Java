package comercio;

public class Compra {
	int valorTotal, numeroParcelas;
	
	// a vista
	public Compra(int valor) {
		valorTotal = valor;
		numeroParcelas = 1;
	}
	
	// parcelado
	public Compra(int valorParcela, int qtdParcelas) {
		valorTotal = valorParcela * qtdParcelas;
		numeroParcelas = qtdParcelas;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public int getValorParcela() {
		return valorTotal / numeroParcelas;
	}

}
