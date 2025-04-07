package exceptions;

public class ManufacturingException extends IllegalArgumentException{
    public ManufacturingException() {
        super("Sorry. We only sell cars from 2010 onwards");
    }
}
