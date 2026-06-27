package responsables;
import personas.Persona;
import java.time.LocalDate;

public class Responsable extends Persona{
private String especialidad;
private int experiencia;

public Responsable(String especialidad, int experiencia,int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
super(identificacion, nombrecompleto, fechadenacimiento, telefono);
this.especialidad = especialidad;
this.experiencia = experiencia;
  }
    
public void Infromacion(){
        System.out.println("especialidad: " + especialidad);
        System.out.println("Experiencia: " + experiencia);

}
    
}
