package projecteulerproblemssolutions;
//Problem 1
//Multiples of 3 or 5
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000/the provided parameter value
 */
public class Problem1_Multiples_of_3_or_5 {
    static int solution1(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(i%3==0 || i%5==0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
