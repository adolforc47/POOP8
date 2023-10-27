/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author Adolfo, Eduardo, Mariana
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de objetos
        Poligono poligono;
        Triangulo triangulo =new Triangulo();
        Cuadrilatero cuadrilatero =new Cuadrilatero();
        //System.out.println(poligono);
        // Impresión de objetos
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        // Configuración de propiedades
        triangulo.setBase(5);
        triangulo.setAltura(3);
        
        cuadrilatero.setBase(4);
        cuadrilatero.setAltura(6);
        // Impresión de objetos después de configurar propiedades
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println(triangulo.area());
        System.out.println(cuadrilatero.area());
        
        
        poligono=new Triangulo();
        System.out.println(poligono);
        //System.out.println(poligono.getBase());
       
        
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);
        // Creación y uso de un objeto Flauta
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        // Impresión de constantes matemáticas
        System.out.println(Math.PI);
        // Impresión de nombres de meses utilizando la interfaz Meses
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.TRES]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CUATRO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CINCO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SEIS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SIETE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.OCHO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DIEZ]);
        System.out.println(Meses.NOMBRE_MESES[Meses.ONCE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);
        
        
    }
    /**
     * Método que identifica el tipo de polígono y lo imprime
     * @param poligono Objeto de tipo Poligono
     */
    private static void getPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo)
        {
            System.out.println("Es un triangulo");
        }
        else if(poligono instanceof Cuadrilatero)
        {
            System.out.println("Es un cuadrilatero");
        }
        else
        {
            System.out.println("Es un poligono");
        }
    }
    
}
