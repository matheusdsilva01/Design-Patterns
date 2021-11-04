import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
	
    private static Map<String, Arvore> macFlyweight = new HashMap<>();

    Floresta floresta = new Floresta();
    public Arvore getArvore (int altura, int largura, String cor) {

        String id = cor;

        if (!macFlyweight.containsKey(id)) {

            macFlyweight.put(id, new Arvore(altura, largura, cor));
            floresta.addFloresta(new Arvore(altura,largura,cor));
            System.out.println("Arvore criado");
            
            return macFlyweight.get(id);
        }
        floresta.addFloresta(new Arvore(altura,largura,cor));
        System.out.println("Arvore obtida");
        System.out.println(floresta.qtsArvores());
        return macFlyweight.get(id);
    }
}
