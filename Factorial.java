import java.util.Scanner;
class Factorial {
    int f=1;
    void calculate(int a){
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("factorial of "+a+" is "+f);
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("enter number: ");
        int a= sc.nextInt();
        if(a>0){
            Factorial Fc=new Factorial();
            Fc.calculate(a);
        }
        else if(a==0){
            System.out.println("factorial is 1");
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
