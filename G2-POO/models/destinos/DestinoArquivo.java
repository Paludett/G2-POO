public class DestinoArquivo implements Destino {
    @Override
    public void enviar(String conteudo) {
        System.out.println("[SALVANDO O RESULTADO EM UM ARQUIVO]:" + conteudo);
    }
}