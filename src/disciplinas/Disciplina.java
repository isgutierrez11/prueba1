/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;
import personas.Persona;
import responsables.Responsable;
import participantes.Participante;
import entrenamientos.Entrenamiento;
import java.util.Arrays;

        

public class Disciplina  {
    private String nombre;
    private Categoria categoria; 
    private int capMaxima;
    private Participante Participantes[];
    private Entrenamiento Entrenamientos[];

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public Participante[] getParticipantes() {
        return Participantes;
    }

    public Entrenamiento[] getEntrenamientos() {
        return Entrenamientos;
    }

    public Disciplina(String nombre, Categoria categoria, int capMaxima, Participante[] Participantes, Entrenamiento[] Entrenamientos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.capMaxima = capMaxima;
        this.Participantes = Participantes;
        this.Entrenamientos = Entrenamientos;
    }

    @Override
    public String toString() {
        return "Disciplina{" 
                + "nombre=" + nombre 
                + ", categoria=" + categoria 
                + ", capMaxima=" + capMaxima 
                + ", Participantes=" + Arrays.toString(Participantes)
                + ", Entrenamientos=" + Arrays.toString(Entrenamientos) + '}';
    }
    
    

    
        
       
    }

