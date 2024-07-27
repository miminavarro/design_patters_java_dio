public class SistemaNotificacao {
    public static void main(String[] args) {
        // Singleton
        ServicoNotificacao servicoNotificacao = ServicoNotificacao.getInstancia();

        // Observer
        Usuario user1 = new Usuario("Laura");
        Usuario user2 = new Usuario("João");

        // Factory Method
        Notificacao emailNotificacao = ProducaoNotificacao.createNotificacao("EMAIL");
        Notificacao smsNotificacao = ProducaoNotificacao.createNotificacao("SMS");

        // Notificando usuários
        String message = "Iscrições abertas para o curso intensivo de Java.";
        servicoNotificacao.notificandoUsuarios(message);
        user1.update(message);
        user2.update(message);

        emailNotificacao.send(message);
        smsNotificacao.send(message);
    }
}
