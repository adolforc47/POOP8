/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
public interface InstrumentoMusical {
    /**
     * Toca el instrumento musical produciendo sonido
     */
    void tocar();
    /**
     * Afina el instrumento
     */
    void afinar();
    /**
     * Obtiene el tipo de instrumento musical
     * @return Tipo de instrumento como cadena de texto
     */
    String tipoInstrumento();
    
}
