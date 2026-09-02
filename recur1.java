import java.util.*;
class recur1{
    void numm(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        numm(n-1);
    }
    public static void main(String[] args) {
        recur1 ob = new recur1();
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number: ");
        int n=sc.nextInt();
        ob.numm(n);
        sc.close();
    }
}