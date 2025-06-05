public class person {
    public static void main(String[] args){
        byte edad = 22;
        float altura = 1.78f;
        double weight = 58.234234;
        String name = "Pepe";

        System.out.println("Name" + name);
        System.out.println(""" 
            "Edad" %s
            "altura de" %s
            "con peso de" %s
            "Nombre" %s
                
                """.formatted(edad, altura, weight, name));

    }

    
    // Comentario de una linea
    /* Comentario multilinea */
}