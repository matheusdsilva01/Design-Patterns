public class ValityLote extends Handler {

	@Override
	public void verificar(Produto produto) {
		if (produto.getLote() > 1000 && produto.getLote() < 2000) {
			System.out.println("Lote Ok");
            if(this.getSeguinte() != null){
                this.getSeguinte().verificar(produto);
            }
		} else {
			System.out.println("Erro no Lote do produto: "+produto.getNome());
		}

	}

}
