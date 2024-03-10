public record AuthorRecord(String name) {
    public AuthorRecord(String name) {
        if (Character.isDigit(name.charAt(0))) {
            throw new IllegalArgumentException("Имя не может начинаться с цифры");
        }
        this.name = name;
    }
}
