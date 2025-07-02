package local.exceptions;

public enum ErrorCodes {
    ERROR_BIGGER_20("No puede ser mayor de 20"),
    ERROR_EVEN("No se admiten pares"),
    ERROR_NEGATIVE("No se admiten negativos"),
    ERROR_ZERO("No se puede dividir por 0");

    private String message;

    @Override
    public String toString() {
        return this.message;
    }

    ErrorCodes(String message){
        this.message = message;
    }

}
