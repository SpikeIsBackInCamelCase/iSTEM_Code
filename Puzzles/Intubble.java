public class Intubble {
    String type;
    private int valueInt;
    private byte valueByte;
    private short valueShort;
    private long valueLong;
    private double valueDouble;
    private float valueFloat;




    public Intubble(long value){
        if ((value<128)&&(value>-129)){
            this.type = "byte";
            this.valueByte=(byte)value;
        } else if((value<32767) && (value>-32768)){
            this.type = "short";
            this.valueShort = (short)value;
        } else if ((value<=2147483647)&&(value>=-2147483648)){
            this.type = "int";
            this.valueInt = (int)value;
        } else{
            this.type = "long";
            this.valueLong = value;
        }
    }

    public Intubble(double value) {
        double ogValue = value;
        int frontProtector = (int) value;
        String number = value + "";
        String numberReversed = "";
    
        for (int cursor = (number.length() - 1); cursor > -1; cursor--) {
            numberReversed += number.charAt(cursor);
        }
    
        char charCursor = '0';
        int intCursor = 0;
    
        while (charCursor == '0') {
            charCursor = numberReversed.charAt(intCursor);
            if (charCursor != '0') {
                break;
            } else {
                numberReversed = numberReversed.substring(intCursor + 1);
                intCursor++;
            }
        }
    
        if (numberReversed.length() - frontProtector <= 8) {
            this.valueFloat = (float) ogValue;
            this.type = "float";
        } else {
            this.valueDouble = ogValue + value;
            this.type = "double";
        }
    }

    public byte VB(){
        return valueByte;
    }

    public short VS(){
        return valueShort;
    }

    public int VI(){
        return valueInt;
    }

    public long VL(){
        return valueLong;
    }
    
    public double VD(){
        return valueDouble;
    }

    public float VF(){
        return valueFloat;
    }
}
