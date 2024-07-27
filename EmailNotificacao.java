class EmailNotificacao implements Notificacao {
    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
