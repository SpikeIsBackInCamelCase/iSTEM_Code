public class Tester {
    public static void main(String[] args) {
        ArrayHandler a = new ArrayHandler(new Number[]{45, 435, 3453453, 282, 45, 34, 2, .0000001});
        a.sort('s');
        a.print();
    }
}
