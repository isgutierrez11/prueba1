
package personas;
import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    
    protected int identificacion;
    protected String nombrecompleto;
    protected LocalDate fechadenacimiento;
    protected int telefono;

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public int getEdad(){
        return Period.between(fechadenacimiento, LocalDate.now()).getYears();
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Persona(int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        this.identificacion = identificacion;
        this.nombrecompleto = nombrecompleto;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" 
                + identificacion + ", nombrecompleto=" 
                + nombrecompleto + ", fechadenacimiento=" 
                + fechadenacimiento + ", telefono=" 
                + telefono + '}';
    }
    
    
}
