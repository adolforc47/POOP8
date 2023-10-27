/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
public abstract class Poligono extends Object {
    /**
     * Constructor vacío de Poligono
     */    
    public Poligono(){
    }
    /**
     * Método abstracto para calcular el área del polígono
     * @return El área del polígono como un entero
     */
    public abstract int area();
    /**
     * Método abstracto para calcular el perímetro del polígono
     * @return El perímetro del polígono como un entero
     */
    public abstract int perimetro();
    /**
     * Convierte el objeto Poligono a una cadena de texto
     * @return Una representación en forma de cadena del objeto Poligono
     */
    
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
