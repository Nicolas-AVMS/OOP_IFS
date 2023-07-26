package br.pessoa.edu.academico;

public class Psicologa extends Pessoa {

	public Psicologa(String nome, String cpf, String crp) {
		super(nome, cpf);
		this.setCrp(crp);
	}

	private String especialidade;
	private String crp;

	public String getEspecialidade() {
		return especialidade;
	}

	@Override
	public String toString() {
		return "Psicologa [especialidade=" + especialidade + ", crp=" + crp + ", toString()=" + super.toString() + "]";
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrp() {
		return crp;
	}

	public void setCrp(String crp) {
		this.crp = crp;
	}

	@Override
	public double calcularPagamento() {
		// TODO Auto-generated method stub
		double pagamento = 11000;
		return pagamento;
	}

	@Override
	public double pontuacao() {
		return 50;
	}
}