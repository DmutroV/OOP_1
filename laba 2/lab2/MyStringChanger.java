package lab2;

public class MyStringChanger {
    int k;
    String inString;
    String repString;
    String outString;

    public MyStringChanger(String inString, String repString, int k) {
        this.inString = inString;
        this.repString = repString;
        this.k = k;
        change();
    }
    public void change(){
        StringBuilder strBldr = new StringBuilder(inString);
        int counter = 0;
        for (int i = 0; i < strBldr.length(); i++) {
            if (strBldr.charAt(i) != ' ')
                counter++;
            else {
                if (counter == k)
                    strBldr.replace(i-k, i, repString);
                counter = 0;
            }
        }
        if (counter == k)
            strBldr.replace(strBldr.length()-k, strBldr.length(), repString);
        outString = strBldr.toString();
    }
    public String getOutString() {
        return outString;
    }
}
