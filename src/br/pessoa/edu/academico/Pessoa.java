package br.pessoa.edu.academico;

public abstract class Pessoa {
	private String nome;
	private char sexo;
	private String dataNascimento;
	private String localNascimento;
	private String cpf;


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", localNascimento="
				+ localNascimento + ", cpf=" + cpf + "]" + "CALCULO: " + calcularPagamento() + "Pontuação:" + pontuacao();
	}
	
	public abstract double pontuacao();
	
	public abstract double calcularPagamento();

	public Pessoa(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// setando o nome de pessoa no atributo nome por meio de encapsulamento.

}
