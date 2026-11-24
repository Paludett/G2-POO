package interfaces.permissoes;

import models.envios.Envio;
import models.central.Central;

public interface VerEnvios {
    void registrarEnvio(Central central, Envio envio);
}

// Conceito I do SOLID, uma Interface nao deve ser gorda, 
// e ter um contrato que faz mais de uma coisa
// cada contrato aqui so tem uma funcao, e nada mais