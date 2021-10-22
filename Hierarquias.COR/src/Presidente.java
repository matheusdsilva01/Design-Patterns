public class Presidente extends Documento {

	@Override
	public void Documento(String conteudo, String tipo) {
		if (tipo.equals("3")) {
			System.out.println("Meu tipo de documento é: 3 sou Presidente e posso ler o documento: " + conteudo);
		} else if (this.seguinteMembro != null) {
			this.seguinteMembro.Documento(conteudo,tipo);
		}

	}

}
