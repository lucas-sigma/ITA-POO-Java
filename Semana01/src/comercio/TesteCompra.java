package comercio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorParcela());
		assertEquals(500, c.getValorTotal());
	}
	
	@Test
	public void compraParcelado() {
		Compra c = new Compra(250, 4);
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(250, c.getValorParcela());
		assertEquals(1000, c.getValorTotal());
	}

}
