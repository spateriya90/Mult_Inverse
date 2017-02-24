/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package multinverse;

import java.util.Scanner;

/**
 *
 * @author Siddharth1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner user_input = new Scanner(System.in);
 int a,b;
 int[] c;
        System.out.print("To find multiplicative inverse of a mod b");
        System.out.println("Enter a");
         a = Integer.parseInt(user_input.next());
        System.out.println("Enter b");
        b =  Integer.parseInt(user_input.next());
        c =     ExtEuclid(a,b);
        System.out.println(c[0] + "\n" + c[1] + "\n" + (c[2] + b)%b);

    }

    public static int[] ExtEuclid(int a, int b) {
        int[] ans = new int[3];
        int q;

        if (a == 0)  {             ans[0] = b;
            ans[1] = 1;
            ans[2] = 0;
        }
        else
            {                   q = b/a;
               ans = ExtEuclid (b % a, a );
               int temp = (ans[1] - ans[2]*q );
               ans[1] = ans[2];
               ans[2] = (temp);
            }

        return ans;

    }

}
