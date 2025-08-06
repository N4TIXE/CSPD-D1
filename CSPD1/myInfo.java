import java.util.Scanner;

public class myInfo {
    public static void main(String[] args){
        //ถามข้อมูลก่อนเด้อสู
        Scanner sc = new Scanner(System.in);
        System.out.print("What ur name? : ");
        String name = sc.nextLine();
        System.out.print("What ur nickname? : ");
        String nickname = sc.nextLine();
        System.out.print("How old are u? : ");
        int age = sc.nextInt();
        System.out.print("How tall are u? (cm.) : ");
        double height = sc.nextDouble();
        System.out.print("How much do u weigh? (kg.) : ");
        double weight = sc.nextDouble();

        //หา BMI กันเถอะะ
        double changeM = height/100;
        double BMI = weight/(changeM*changeM);

        //อันนี้เเหละของเจงงง
        System.out.println("---------------------------------------------");
        System.out.printf("Name : %s%n",name);
        System.out.printf("Nickname : %s%n",nickname);
        System.out.printf("Age : %d%n",age);
        System.out.printf("height : %.1f weight : %.1f",height,weight);
        System.out.printf("BMI : %.4f%n",BMI);
        System.out.println("---------------------------------------------");
    }
}
