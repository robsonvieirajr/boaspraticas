package br.unipe.boaspraticas.exercicios.solid.model;

import lombok.Data;

import java.util.List;

@Data
public class Compra {
    private List<ItemCompra> itens;   // Lista de itens da compra
    private double desconto; // Desconto a ser aplicado

    // Getters e setters omitidos
}