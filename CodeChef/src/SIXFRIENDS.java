import java.util.Scanner;

/**
 * @author Asif Tanim
 *
 * Problem Name: Six Friends
 * Problem Code: SIXFRIENDS
 * URl: https://www.codechef.com/problems/SIXFRIENDS
 *
 */
public class SIXFRIENDS {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for(int i=0; i<n; i++){
            String input = scan.nextLine();
            String[] arr = input.split(" ");
            int doubleBed = Integer.parseInt(arr[0]);
            int tripleBed = Integer.parseInt(arr[1]);

            if(doubleBed*3 > tripleBed*2){
                System.out.println(tripleBed*2);
            }else{
                System.out.println(doubleBed*3);
            }
        }
    }
}
