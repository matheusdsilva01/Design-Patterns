package digital.house.flyweight.dto;

import digital.house.flyweight.factory.ArvoreFactory;
import java.util.ArrayList;
import java.util.List;

public class FlorestaDTO {

	private static final List<ArvoreDTO> ARVORE = new ArrayList<>();

	public void plantarArvore(final String tipoArvore, final int altura, final int largura, final String cor) {
		final ArvoreDTO arvore = ArvoreFactory.getTreeType(tipoArvore, altura, largura, cor);
		ARVORE.add(arvore);
	}

	public List<ArvoreDTO>  getArvores(){
		return ARVORE;
	}
}