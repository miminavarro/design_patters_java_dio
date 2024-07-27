class SMSNotificacao implements Notificacao {
    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
