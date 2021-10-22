import java.util.ArrayList;

public class Funcionario extends Vendedor {
	private int anosAntiguidade;

	private ArrayList<Vendedor> afiliados = new ArrayList<>();

	public Funcionario(String nome, int anosAntiguidade) {
		super.nome = nome;
		super.PONTOS_POR_VENDA = 5;
		this.anosAntiguidade = anosAntiguidade;
	}

	// Adicionar um afiliado ao funcionario, e por sua vez soma os pontos
	public void addAfiliado(Vendedor afiliado) {
		this.afiliados.add(afiliado);
	}

	@Override
	public int calcularPontos() {
		return (this.afiliados.size() * 10) + (this.anosAntiguidade * 5) + (this.vendas * 5);
	}

	@Override
	protected String getNomeCategoria(int pontosVendedor) {
		if (pontosVendedor < 20) {
			return "vendedor novato";
		} else if (pontosVendedor < 31) {
			return "vendedor aprendiz";
		} else if (pontosVendedor < 41) {
			return "vendedor bom";
		} else {
			return "vendedor mestre";
		}
	}

}
