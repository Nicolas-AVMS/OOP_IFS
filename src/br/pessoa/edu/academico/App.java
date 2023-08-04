package br.pessoa.edu.academico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		/*
		 * MENU: 
		 * 1- Cadastrar Aluno
		 * 2- Listar Aluno 
		 * 3- Cadastrar Pesquisador 
		 * 4- Listar Pesquisador 
		 * 5- Cadastrar Professor 
		 * 6- Listar Professor 
		 * 7- Cadastrar Tecnico
		 * 8- Listar Tecnico 
		 * 9- Cadastrar Pedagoga 
		 * 10- Listar Pedagoga 
		 * 11- Cadastrar Psicologa 
		 * 12- Listar Psicologa 
		 * 13- Cadastrar Responsável 
		 * 14- Listar Responsável 
		 * 15- Cadastrar Egresso 
		 * 16- Listar Egresso 
		 * 17- Cadastrar Reitor 
		 * 18- Listar Reitor 
		 * 0- Sair
		 */
		
		
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		ArrayList<Pesquisador> listaPesquisador = new ArrayList<Pesquisador>();
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		ArrayList<Tecnico> listaTecnico = new ArrayList<Tecnico>();
		ArrayList<Pedagoga> listaPedagoga = new ArrayList<Pedagoga>();
		ArrayList<Psicologa> listaPsicologa = new ArrayList<Psicologa>();
		ArrayList<Responsavel> listaResponsavel = new ArrayList<Responsavel>();
		ArrayList<Egresso> listaEgresso = new ArrayList<Egresso>();
		ArrayList<Reitor> listaReitor = new ArrayList<Reitor>();
		HashSet<Pessoa> listaPessoa = new HashSet<>();
		

		String grupoPesquisa;
		byte qtdArtigos = 0;
		String nome;
		String local;
		char sexo;
		String dataNascimento;
		String formacao;
		String cargo;
		String setor;
		String campus;
		int registro;
		String especialidade;
		String crp;
		String cpf;
		String profissao;
		String filiacao;
		String profissaoAtual;
		int anoFormatura;
		String empresaAtual;
		String estadoTrabalho;
		double salario;
		String phd;
		String universidade;
		double nota = 0;
		String resposta;




		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		Scanner scann = new Scanner(System.in);
		//Menu menu = new Menu();

		System.out.println(Menu.getMenu());

		opcao = scan.nextInt();

		while (opcao != 0) {
			switch (opcao) {
			case 1:
				System.out.println("CADASTRO DE ALUNO");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Aluno aluno = new Aluno(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				aluno.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				aluno.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				aluno.setLocalNascimento(local);
				
				System.out.println("Deseja inserir as notas? Digite s para sim e n para não.");
				resposta = scann.next();
				if(resposta.equals("s")) {
					while(nota>-1) {
						System.out.println("Digite uma nota. Para sair digite -1.");
						
						nota = scan.nextDouble();
						if(nota>-1) {
							aluno.listaNota.add(nota);
						}				
					}
				}
				
				nota = 0;
				listaAluno.add(aluno);

				break;
			case 2:
				System.out.println("LISTAR ALUNO");
				System.out.print(listaAluno.toString());
				break;
			case 3:
				System.out.println("CADASTRO DE PESQUISADOR");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Pesquisador pesquisador = new Pesquisador(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				pesquisador.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				pesquisador.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				pesquisador.setLocalNascimento(local);

				System.out.println("Grupo de Pesquisa");
				grupoPesquisa = scan.next();
				pesquisador.setGrupoPesquisa(grupoPesquisa);

				System.out.println("Quantidade de Artigos");
				qtdArtigos = scan.nextByte();
				pesquisador.setQtdArtigos(qtdArtigos);

				listaPesquisador.add(pesquisador);

				break;
			case 4:
				System.out.println("LISTAR PESQUISADOR");
				System.out.println(listaPesquisador.toString());
				break;
			case 5:
				System.out.println("CADASTRO DE PROFESSOR");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Professor professor = new Professor(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				professor.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				professor.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				professor.setLocalNascimento(local);

				System.out.println("Formacao:");
				formacao = scan.next();
				professor.setFormacao(formacao);
				
				listaProfessor.add(professor);

				break;
			case 6:
				System.out.println("LISTAR PROFESSOR");
				System.out.print(listaProfessor.toString());
				break;
			case 7:
				System.out.println("CADASTRAR TECNICO");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Tecnico tecnico = new Tecnico(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				tecnico.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				tecnico.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				tecnico.setLocalNascimento(local);

				System.out.println("Cargo");
				cargo = scan.next();
				tecnico.setCargo(cargo);

				System.out.println("setor");
				setor = scan.next();
				tecnico.setSetor(setor);

				System.out.println("Campus");
				campus = scan.next();
				tecnico.setCampus(campus);
				
				listaTecnico.add(tecnico);

				break;
			case 8:
				System.out.println("LISTAR TECNICO");
				System.out.print(listaTecnico.toString());
				break;
			case 9:
				System.out.println("Cadastrar PEDAGOGA");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Pedagoga pedagoga = new Pedagoga(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				pedagoga.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				pedagoga.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				pedagoga.setLocalNascimento(local);

				System.out.println("REGISTRO");
				registro = scan.nextInt();
				pedagoga.setRegistro(registro);
				
				listaPedagoga.add(pedagoga);

				break;

			case 10:
				System.out.println("LISTAR PEDAGOGA");
				System.out.print(listaPedagoga.toString());
				break;
			case 11:
				System.out.println("CADASTRAR PSICOLOGA");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				System.out.println("CRP:");
				crp = scan.next();

				Psicologa psicologa = new Psicologa(nome, cpf, crp);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				psicologa.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				psicologa.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				psicologa.setLocalNascimento(local);

				System.out.println("Especialidade");
				especialidade = scan.next();
				psicologa.setEspecialidade(especialidade);
				
				listaPsicologa.add(psicologa);

				break;

			case 12:
				System.out.println("LISTAR PSICOLOGA");
				System.out.print(listaPsicologa.toString());
				break;

			case 13:
				System.out.println("CADASTRAR RESPONSAVEL");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Responsavel responsavel = new Responsavel(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				responsavel.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				responsavel.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				responsavel.setLocalNascimento(local);

				System.out.println("Profissao:");
				profissao = scan.next();
				responsavel.setProfissao(profissao);

				System.out.println("Filiacao:");
				filiacao = scan.next();
				responsavel.setFiliacao(filiacao);

				listaResponsavel.add(responsavel);

				break;
			case 14:
				System.out.println("LISTAR RESPONSAVEL");
				System.out.println(listaResponsavel.toString());
				break;
			case 15:
				System.out.println("CADASTRAR EGRESSO");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Egresso egresso = new Egresso(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				egresso.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				egresso.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				egresso.setLocalNascimento(local);

				while(nota>-1) {
					System.out.println("Digite uma nota. Para sair digite -1.");
					
					nota = scan.nextDouble();
					if(nota>-1) {
						egresso.listaNota.add(nota);
					}
				}

				System.out.println("Profissão Atual:");
				profissaoAtual = scann.nextLine();
				egresso.setProfissaoAtual(profissaoAtual);

				System.out.println("Ano de Formatura");
				anoFormatura = scan.nextInt();
				egresso.setAnoFormatura(anoFormatura);

				System.out.println("Empresa Atual:");
				empresaAtual = scan.next();
				egresso.setEmpresaAtual(empresaAtual);

				System.out.println("Estado onde Trabalha:");
				estadoTrabalho = scan.next();
				egresso.setEstadoTrabalho(estadoTrabalho);

				listaEgresso.add(egresso);
				break;
			case 16:
				System.out.println("LISTAR EGRESSO");
				System.out.println(listaEgresso.toString());
				break;
			case 17:
				System.out.println("CADASTRAR REITOR");

				System.out.println("Nome:");
				nome = scan.next();

				System.out.println("CPF:");
				cpf = scan.next();

				Reitor reitor = new Reitor(nome, cpf);

				System.out.println("Sexo:");
				sexo = scan.next().charAt(0);
				reitor.setSexo(sexo);

				System.out.println("Data de nascimento:");
				dataNascimento = scan.next();
				reitor.setDataNascimento(dataNascimento);

				System.out.println("Local:");
				local = scan.next();
				reitor.setLocalNascimento(local);

				System.out.println("Salario");
				salario = scan.nextDouble();
				reitor.setSalario(salario);

				System.out.println("PHD:");
				phd = scan.next();
				reitor.setPhd(phd);

				System.out.println("Universidade:");
				universidade = scan.next();
				reitor.setUniversidade(universidade);

				listaReitor.add(reitor);
				
				break;

			case 18:
				System.out.println("LISTAR REITOR");
				System.out.println(listaReitor.toString());
				break;
				
			case 19:
				System.out.println(listaPessoa);
				break;
				
			case 20:
				listaPessoa.addAll(listaPsicologa);
				listaPessoa.addAll(listaTecnico);
				listaPessoa.addAll(listaReitor);
				listaPessoa.addAll(listaEgresso);
				listaPessoa.addAll(listaResponsavel);
				listaPessoa.addAll(listaPedagoga);
				listaPessoa.addAll(listaProfessor);
				listaPessoa.addAll(listaPesquisador);
				listaPessoa.addAll(listaAluno);
				
				double pontuacaoGeral =  calculaPontuacaoGeral(listaPessoa);
				System.out.println("A Pontuação geral do Instituto é: " + pontuacaoGeral);
				break;

			}
			
			
			System.out.println(Menu.getMenu());
			opcao = scan.nextInt();
		}
		scan.close();
		scann.close();
	}
	
	public static double calculaPontuacaoGeral(HashSet<Pessoa> listaPessoa) {
		double pontuacaoGeral = 0;
		
		for(Pessoa pessoa : listaPessoa) {
			pontuacaoGeral += pessoa.pontuacao();
		}
		return pontuacaoGeral;
	}	
}