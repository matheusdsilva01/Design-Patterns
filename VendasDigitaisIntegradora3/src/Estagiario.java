public class Estagiario extends Vendedor {
	public Estagiario(String nome) {
		super.nome = nome;
		super.PONTOS_POR_VENDA = 5;
	}

	@Override
	public int calcularPontos() {
		return super.vendas * PONTOS_POR_VENDA;
	}

	@Override
	protected String getNomeCategoria(int pontosVendedor) {
		if (pontosVendedor < 50) {
			return "estagiario novato";
		} else {
			return "estagiário experiente";
		}
	}

}
