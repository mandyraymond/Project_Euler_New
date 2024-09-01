package practiceproblem;
import java.util.*;
//Sum of n terms of arithmetic progression = n/2[2a + (n – 1)d]
//Sum of natural numbers formula = [n(n+1)]/2
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%7==0){
                System.out.println(i);
            }
        }
    }
}
