
import java.util.Scanner;
class solidPattern{
    public static void main(String[] args){
        int k;
        int l;
        Scanner a1= new Scanner(System.in);
        System.out.print("enter row: ");
        int i= a1.nextInt();
        System.out.print("enter column: ");
        int j= a1.nextInt();
        for(k=0;k<i;k++){
            for(l=0;l<j;l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        a1.close();
    }
}