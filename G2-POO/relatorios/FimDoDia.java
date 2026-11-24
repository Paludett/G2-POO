package relatorios;
// Conceito S do SOLID, de responsabilidade unica, essa classe a unica 
// funcao dela é o relatorio de FimDoDia e nada mais

import models.central.Usuario;

public class FimDoDia {
    private Destino destino;

    public FimDoDia(Destino destino) {
        this.destino = destino;
    }
    // Conceito D do SOLID, uam classe principal nao sabe nem cria a classe que depende dela

    public void mostrar(Usuario user) {
        conteudo = "Faturamento total: " + user.getFaturamento() + " Envio mais caro: Encomenda: " + user.getMaisCaro().encomenda + " Valor: " user.getMaisCaro().valor + " Data: " user.getMaisCaro().data;
        destino.enviar(conteudo);
        return;
    }

}