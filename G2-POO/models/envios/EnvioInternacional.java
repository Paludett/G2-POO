package models.envios;

public class EnvioInternacional extends Envio {
    public EnvioInternacional(Encomenda encomenda, LocalDate data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    @Override
    public double getFrete(){
        double preco = this.precoBase * 2.5;
        return preco;
    }
}