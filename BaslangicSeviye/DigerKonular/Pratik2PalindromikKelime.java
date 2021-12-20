package BaslangicSeviye.DigerKonular;

public class Pratik2PalindromikKelime {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;

    }
    static boolean isPalindrome3(String str) {
        str=str.trim();
        System.out.println(str);
        int n=str.length();
        String tempS="";

        if(n%2==0){
            for(int i = str.length()-1; i >= n/2; i--){
                tempS += str.charAt(i);
            }
            System.out.println(tempS);
        }
        else
        {
            for(int i = str.length()-1; i >= (n+1)/2; i--){
                tempS += str.charAt(i);
            }
            System.out.println(tempS);
        }


        return str.contains(tempS);
    }
    public static void main(String[] args) {
        //Örnek : abba , asa , kavak, kayak
        System.out.println(isPalindrome3("kavak"));


    }
}
