class Test
{ 
    static void test(int num, int den) throws ArithmeticException{
        System.out.println("num/" + den + "=" + num / den); // test method
    }
}

public class Ex13_10 extends Test{
    public static void main(String[] args) { // main() can self-throw"s" exception
        try {
            test(4, 0); // directly took test method
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // directly print specified exception message
        }
    }
}