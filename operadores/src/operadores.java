public class operadores {
    public static void main(String[] args) throws Exception {
        String primeiroNum = "1";
        String segundoNum = "5";
        String num = primeiroNum + segundoNum;
        System.out.println(num);

        boolean bool = true;
        bool = !bool;
        System.out.println(bool);

        int a, b;
        a = 2;
        b = 5;

        String result = (a==b) ? "a = b" : "a != b";
        System.out.println(result);


    }
}
