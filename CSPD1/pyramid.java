import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1-300 : ");
        int userInput = sc.nextInt();

        //หาไม่ตรงเงื่อนไข
        if(userInput <= 0 || userInput > 300){
            System.out.println("ไม่ตรงตามเงื่อนไข");
            return;
        }
        //pyramid
        for(int i = 1 ; i <= userInput ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
