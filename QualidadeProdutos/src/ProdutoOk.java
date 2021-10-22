public class ProdutoOk extends Handler{

	@Override
	public void verificar(Produto produto) {
		System.out.println("Produto: '"+produto.getNome()+ "' está Ok");
	}

}
