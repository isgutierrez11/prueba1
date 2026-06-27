package asistencias;
import participantes.Participante;
import entrenamientos.entrenamiento;

public class Asistencia {
    private Participante participante;
    private entrenamiento entrenamiento;
    private boolean confirmar;

    public Participante getParticipante() {
        return participante;
    }

    public entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public boolean isConfirmar() {
        return confirmar;
    }

    public Asistencia(Participante participante, entrenamiento entrenamiento, boolean confirmar) {
        this.participante = participante;
        this.entrenamiento = entrenamiento;
        this.confirmar = confirmar;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "participante=" 
                + participante + ", entrenamiento="
                + entrenamiento + ", confirmar=" 
                + confirmar + '}';
    }
    
    
   
}
