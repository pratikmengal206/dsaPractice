/**
 * LeetCode
 */
import java.util.*;

public class BinToDec {

public static int bintodec(int a){

    int pow = 0;
    int dec = 0;


    while (a>0) {
        int ld = a%10;
        dec += (ld*(int)Math.pow(2, pow)); 
        pow++;
        a/=10;
    }

    return dec;

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inpute a Binary Number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Decimal of Binary no: ("+n+") is: "+bintodec(n));
    }
}
