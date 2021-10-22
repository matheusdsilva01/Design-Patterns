public abstract class Vendedor {
	protected String nome;
	protected int vendas = 0;
	protected int PONTOS_POR_VENDA;
	protected int pontosVendedor;

	public void vender(int qtdVendas) {
		this.vendas += qtdVendas;
	}

	public abstract int calcularPontos();

	public String mostrarCategoria() {
		int pontosDoVendedor = calcularPontos();
		return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como "
				+ getNomeCategoria(pontosDoVendedor);
	}

	// Transformando o metodo "getNomeCategoria" em abstract, para implementação do
	// estagiário, sendo assim cada tipo de vendedor vai ter sua categoria
	protected abstract String getNomeCategoria(int pontosVendedor);

}
