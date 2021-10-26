package pruebas;

import figuras.Circulo;

public class Cliente {
    public static void main(String[] args){
        int radio = Integer.parseInt(args[0]);
        Circulo c = new Circulo(radio);
        System.out.println("El area vale: " + c.area());
        System.out.println("El perimetro vale: "+ c.perimetro());
    }
}
