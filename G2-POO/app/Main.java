package app;

import models.*;
import relatorios.FimDoDia;

public class Main {
    public static void main(String[] args) {
        Remetente r1 = new Remetente("Jose", "48918941241");
        Remetente r2 = new Remetente("Maria", "2653526236326");
        Encomenda e1 = new Encomenda(r1, "Play 5 pra jogar gta", 8);
        Encomenda e2 = new Encomenda(r2, "Carro de brinqeudo remoto", 121);
        Central c1 = new Central();
        Gerente g1 = new Gerente();
        EnvioEconomico envio1 = new EnvioEconomico(e1, LocalDate.now(), 6200);
        EnvioExpresso envio2 = EnvioExpresso(e2, LocalDate.of(2026, 5, 27), 120);
        EnvioInternacional envio3 = EnvioInternacional(e1, LocalDate.now(), 4300);
        g1.registrarEnvio(c1, envio1);
        g1.registrarEnvio(c1, envio2);
        g1.registrarEnvio(c1, envio3);
        try {
            Encomenda e3 = new Encomenda(r2, "Carro de brinqeudo remoto", -141);
        } catch(PrecoBaseNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        FimDoDia relatorio = new FimDoDia(new DestinoConsole);
        relatorio.mostrar();
    }
}

// S: Responsabilidade unica, uma classe com apenas uma funcao
// O: Aberto/Fechado, uma classe funcionando nao pode ser reescrita, esta fechada para mudancas, nova feature, novo codigo, nao altera o antigo
// L: Liskov, uma classe filha, segue o mesmo contrato da mae
// I: Segregacao de interfaces, uma interface deve ser segregada tendo uma funcao por contrato, sem contratos com mais de uma funcao, mais de uma coisa a ser feita
// D: Inversao de Dependencias, uma classe principal nao pode criar, nem conhecer uma classe que depende dela

// Remetente: Nome Telefone
// Encomenda: Remetente Descricao Peso - Peso nao pode ser negativo
// Envio: Encomenda Data PrecoBase - Envio tem que ter encomenda, preco nao pode ser negativo
// - Expresso: peso > 10 = 15 reais * kg excedente + precoBase
// - Economico: precoBase
// - Internacional: precoBase * 2,5
// !!! Nenhum dado pode ser alterado fora da classe que o guarda
// !!! Um dos erros deve ser tratado com excecao propria
// !!! Todos os envios sao guardados em uma central unica
// FimDoDia: faturamentoTotal + envioMaisCaro
