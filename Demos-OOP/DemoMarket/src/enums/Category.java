package enums;

public enum Category {
    FOOD("Alimentacion"),
    DRUGSTORE("Drogueria"),
    PETS("Mascotas"),
    HYGIENE("Higiene");

    String name;
    Category (String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
