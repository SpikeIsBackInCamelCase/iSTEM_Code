public class ProgramRunner {

    public static void main(String args[]){
        
        for (int sierraNevada = 1000000; sierraNevada!=0; sierraNevada--) {
            System.out.println(sierraNevada+" bottles of beer on the wall! " + sierraNevada + " bottles of beer!\nTake one down, pass it around, " + (sierraNevada - 1) + " bottles of beer on the wall!");
        }
        System.out.println("No more beer left");
        
        
    }
    

}