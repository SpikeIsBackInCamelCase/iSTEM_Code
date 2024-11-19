class Emily {
    private String emilyInput, emilyOutput;
    private int count;
    public Emily(String input){
        emilyInput = input;
        emilyOutput = "";
    }
    private String morsify(char letterToReplace){
        switch (letterToReplace) {
            case 'A':
            case 'a':
                return ".-";
            case 'B':
            case 'b':
                return "-...";
            case 'C':
            case 'c':
                return "-.-.";
            case 'D':
            case 'd':
                return "-..";
            case 'E':
            case 'e':
                return ".";
            case 'F':
            case 'f':
                return "..-.";
            case 'G':
            case 'g':
                return "--.";
            case 'H':
            case 'h':
                return "....";
            case 'I':
            case 'i':
                return "..";
            case 'J':
            case 'j':
                return ".---";
            case 'K':
            case 'k':
                return "-.-";
            case 'L':
            case 'l':
                return ".-..";
            case 'M':
            case 'm':
                return "--";
            case 'N':
            case 'n':
                return "-.";
            case 'O':
            case 'o':
                return "---";
            case 'P':
            case 'p':
                return ".--.";
            case 'Q':
            case 'q':
                return "--.-";
            case 'R':
            case 'r':
                return ".-.";
            case 'S':
            case 's':
                return "...";
            case 'T':
            case 't':
                return "-";
            case 'U':
            case 'u':
                return "..-";
            case 'V':
            case 'v':
                return "...-";
            case 'W':
            case 'w':
                return ".--";
            case 'X':
            case 'x':
                return "-..-";
            case 'Y':
            case 'y':
                return "-.--";
            case 'Z':
            case 'z':
                return "--..";
            default:
                return letterToReplace + "";
        }
    }

    public void convertToMorseCode(String sentence) {
        for (int i = 0; i<sentence.length(); i++){
            emilyOutput+=morsify(sentence.charAt(i));
        }
    }

    public String set(){
        convertToMorseCode(this.emilyInput);
        return emilyOutput;
    }

    public String returnLength(){
        count = emilyOutput.length();
        return "This morse code segment is " + count + " characters long!";
    }

}