import java.util.Scanner;
public class recur5 {
    public static void printfb(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfb(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter nth term: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        printfb(a,b,n-2);
        sc.close();
    }

}
