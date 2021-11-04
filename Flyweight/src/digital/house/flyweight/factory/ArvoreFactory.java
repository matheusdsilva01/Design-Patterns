package digital.house.flyweight.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import digital.house.flyweight.dto.ArvoreDTO;

//é quem vai de fato criar os objetos do nosso flyweight
public class ArvoreFactory {
	static Map<String, ArvoreDTO> TIPO_ARVORES = new HashMap<>();

	public static ArvoreDTO getTreeType(final String tipoArvore, final int altura, final int largura, final String cor) {
		ArvoreDTO arvore = TIPO_ARVORES.get(tipoArvore);

		if (Objects.isNull(arvore)) {
			arvore = new ArvoreDTO(altura, largura, cor, tipoArvore);
			TIPO_ARVORES.put(tipoArvore, arvore);
			return arvore;
		}

		return arvore;
	}
}