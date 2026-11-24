package models.central;

public class Gerente extends Usuario implements RegistrarEnvios {
    
    @Override
    public void registrarEnvio(Central central, Envio envio) {
        central.registrarEnvio(envio);
        return;
    }

    @Override
    public void getEnvios(Central central) {
        System.out.println(central.getEnvios());
        return;
    }

    @Override
    public double getFaturamento(Central central) {
        return central.getFaturamento();
    }

    @Override 
    public Encomenda getMaisCaro(Central central) {
        return central.getMaisCaro();
    }
}

// Conceito L do SOLID uma classe filha segue o mesmo contrato que a
// classe mae, por exemplo nessa situacao a classe gerente, tem os 
// mesmos contratos que a classe Usuario, que ela herda