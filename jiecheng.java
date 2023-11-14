import java.util.Scanner;
public class jiecheng {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十以内的整数:");
        int n= input.nextInt();
        int sum=1;
        for (int i=n;i>0;i--){
            sum*=i;
        }
        System.out.println(n+"的阶乘为"+sum);
    }
}
