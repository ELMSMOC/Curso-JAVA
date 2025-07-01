package local.exceptions;

// Checked Exception
public class BusinessException extends Exception {
    
    private static String generateMessage(ErrorCodes code , String message){
        return code + "-" + message;
    }

    ErrorCodes code;
    BusinessException (ErrorCodes code, String message){
        super(message);
        this.code = code;
    }

    BusinessException (ErrorCodes code, String message, Throwable cause){
        super(generateMessage(code, message));
        this.code = code;
    }

}

enum ErrorCodes {
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

// public class Patada{} No se pueden dos clases publicas en el mismo file
