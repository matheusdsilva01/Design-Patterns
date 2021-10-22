public class Afiliado extends Vendedor {

	public Afiliado(String nome) {
		super.nome = nome;
		super.PONTOS_POR_VENDA = 15;
	}

	@Override
	public int calcularPontos() {
		return this.vendas * PONTOS_POR_VENDA;
	}

	@Override
	protected String getNomeCategoria(int pontosVendedor) {
		if (pontosVendedor < 20) {
			return "vendedor novato";
		} else if (pontosVendedor < 31) {
			return "vendedor aprendiz";
		} else if (pontosVendedor < 41) {
			return "vendedor bom";
		} else {
			return "vendedor mestre";
		}
	}

}
