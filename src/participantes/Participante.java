package participantes;
import personas.Persona;
import disciplinas.Disciplina;
import java.time.LocalDate;
public class Participante extends Persona {
    private Disciplina disciplina;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Participante(Disciplina disciplina, int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        super(identificacion, nombrecompleto, fechadenacimiento, telefono);
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Participante{" +"Nombre="+this.getNombrecompleto()+"edad="+this.getEdad()+ "disciplina=" + disciplina + '}';
    }
    
}
