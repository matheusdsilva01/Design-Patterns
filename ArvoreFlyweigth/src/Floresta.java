import java.util.ArrayList;

public class Floresta {
	ArrayList<Arvore>floresta= new ArrayList() ;
	
	public Floresta() {
		this.floresta = floresta;
	}
	
	public void addFloresta(Arvore arvore) {
		floresta.add(arvore);
	}
	
	public String qtsArvores() {
		return "O numero de arvores plantadas é: " + floresta.size();
	}
}
