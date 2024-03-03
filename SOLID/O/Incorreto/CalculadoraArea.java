package SOLID.O.Incorreto;

import java.util.List;

public class CalculadoraArea {

    public double calcularAreaTotal(List<Forma> formas) {
        double areaTotal = 0;
        for (Forma forma : formas) {
            if (forma instanceof Quadrado) {
                Quadrado quadrado = (Quadrado) forma;
                areaTotal += quadrado.calcularArea();
            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                areaTotal += circulo.calcularArea();
            }
        }
        return areaTotal;
    }

}
