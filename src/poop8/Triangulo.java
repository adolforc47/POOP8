/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a, b, c;
    private float base, altura;
    /**
     * Constructor vacío del Triangulo
     */
    public Triangulo() {
    }
    /**
     * Constructor para inicializar atributos
     * @param alfa
     * @param beta
     * @param gamma
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura 
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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
 * 
 * @return sobreescribir un método debe tener mismo tipo de retorno
 */
    /**
     * Calcula el área del triángulo
     * @return El área del triángulo como un entero
     */
    @Override
    public int area(){
        return(int)(base*altura)/2;
    }
    /**
     * Calcula el perímetro del triángulo
     * @return El área del triángulo como un entero
     */
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
    /**
     * Convierte el objeto Triangulo a una cadena de texto
     * @return Una representación en forma de cadena del objeto Triangulo
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
       
}
