public class Main {
	public static void main(String[] args) {
		ArvoreFactory arv = new ArvoreFactory();
		Arvore ornamental = arv.getArvore(200,400,"Azul");
		Arvore frutifera = arv.getArvore(500, 300, "Vermelha");
		Arvore ornamental1 = arv.getArvore(200,400,"Azul");
	}
}
