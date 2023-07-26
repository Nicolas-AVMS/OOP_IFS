package br.pessoa.edu.academico;

public class Reitor extends Pessoa {
	public Reitor(String nome, String cpf) {
		super(nome, cpf);
	}

	private double salario;
	private String universidade;

	@Override
	public String toString() {
		return "Reitor [salario=" + salario + ", universidade=" + universidade + ", phd=" + phd + ", toString()="
				+ super.toString() + "]";
	}

	private String phd;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public String getPhd() {
		return phd;
	}

	public void setPhd(String phd) {
		this.phd = phd;
	}

	@Override
	public double calcularPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pontuacao() {
		// TODO Auto-generated method stub
		return 1;
	}

}
