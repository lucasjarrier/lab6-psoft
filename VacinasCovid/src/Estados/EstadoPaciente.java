package Estados;

import Model.Paciente;

public interface EstadoPaciente {

	public EstadoPaciente novoEstado(Paciente paciente);
	public String estadoPaciente();
}
