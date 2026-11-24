package models;

import errors.PesoNegativoException;

public class Encomenda {
    private Remetente remetente;
    private String descricao;
    private double peso;

    public Encomenda(Remetente remetente, String descricao, double peso) {
        if (peso < 0) {
            throw new PesoNegativoException("peso nao pode ser negativo!");
        }
        this.remetente = remetente;
        this.descricao = descricao;
        this.peso = peso;
    }
}