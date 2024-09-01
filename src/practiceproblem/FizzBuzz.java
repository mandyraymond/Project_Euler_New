package practiceproblem;
import java.util.*;
public class FizzBuzz {
    public void impl1(int n) {

        for(int i=1;i<=n;i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public List<String> impl2(int n) {

        List<String> ret = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if( i % 3 == 0 && i % 5 == 0){
                ret.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                ret.add("Fizz");
            }
            else if(i % 5 == 0){
                ret.add("Buzz");
            }
            else{
                ret.add(i+"");
            }
        }
        return ret;
    }

    public int impl3(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if( i % 3 == 0 || i % 5 == 0){
                sum=sum+i;
            }
        }
        return sum;
    }

}
