package EnumPractice;

public enum Baduk {

    BLACK_DOL("검은돌"),
    WHITE_DOL("흰돌");

    private String description;

    Baduk(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
