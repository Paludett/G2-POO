package models.central;

import models.envios.Envio;

public class Central {
    private ArrayList<Envio> envios = new ArrayList<Envio>;

    public void registrarEnvio(Envio envio) {
        envios.add(envio);
        System.out.println("Envio registrado!");
        return;
    }

    public ArrayList<Envio> getEnvios() {
        return this.envios;
    }

    public double getFaturamento() {
        double total;
        for(Envio e : envios) {
            total += e.getPrecoBase();
        }
        return total;
    }

    public double getMaisCaro() {
        double total;
        for(Envio e : envios) {
            total += e.getPrecoBase();
        }
        return total;
    }
}