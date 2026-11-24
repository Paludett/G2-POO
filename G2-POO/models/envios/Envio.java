package models.envios;

import java.time.LocalDate;
import errors.EncomendaNulaException;
import errors.PrecoBaseNegativoException;

public abstract class Envio {
    private Encomenda encomenda;
    private LocalDate data;
    private double precoBase;

    public class Envio(Encomenda encomenda, LocalDate data, double precoBase) {
        if (encomenda.isBlank()) {
            throw new EncomendaNulaException("Encomenda nao pode ser nula ou vazia!");
        }
        if (precoBase < 0) {
            throw new PrecoBaseNegativoException("O preco base nao pode ser negativo!");
        }
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
    }

    public double getFrete(){
        return 0;
    }

    public double getPrecoBase(){
        return this.precoBase;
    }
}