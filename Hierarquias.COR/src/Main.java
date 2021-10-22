public class Main {
	public static void main(String[] args) {
		Documento handlerBase = new Deputado().setSeguinteFuncionario(new Ministro().setSeguinteFuncionario(new Presidente()));

		handlerBase.Documento("Aqui um documento nivel 2", "2");;
	}
}
