public class Produto {
	private String nome;
	private int lote;
	private int peso;
	private String embalagem;

	public Produto(String nome, int lote, int peso, String embalagem) {
		this.nome = nome;
		this.lote = lote;
		this.peso = peso;
		this.embalagem = embalagem;
	}

	public String getNome() {
		return nome;
	}

	public int getLote() {
		return lote;
	}

	public int getPeso() {
		return peso;
	}

	public String getEmbalagem() {
		return embalagem;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}

}
