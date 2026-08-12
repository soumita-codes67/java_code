import java.util.Scanner;
class hollowRectangle{
    void pattern(int a, int b){
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if(i==a || j==b ||i==1||j==1){
                    System.out
                    .print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner a1= new Scanner(System.in);
        System.out.print("Enter row: ");
        int a= a1.nextInt();
        System.out.print("Enter column: ");
        int b= a1.nextInt();
        hollowRectangle hr= new hollowRectangle();
        hr.pattern(a, b);

        a1.close();
    }
    
}