package BaslangicSeviye.Metotlar;

public class Pratik2RecursiveFibonacci {

    static int Fibonacci(int n)
    {
        if(n==1||n==2) return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }


    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        System.out.print(" "+Fibonacci(5));


    }
}
