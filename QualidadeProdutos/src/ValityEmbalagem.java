public class ValityEmbalagem extends Handler {

	@Override
	public void verificar(Produto produto) {
		if (produto.getEmbalagem().equals("saudavel") || produto.getEmbalagem().equals("quase saudavel")) {
			System.out.println("Embalagem Ok");
			if(this.getSeguinte() != null){
                this.getSeguinte().verificar(produto);
            }
		} else {
			System.out.println("Erro na Embalagem do produto: "+produto.getNome());
		}
	}

}
