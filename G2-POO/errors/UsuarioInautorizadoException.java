package errors;

public class UsuarioInautorizadoException extends RuntimeException {
    public UsuarioInautorizadoException(String mensagem) {
        super(mensagem);
    }
}