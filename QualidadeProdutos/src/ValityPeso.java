public class ValityPeso extends Handler {

	@Override
	public void verificar(Produto produto) {
		if (produto.getPeso() > 1200 && produto.getPeso() < 1300) {
			System.out.println("Peso Ok");
			if(this.getSeguinte() != null){
                this.getSeguinte().verificar(produto);
            }
		} else {
			System.out.println("Erro no Peso do produto: "+produto.getNome());
		}
	}

}
