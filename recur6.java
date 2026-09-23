import java.util.Scanner;

public class recur6 {
    
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow1=power(x,n-1);
        int pow=x*pow1;
        return pow;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nth term: ");
        int n=sc.nextInt();
        System.out.print("enter term: ");
        int x=sc.nextInt();
        int val=power(x,n);
        System.out.print(val);
        sc.close();

    }
}
