
import java.util.*;
class recur2{
  
    int numm(int n){
        if(n==0){
            return 0;
        }
        return n + numm(n-1);
    }
    public static void main(String[] args) {
        recur2 ob = new recur2();
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        int val=ob.numm(n);
        System.out.println(val);
        sc.close();
    }
}
