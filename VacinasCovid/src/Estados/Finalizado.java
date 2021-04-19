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
		return "O estado da vacina��o do cliente foi concluido! Sa�de para Todos!";
	}
}
