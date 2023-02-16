public class ColorException extends RuntimeException{
    ColorException(){
        super("An error occured in Color");
    }

    ColorException(String msg){
        a.super("An error occured in Color");
    }

    public static void main(String[] args){
        throw new ColorException("A test in main");
    }
}
