/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
/**
 * La clase Cuadrilatero representa un tipo de polígono con cuatro lados. Hereda de la clase Poligono.
 */
public class Cuadrilatero extends Poligono{
    /**
     * Atributos que describen el cuadrilátero
     */
    private int alfa, beta, gamma;
    private float a, b;
    private float base, altura;

    public Cuadrilatero() {
    }
    /**
     * Constructor del Ciadrilátero.
     * @param alfa
     * @param beta
     * @param gamma
     * @param a
     * @param b
     * @param base
     * @param altura 
     */
    public Cuadrilatero(int alfa, int beta, int gamma, float a, float b, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Calcula el área del cuadrilátero
     * @return El área del cuadrilátero como un entero
     */
   @Override
    public int area(){
        return(int)(base*altura);
    }
    /**
     * Calcula el perímetro del cuadrilátero
     * @return El perímetro del cuadrilátero como entero
     */
    @Override
    public int perimetro(){
        return (int)(2*a+2*b);
    }
    /**
     * Convierte objeto cuadril+átero en cadena de texto
     * @return Cuadrilátero
     */
    @Override
    public String toString() {
        return super.toString()+"Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
