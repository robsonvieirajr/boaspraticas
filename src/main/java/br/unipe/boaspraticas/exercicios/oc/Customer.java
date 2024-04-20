package br.unipe.boaspraticas.exercicios.oc;

public class Customer {

    private String name;
    private int age;
    private double totalPurchaseAmount;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalPurchaseAmount = 0;
    }

    public void addToTotalPurchaseAmount(double amount) {
        this.totalPurchaseAmount += amount;
    }

    public void makePurchase(double amount) {
        if (isValidPurchaseAmount(amount)) {
            addToTotalPurchaseAmount(amount);
            System.out.println("Purchase successful!");
            if (isAdult()) {
                sendEmailReceipt(amount);
            }
        } else {
            System.out.println("Invalid purchase amount!");
        }
    }

    private boolean isValidPurchaseAmount(double amount) {
        return amount > 0;
    }

    private boolean isAdult() {
        return this.age >= 18;
    }

    private void sendEmailReceipt(double amount) {
        // Lógica para enviar um e-mail com o recibo da compra
        System.out.println("Email receipt sent. Amount: " + amount);
    }

    // Getters e Setters podem ser adicionados conforme necessário, mas devem ser usados com cuidado
}
