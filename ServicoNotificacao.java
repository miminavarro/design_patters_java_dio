class ServicoNotificacao {
    private static ServicoNotificacao instancia;

    private ServicoNotificacao() {}

    public static ServicoNotificacao getInstancia() {
        if (instancia == null) {
            instancia = new ServicoNotificacao();
        }
        return instancia;
    }

    public void notificandoUsuarios(String message) {
        System.out.println("Notificando usuários: " + message);
    }
}
