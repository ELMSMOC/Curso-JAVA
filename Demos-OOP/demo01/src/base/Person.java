package base;

public class Person {

    // Propiedades static o de clase
    public static int counter = 0;
    
    // Metodos static
    public static void updateCounter(){
        Person.counter++;    
    }
    
    // Propiedades de instancia
    private String name;
    private int age;


    // Metodos getters y setters

    // public String getName(){
    //     return name;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age < this.age){
            return;
        }
        this.age = age;
    }


    // Metodo Constructor, se ejecuta cada vez que lo instanciamos con new
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("Se ha instanciado una persona llamada %s y tiene %s \n", name, age);
        // counter++;
        updateCounter();
    }


    // Metodo de instancia
    public void greetings(){
        System.out.printf("Hola, soy %s y tengo %s años \n", name, age);
    }

}
