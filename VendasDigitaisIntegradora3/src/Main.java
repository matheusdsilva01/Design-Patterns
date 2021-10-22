public class Main {
	public static void main(String[] args) {
		Funcionario func1 = new Funcionario("Patricia Sprovieri", 3);
		func1.vender(2);

		Vendedor afi1 = new Afiliado("Arthur Ferreira");
		afi1.vender(4);

		Vendedor afi2 = new Afiliado("Samuel Xavier");
		afi2.vender(1);

		func1.addAfiliado(afi2);
		func1.addAfiliado(afi1);

		// Estagiario
		Estagiario estag1 = new Estagiario("Matheus Silva");
		estag1.vender(10);
		System.out.println(estag1.mostrarCategoria());

		// System.out.println(func1.mostrarCategoria());
		// System.out.println(afi1.mostrarCategoria());
		// System.out.println(afi2.mostrarCategoria());
	}
}
