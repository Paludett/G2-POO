package models.central;

public abstract class Usuario implements VerEnvios, VerFaturamento {
    
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