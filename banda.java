public class banda {
    public static void main(Strings[] args){
        String name = "GNR";
        short peopleNum = 5;
        int lpSales = 40_000;
        short singles = 40;
        String city = "Los Angeles"

        System.out.println("""
                "El grupo" %s
                "procedente de" %s
                "con " %s "integrantes"
                "ha vendido" %i "copias de sus" %s "singles"
                """.formatted(name, city, peopleNum, lpSales, singles) ;)
    }
}