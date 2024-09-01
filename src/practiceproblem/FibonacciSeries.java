package practiceproblem;
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1,y=2;
        System.out.println(x);
        System.out.println(y);

        for(int i=3;i<=n;i++){
            int z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }
    }
}
