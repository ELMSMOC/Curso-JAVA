package local.exceptions;
// Pagina 256 del libro
// RuntimeException
public class TechnicalException extends RuntimeException{


    TechnicalException(String message){
        super(message);
    }

    TechnicalException(String message, Throwable cause){
        super(message, cause);
    }
}
