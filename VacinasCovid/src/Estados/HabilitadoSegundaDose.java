package Estados;

import Model.Paciente;

public class HabilitadoSegundaDose implements EstadoPaciente{

	@Override
	public EstadoPaciente novoEstado(Paciente paciente) {
		paciente.setEstado(new Finalizado());
		return new Finalizado();
	}

	@Override
	public String estadoPaciente() {
		return "Paciente habilitado a tomar segunda dose";
	}

}
