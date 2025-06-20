package Countability;
import java.util.ArrayList;
import java.util.List;

public class CustomData {
    private String companyName;
    private String address;
    private String nif;
    private int tlf;

    private static List<CustomData> dataList = new ArrayList<CustomData>();

    private void printdata(){
        for (CustomData data : dataList) {
            System.out.println(data);
        }
    }
     

    public CustomData(String companyName, String address, String nif, int tlf){
        this.companyName = companyName;
        this.address = address;
        this.nif = nif;
        this.tlf = tlf;
        dataList.add(this);
        printdata(this.dataList);
    }
}
