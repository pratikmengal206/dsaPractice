/**
 * LeetCode
 */
import java.util.*;

public class DecToBin {

public static int decToBin(int a){

    int pow = 0;
    int bin = 0;


    while (a>0) {
        int rem = a%2;
        bin += (rem*(int)Math.pow(10, pow)); 
        pow++;
        a/=2;
    }

    return bin;

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inpute a Decimal Number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Binary to Decimal no: ("+n+") is: "+decToBin(n));
    }
}
