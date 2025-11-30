package PersonalProjectMarket.domain.types;

public enum Status {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
