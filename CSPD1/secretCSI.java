import java.util.Scanner;

public class secretCSI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Find CS na bro : ");
        String userInput = sc.nextLine();

        //ไม่เกิน 1000 ตัว
        if(userInput.length() > 1000){
            System.out.println("กรุณากรอกไม่เกิน 1000 ตัวอักษร");
            return;
        }
        
        //เปลี่ยนตัวอักษรทุกตัวเป็น ใหญ่หรือเล็กทั้งหมดก็ด้ายย
        String newStr = userInput.toLowerCase();

        //หาคำว่า CS ว่าอยู่ตำเเหน่งไหนด้วย indexOf()
        int index = newStr.indexOf("cs");
        System.out.println(index);
    }
}
