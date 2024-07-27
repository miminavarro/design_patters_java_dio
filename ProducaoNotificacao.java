class ProducaoNotificacao {
    public static Notificacao createNotificacao(String type) {
        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotificacao();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotificacao();
        }
        return null;
    }
}
