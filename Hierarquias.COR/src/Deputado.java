public class Deputado extends Documento {

	@Override
	public void Documento(String conteudo, String tipo) {
		if (tipo.equals("1")) {
			System.out.println("Meu tipo de documento é: 1 sou Deputado e posso ler o documento: " + conteudo);
		} else if (this.seguinteMembro != null) {
			this.seguinteMembro.Documento(conteudo,tipo);
		}

	}

}
