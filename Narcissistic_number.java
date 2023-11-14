public class Narcissistic_number {
    public static void main(String[] args) {
        //c,b,a分别表示个，十，百位
        int a;
        int b;
        int c;
        for (int sum=100;sum<=999;sum++){
            //把个十百位上的数字拿下来求立方再相加，和原数相等的打印输出
            a=(sum-sum%100)/100;
            b=(sum%100)/10;
            c=sum%10;
            if ((a*a*a)+(b*b*b)+(c*c*c)==sum){
                System.out.println(sum);
            }
        }
    }
}
