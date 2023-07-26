package br.pessoa.edu.academico;

public class Professor extends Pessoa {
	public Professor(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + ", toString()=" + super.toString() + "]";
	}

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	@Override
	public double calcularPagamento() {
		// TODO Auto-generated method stub
		double pagamento = 10000;
		return pagamento;
	}

	@Override
	public double pontuacao() {
		return 12;
	}

}