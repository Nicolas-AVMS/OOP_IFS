package br.pessoa.edu.academico;

public class Tecnico extends Pessoa {
	public Tecnico(String nome, String cpf) {
		super(nome, cpf);
	}

	private String cargo;
	private String setor;
	private String campus;

	@Override
	public String toString() {
		return "Tecnico [cargo=" + cargo + ", setor=" + setor + ", campus=" + campus + ", toString()="
				+ super.toString() + "]";
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Override
	public double calcularPagamento() {
		double pagamento = 3000;
		return pagamento;
	}

	@Override
	public double pontuacao() {
		return 2;
	}

}