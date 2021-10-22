public class Ministro extends Documento {

	@Override
	public void Documento(String conteudo, String tipo) {
		if (tipo.equals("2")) {
			System.out.println("Meu tipo de documento é: 2 sou Ministro e posso ler o documento: " + conteudo);
		} else if (this.seguinteMembro != null) {
			this.seguinteMembro.Documento(conteudo,tipo);
		}

	}

}
