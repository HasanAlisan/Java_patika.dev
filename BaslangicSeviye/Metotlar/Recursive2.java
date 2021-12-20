package BaslangicSeviye.Metotlar;

public class Recursive2 {

    static int as(int i)
    {
        if (i < 2) return 1;
        else
        {
            int result= i * as(i - 1);
            System.out.println("result:"+result);

            return result;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(as(3));
    }
}


