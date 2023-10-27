/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
/**
 * No se tiene ningun atributo y tampoco getter y setter.
 */
    public InstrumentoViento() {
    }
    
    @Override
    public String tipoInstrumento(){
        return "instrumentoViento";
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinar instrumento de viento");
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}

