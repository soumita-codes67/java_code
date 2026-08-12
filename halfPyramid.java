import java.util.Scanner;
class index{
    void pattern(int a){
        for(int i=0;i<a;i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class halfPyramid{
    public static void main(String[] args) {
        Scanner a1= new Scanner(System.in);
        System.out.print("enter row: ");
        int a= a1.nextInt();
        
        index ind= new index();
        ind.pattern(a);

        a1.close();
    }
}