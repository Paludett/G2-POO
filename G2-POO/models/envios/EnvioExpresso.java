package models.envios;

public class EnvioExpresso extends Envio {
    public EnvioExpresso(Encomenda encomenda, LocalDate data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    @Override
    public double getFrete(){
        double preco = this.precoBase;
        if (peso > 10) {
            preco = 15 * (peso - 10) + precoBase;
        }
        return preco;
    }
}