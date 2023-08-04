package br.pessoa.edu.academico;

import java.util.ArrayList;

public class Aluno extends Pessoa {

	public Aluno(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	
		
	ArrayList<Double> listaNota = new ArrayList<Double>();
	public ArrayList<Double> getListaNota() {
		return listaNota;
	}
	
	public void setListaNota(ArrayList<Double> listaNota) {
		this.listaNota = listaNota;
	}
	
	private double media() {
		double media = 0;
		
		for (double nota : listaNota) {
			media += nota;
		}
		media /=listaNota.size();
		return media;
	}
	


	@Override
	public String toString() {
		return "Aluno [media=" + (media())
				+ ", listaNota=" + listaNota + ", toString()=" + super.toString()+
				"]"+"\n";
	}

	@Override
	public double calcularPagamento() {
		double pagamento = 180;
		if(media()>=6) {
			return pagamento;
		} else {
			return pagamento/2;
		}
	}

	@Override
	public double pontuacao(){
		double pontuacao = media();
		if(pontuacao>=7) {
			
			return pontuacao*2.8;
			
		} else {
			return 0;
		}
	}
	
}