package Model;

import Estados.EstadoPaciente;
import Estados.NaoHabilitado;

public class Paciente {
	
	private String nome;
	private EstadoPaciente estado;
	private String cpf;
	private String endereco;
	private String cartaoSUS;
	private String email;
	private String telefone;
	private String profissao;
	private int idade;
	private boolean comorbidades;
	public int diasPrimeiraDose;
	
	public Paciente(String nome, String cpf, String endereco, String cartaoSUS, String email,
			String telefone, String profissao, int idade, boolean comorbidades) {
		this.nome = nome;
		this.estado = new NaoHabilitado();
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartaoSUS = cartaoSUS;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.idade = idade;
		this.comorbidades = comorbidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoPaciente getEstado() {
		return estado;
	}

	public void setEstado(EstadoPaciente estado) {
		this.estado = estado;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(String cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void novoEstado() {
		this.estado.novoEstado(this);
	}
 
	public Boolean getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(Boolean comorbidades) {
		this.comorbidades = comorbidades;
	}
	
	public int getDiasPrimeiraDose() {
		return diasPrimeiraDose;
	}
	
	public void setDiasPrimeiraDose(int dias) {
		this.diasPrimeiraDose = dias;
	}
}
