package br.pessoa.edu.academico;

public class Pedagoga extends Pessoa {
	public Pedagoga(String nome, String cpf) {
		super(nome, cpf);
	}

	private int registro;

	@Override
	public String toString() {
		return "Pedagoga [registro=" + registro + ", toString()=" + super.toString() + "]";
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	@Override
	public double calcularPagamento() {
		double pagamento = 12000;
		return pagamento;
	}

	@Override
	public double pontuacao() {
		// TODO Auto-generated method stub
		return 1;
	}

}
