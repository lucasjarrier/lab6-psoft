package Estados;

import Model.Paciente;

public class NaoHabilitado implements EstadoPaciente {
	
	private String estado = "Não habilitado para primeira dose!";

	@Override
	public EstadoPaciente novoEstado(Paciente paciente) {
		paciente.setEstado(new HabilitadoPrimeiraDose());
		
		estado = "Habilitado para Primeira Dose!";
		
		return new HabilitadoPrimeiraDose();
	}

	@Override
	public String estadoPaciente() {
		return estado;
	}

}
