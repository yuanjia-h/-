public class Fibonacci {
    public static int Fibonacci(int n){
        if (n==1||n==2){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            //打印Fibonacci(1-10),上输出具体值
            System.out.println(Fibonacci(i)+" ");
        }
    }
}
