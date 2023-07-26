package br.pessoa.edu.academico;

public class Pesquisador extends Pessoa {
	public Pesquisador(String nome, String cpf) {
		super(nome, cpf);
	}

	private String grupoPesquisa;
	private byte qtdArtigos;

	@Override
	public String toString() {
		return "Pesquisador [grupoPesquisa=" + grupoPesquisa + ", qtdArtigos=" + qtdArtigos + ", toString()="
				+ super.toString() + "]";
	}

	public String getGrupoPesquisa() {
		return grupoPesquisa;
	}

	public void setGrupoPesquisa(String grupoPesquisa) {
		this.grupoPesquisa = grupoPesquisa;
	}

	public byte getQtdArtigos() {
		return qtdArtigos;
	}

	public void setQtdArtigos(byte qtdArtigos) {
		this.qtdArtigos = qtdArtigos;
	}

	@Override
	public double calcularPagamento() {
		double pagamento = 15000;
		return pagamento;
	}

	@Override
	public double pontuacao() {
		return 90;
	}

}
