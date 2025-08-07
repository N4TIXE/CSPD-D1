import java.util.Scanner;

public class diamond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1-300 : ");
        int userInput = sc.nextInt();
        
        //หากไม่ตรงเงื่อนไข
        if(userInput <= 0 || userInput >=300){
            System.out.println("ไม่ตรงเงื่อนไขนะจร้าา");
            return;
        }
        //loop สร้างเพชรส่วนบน
        for(int i = 1; i <= userInput; i++){
            for(int j = 1; j <= userInput - i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //อันนี้ส่วนล่าง
        for(int i = userInput - 1 ; i >= 1 ;i--){
            for(int j  = 1;j <= userInput - i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i ;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
