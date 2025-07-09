package local.data;

public class Text {

    void useStringBuffer(){
        StringBuffer sB = new StringBuffer();
        String text = "Heloo";
        // Son lo mismo pero stringBuilder es mas novedoso
        StringBuffer sBuffer = new StringBuffer(text);
        // StringBuilder sBuilder = new StringBuilder();
        sBuffer.append("-" + text);
        System.out.println(sBuffer);
        sBuffer.insert(3, "l");
        System.out.println(sBuffer);
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.useStringBuffer();
    }
}
