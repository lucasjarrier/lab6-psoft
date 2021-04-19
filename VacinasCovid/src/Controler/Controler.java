package Controler;

import java.util.ArrayList;

import Model.Paciente;

public class Controler {
	
	ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void addPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}
	
	public Paciente contains(String cpf) {

		for(Paciente paciente : pacientes) {
			if(paciente.getCpf().equals(cpf)) return paciente;
		}
		return null;
	}
	
	public void alterarDiasPrimeiraDose(String cpf, int dias) {
		Paciente paciente = contains(cpf);
		if(paciente != null) {
			paciente.setDiasPrimeiraDose(dias);
		}
 	}
	
	public String getInformacao(String cpf) {
		Paciente paciente = contains(cpf);
		if(paciente != null) {
			return paciente.getEstado().estadoPaciente();
		}
		return "Paciente não encontrado, confira os dados!";
	}
}
