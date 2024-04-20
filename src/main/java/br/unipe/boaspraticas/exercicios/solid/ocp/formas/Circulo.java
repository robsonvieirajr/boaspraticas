package br.unipe.boaspraticas.exercicios.solid.ocp.formas;

import br.unipe.boaspraticas.exercicios.solid.model.FormaGeometrica;

// Classe Circulo que implementa a interface Calculavel
public class Circulo extends FormaGeometrica implements Calculavel {
    private double raio;

    // Construtor, getters e setters omitidos

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
