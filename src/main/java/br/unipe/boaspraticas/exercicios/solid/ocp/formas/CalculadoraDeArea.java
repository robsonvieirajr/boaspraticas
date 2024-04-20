package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

// Classe CalculadoraDeArea que utiliza polimorfismo para calcular a área total de um conjunto de formas geométricas
public class CalculadoraDeArea {
    public double calcularAreaTotal(Calculavel[] formas) {
        double areaTotal = 0;
        for (Calculavel forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
}
