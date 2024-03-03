package SOLID.O.Correto;

import java.util.List;

public interface Forma {

    double calcularArea();

}

public class Quadrado implements Forma {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

}

public class CalculadoraArea {

    public double calcularAreaTotal(List<Forma> formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }

}