public class statistic {

    static int itemsSum (int[] sumAllArray){
        int sum = 0;
        for(int i : sumAllArray){
            sum += i;
        }
        return sum;
    }
    
    static double averageArray (int[] data){
        double average = (double)itemsSum(data) / data.length;
        return average;
    }

    static double average (int... args){
        return averageArray(args);
    }

    public static void main(String[] args){
        int[] newarray = {3,566,3456,34,35};
        int sum = itemsSum(newarray);
        double avg = averageArray(newarray);
        System.out.println("Suma: " + sum);
        System.out.println("Media: " + avg);
    }
}