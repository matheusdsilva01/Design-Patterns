public class Fluxo {
	Handler inicial;

	public Fluxo() {
		this.inicial = new ValityLote();
		Handler embalagem = new ValityEmbalagem();
		Handler peso = new ValityPeso();
		Handler produtoOk = new ProdutoOk();
		inicial.setSeguinte(embalagem);
		embalagem.setSeguinte(peso);
		peso.setSeguinte(produtoOk);
	}

	public void verificar(Produto x) {
		inicial.verificar(x);
	}
}
