package Estados;

import Model.Paciente;

public class TomouPrimeiraDose implements EstadoPaciente {
	
	private String estado = "Paciente acabou de tomar a primeira dose!\nAgora deve aguardar 20 dias para nova dose!";
	
	@Override
	public EstadoPaciente novoEstado(Paciente paciente) {
		
		if(paciente.getDiasPrimeiraDose() < 20) {
			return null;
		}
		
		this.estado = "Habilitado para 2a Dose!";
		
 		paciente.setEstado(new HabilitadoSegundaDose());
 		
 		return new HabilitadoSegundaDose();
	}

	@Override
	public String estadoPaciente() {
		return estado;
	}
}
