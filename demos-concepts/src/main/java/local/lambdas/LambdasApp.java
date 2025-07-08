package local.lambdas;

public class LambdasApp {

    public static void main(String[] args) {
        Compose compose = new Compose();

        System.out.println(compose.execute("Patata"));

        LambdaString make = (String txt) -> "Info recibida" + txt;

    }
}
