package errors;

public class PrecoBaseNegativoException extends RuntimeException {
    public PrecoBaseNegativoException(String mensagem) {
        super(mensagem);
    }
}