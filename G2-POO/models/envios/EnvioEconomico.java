package models.envios;

public class EnvioEconomico extends Envio {
    public EnvioEconomico(Encomenda encomenda, LocalDate data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    @Override
    public double getFrete(){
        double preco = this.precoBase;
        return preco;
    }
}

// Conceito O do SOLID de aberto e fechado, se precisar criar um novo 
// tipo de envio basta criar uma nova classe que herde de Envio, nao
// é necessario a alteracao de codigo que está funcionando