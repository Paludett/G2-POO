package errors;

public class PesoNegativoException extends RuntimeException {
    public PesoNegativoException(String mensagem) {
        super(mensagem);
    }
}