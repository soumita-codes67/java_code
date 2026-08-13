import java.util.Scanner;
class indexx{
    void pattern(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(a-(i+1));k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*(a-i);k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
class butterflyPattern{
    public static void main(String args[]){
        Scanner a1=new Scanner(System.in);
        System.out.print("enter row: ");
        int a=a1.nextInt();
        indexx ind= new indexx();
        ind.pattern(a);
        a1.close();
    }
}