package br.unipe.boaspraticas.exercicios.solid.sip.animais;

class AveVoadora implements Animal, Voador {
    @Override
    public void comer() {
        System.out.println("A ave está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("A ave está dormindo.");
    }

    @Override
    public void voar() {
        System.out.println("A ave está voando.");
    }
}
