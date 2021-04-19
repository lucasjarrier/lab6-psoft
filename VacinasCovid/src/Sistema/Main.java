package Sistema;

import java.util.Scanner;

import Controler.Controler;
import Model.Paciente;

public class Main {
	
	/**
	 * @author Lucas Jarrier
	 */

	public static void main(String[] args) {
		
		Controler controler = new Controler();

		Scanner scanner = new Scanner(System.in);
		
		/**
		 * Configura��es Padr�o de Vacina!
		 * Voc� pode alterar Utilizando a Op��o 5!
		 * Enjoy =)
		 */
      
        int idade = 70;                    // <- Altere
        boolean possuiComorbidade = true;  // <- Altere
        String qualProfissao = "saude";    // <- Altere
        
		while(true) {
			System.out.println();
			System.out.println("Digite a op��o desejada");
			System.out.println("1 - Cadastrar Paciente");
			System.out.println("2 - Realizar Vacina��o");
			System.out.println("3 - Consultar Estado Paciente!");
			System.out.println("4 - (adm) Habilitar Segunda Dose");
			System.out.println("5 - (adm) Alterar Config Vacina");
			System.out.println();
			
			int op = scanner.nextInt();
			scanner.nextLine();
			
			if(op == 1) {
				
				System.out.println();
				System.out.println("Nome: ");
		        String nome = scanner.nextLine();
		        
		        System.out.println("CPF: ");
		        String cpf = scanner.nextLine();
		        
		        System.out.println("Endereco: ");
		        String endereco = scanner.nextLine();
		        
		        System.out.println("Cartao do SUS: ");
		        String cartaoSUS = scanner.nextLine();
		        
		        System.out.println("Email: ");
		        String email = scanner.nextLine();
		        
		        System.out.println("Telefone: ");
		        String telefone = scanner.nextLine();
		        
		        System.out.println("Profiss�o: ");
		        String profissao = scanner.nextLine();
		        
		        System.out.println("Possui comorbidade? ");
		        String comorbidades = scanner.nextLine();
		        
		        System.out.println("Idade: ");
		        int idadePaciente = scanner.nextInt();
		        
		       
		        
		        if(comorbidades.equals("sim")) {
		        	Paciente novoPaciente = new Paciente(nome, cpf, endereco, cartaoSUS, email, telefone, profissao, idadePaciente, true);
		        	controler.addPaciente(novoPaciente);
		        } else {
		        	Paciente novoPaciente = new Paciente(nome, cpf, endereco, cartaoSUS, email, telefone, profissao, idadePaciente, false);
		        	controler.addPaciente(novoPaciente);
		        }
		        
		        System.out.println("Paciente Cadastrado!");
		        System.out.println();
			}
			
			
			
			else if(op == 2) {
				System.out.println();
				System.out.println("A seguir insira a chave para verificar se o usu�rio j� foi cadastrado!");
				System.out.println("Digite o CPF: ");
		        String cpf = scanner.nextLine();
		        
		        Paciente paciente = controler.contains(cpf);
		        
		        if(paciente == null) {
		        	System.out.println("Usu�rio ainda n�o cadastrado!");
		        }
		                
		        if(paciente.getComorbidades().equals(possuiComorbidade) || 
		        		paciente.getIdade() >= idade || paciente.getProfissao().equals(qualProfissao) ) {
		        	paciente.novoEstado();
		        	System.out.println(paciente.getEstado().estadoPaciente());
		        }
		        else {
		        	System.out.println(paciente.getEstado().estadoPaciente());
		        }
			}
			
			
			else if(op == 3) {
				System.out.println("Digite o CPF: ");
		        String cpf = scanner.nextLine();
		        System.out.println(controler.getInformacao(cpf));
			}
			
			else if(op == 4) {
				System.out.println("Digite o CPF: ");
		        String cpf = scanner.nextLine();
		        
		        System.out.println("Quantos dias se passaram ap�s a primeira dose? ");
				int dias = scanner.nextInt();
				
				controler.alterarDiasPrimeiraDose(cpf, dias);
				System.out.println("Dias alterado!\nAgora voc� pode tentar novamente a op��o 2!");
			}
			
			else if(op == 5) {
				
		        System.out.println("Digite a profiss�o a ser Liberada: ");
		        qualProfissao = scanner.nextLine();
		       
		        System.out.println("Digite a idade a ser Liberada: ");
		        idade = scanner.nextInt();
			}
			
			else if(op == 6) {
				System.out.println("Opera��o foi finalizada!");
				break;
			}
 		}	
		System.out.println();
	}
}
