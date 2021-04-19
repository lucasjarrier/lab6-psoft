package Estados;

import Model.Paciente;

public class Finalizado implements EstadoPaciente {

	@Override
	public EstadoPaciente novoEstado(Paciente paciente) {
		paciente.setEstado(new Finalizado());
		return null;
	}

	@Override
	public String estadoPaciente() {
		return "O estado da vacinação do cliente foi concluido! Saúde para Todos!";
	}
}
