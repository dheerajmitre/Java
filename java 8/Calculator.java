package Basicj.Java8Ex;

interface Square {
    int calculate(int x, int y);
}

class Test {

    public static void main(String args[]) {
        int a = 100;
        int b = 10;

        // lambda expression to define the calculate method

        Square s = (int x, int y) -> x * y;
        Square Add = (int x, int y) -> x + y;
        Square div = (int x, int y) -> x / y;
        Square Sub = (int x,int y) -> x - y;

        int answer = s.calculate(a, b);
        int result = Add.calculate(a, b);
        int Div = div.calculate(a, b);
        int sub = Sub.calculate(a,b);

        System.out.println(answer);
        System.out.println(result);
        System.out.println(Div);
        System.out.println(sub);

    }
}
