package Estados;

import Model.Paciente;

public class HabilitadoPrimeiraDose implements EstadoPaciente{

	@Override
	public EstadoPaciente novoEstado(Paciente paciente) {
		paciente.setEstado(new TomouPrimeiraDose());
		paciente.setDiasPrimeiraDose(0);
		return new TomouPrimeiraDose();
	}

	@Override
	public String estadoPaciente() {
		return "Paciente habilitado para primeira dose!";
	}
}
