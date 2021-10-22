public abstract class Documento {
	public Documento seguinteMembro;
	
	public abstract void Documento(String conteudo,String tipo);

	public Documento setSeguinteFuncionario(Documento seguinteMebro) {
		this.seguinteMembro = seguinteMebro;
		return this;
    }
	
}
