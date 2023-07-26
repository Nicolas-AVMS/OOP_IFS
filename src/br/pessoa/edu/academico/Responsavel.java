package br.pessoa.edu.academico;

public class Responsavel extends Pessoa {
	public Responsavel(String nome, String cpf) {
		super(nome, cpf);
	}

	private String filiacao;
	private String profissao;

	@Override
	public String toString() {
		return "Responsavel [filiacao=" + filiacao + ", profissao=" + profissao + ", toString()=" + super.toString()
				+ "]";
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Override
	public double calcularPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pontuacao() {
		return 1;
	}

}