public class person {
    public static void main(String[] args){
        byte age = 22;
        float height = 1.78f;
        double weight = 58.234234;
        String name = "Pepe";

        System.out.println("Name" + name);
        System.out.println(""" 
            "Edad" %s
            "altura de" %s
            "con peso de" %s
            "Nombre" %s
                
                """.formatted(age, height, weight, name));

    }

    
    // Comentario de una linea
    /* Comentario multilinea */
}