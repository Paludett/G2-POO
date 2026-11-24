package models.central;

import errors.UsuarioInautorizadoException;

public class Atendente extends Usuario  {
    
    @Override
    public void registrarEnvio(Central central, Envio envio) {
        throw new UsuarioInautorizadoException("Voce nao tem permissao para essa acao!");
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