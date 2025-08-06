import java.util.Scanner;

public class park {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("จอดกี่ชั่วโมงเเล้ววว : ");
        int totalTime = sc.nextInt();
        int sum; //เงินรวม

        //หากไม่ตรงเงื่อนไข
        if(totalTime > 1000){
            System.out.println("ไม่ตรงตามเงื่อนไข");
            return;
        }
        
        //คำนวนเงินตรงเน้
        if(totalTime <= 1){
            sum = totalTime * 20;
        }else if (totalTime <= 15){
            sum = 20 + (totalTime - 1) * 10;
        }else{
            int days = totalTime/24;
            int remainingHours = totalTime % 24;
            sum = days * 100;

            if(remainingHours <= 1){
                sum += remainingHours * 20;
            }else if (remainingHours <= 15){
                sum += 20 + (remainingHours - 1) * 10;
            }else{
                sum += 100;
            }
        }
        System.out.println(sum);
    }
}
