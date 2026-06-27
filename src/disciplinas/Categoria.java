/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package disciplinas;

/**
 *
 * @author Yumor
 */
public enum Categoria {
    INFANTIL("Infantil"),JUVENIL("Juvenil"),ADULTO("Adulto");
    
     private String categoria; 

    public String getCategoria() {
        return categoria;
    }

    private Categoria(String categoria) {
        this.categoria = categoria;
    }
}
