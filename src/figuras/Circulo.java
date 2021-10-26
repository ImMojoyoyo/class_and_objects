package figuras;

public class Circulo {
    // Atributos
    private int radio;

    // Métodos
    public Circulo(){
        radio = 1;
    }
    public Circulo(int r) {
    }
    public double area(){
        return radio*radio*3.1416;
    }
    public double perimetro(){
        return 2*3.1416*radio;
    }

}
