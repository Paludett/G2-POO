package interfaces.permissoes;

import models.central.Central;
import models.Encomenda;

public interface VerEnvios {
    Encomenda getEnvios(Central central);
}