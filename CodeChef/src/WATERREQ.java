import java.util.Scanner;

/**
 * @author Asif Tanim
 *
 * Problem Name: Water Requirement
 * Problem Code: WATERREQ
 * URl: https://www.codechef.com/problems/WATERREQ
 *
 */
public class WATERREQ {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int input = scan.nextInt();
            System.out.println(input * 2);
        }
    }
}
