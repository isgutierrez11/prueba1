package entrenamientos;
import asistencias.Asistencia;
import disciplinas.Disciplina;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
public class entrenamiento {
    private Asistencia asistencia[];
    private Disciplina disciplina;
    private LocalDate fecha;
    private Duration duracion;
    private LocalTime hora_inicio;

    public Asistencia[] getAsistencia() {
        return asistencia;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public LocalTime getHora_inicio() {
        return hora_inicio;
    }
    public void calcularDuracion(LocalTime hora_Final){
        if (hora_Final.isBefore(this.hora_inicio)) {
                hora_Final = hora_Final.plusHours(24);
            }
        this.duracion = Duration.between(this.hora_inicio, hora_Final);
        
    }

    public entrenamiento(Asistencia[] asistencia, Disciplina disciplina, LocalDate fecha, Duration duracion, LocalTime hora_inicio) {
        this.asistencia = asistencia;
        this.disciplina = disciplina;
        this.fecha = fecha;
        this.duracion = duracion;
        this.hora_inicio = hora_inicio;
    }

    @Override
    public String toString() {
        return "entrenamiento{" + 
                "asistencia=" + Arrays.toString(asistencia) + 
                ", disciplina=" + disciplina + 
                ", fecha=" + fecha + 
                ", duracion=" + duracion + 
                ", hora_inicio=" + hora_inicio + 
                '}';
    }
    
}
