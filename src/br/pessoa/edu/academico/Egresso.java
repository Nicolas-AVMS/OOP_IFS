package br.pessoa.edu.academico;

public class Egresso extends Aluno {
	public Egresso(String nome, String cpf) {
		super(nome, cpf);
	}

	// Ano de formatura, profissão atual, empresa atual, estado em que trabalha.
	private int anoFormatura;
	private String profissaoAtual;
	private String empresaAtual;
	private String estadoTrabalho;

	@Override
	public String toString() {
		return "Egresso [anoFormatura=" + anoFormatura + ", profissaoAtual=" + profissaoAtual + ", empresaAtual="
				+ empresaAtual + ", estadoTrabalho=" + estadoTrabalho + ", toString()=" + super.toString() + "]";
	}

	public int getAnoFormatura() {
		return anoFormatura;
	}

	public void setAnoFormatura(int anoFormatura) {
		this.anoFormatura = anoFormatura;
	}

	public String getProfissaoAtual() {
		return profissaoAtual;
	}

	public void setProfissaoAtual(String profissaoAtual) {
		this.profissaoAtual = profissaoAtual;
	}

	public String getEmpresaAtual() {
		return empresaAtual;
	}

	public void setEmpresaAtual(String empresaAtual) {
		this.empresaAtual = empresaAtual;
	}

	public String getEstadoTrabalho() {
		return estadoTrabalho;
	}

	public void setEstadoTrabalho(String estadoTrabalho) {
		this.estadoTrabalho = estadoTrabalho;
	}
	
	public double calcularPagamento() {
		return 0;
	}
	
	@Override
	public double pontuacao() {
		return 5;
	}
}