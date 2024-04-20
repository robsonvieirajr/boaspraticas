package br.unipe.boaspraticas.exercicios.solid.model;


import lombok.Data;

@Data
public class ItemCompra {
    private String nomeCliente;  // Nome da pessoa realizando a compra
    private double precoUnitario; // Preço unitário do item
    private int quantidade;  // Quantidade de itens

}
