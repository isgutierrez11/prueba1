
package asistencias;
import participantes,Participante;
import entrenamientos.Entrenamiento;

public class Asistencia {
    private Participante participante;
    private Entrenamiento entrenamiento;
    private boolean confirmar;

    public Participante getParticipante() {
        return participante;
    }

    public Entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public boolean isConfirmar() {
        return confirmar;
    }

    public Asistencia(Participante participante, Entrenamiento entrenamiento, boolean confirmar) {
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
