import java.util.Scanner;

public class erf {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,4,5,5,6,7,7};
        System.out.println("请输入查找的数据：");
        Scanner input = new Scanner(System.in);
        try{
            int num=input.nextInt();
            int start_index=0;
            int end_index=arr.length;
            int mid=(start_index+end_index)/2;
           // System.out.println(start_index);

        //    System.out.println(end_index);
          //  System.out.println(mid);
            while(arr[mid]!=num){
                if (arr[mid]<num){
                    start_index=mid;
                }else{
                    end_index=mid;
                }
                if (start_index>=end_index){
                    break;
                }
                mid=(start_index+end_index)/2;
              //  System.out.println(mid);
              //  System.out.println(start_index);
              //  System.out.println(end_index);
            }
            if (arr[mid]==num){
                System.out.println("元素找到，位置是:"+mid);


                    for(int i = mid-1;i>start_index;i--){
                    if (arr[i]==arr[mid]){
                        System.out.println("元素找到，位置是："+i);
                    }
                }


                    for(int i = mid+1;i<end_index;i++){
                        if (arr[i]==arr[mid]){
                            System.out.println("元素找到，位置是："+i);
                        }
                    }

            }else{
                System.out.println("元素在此数组不存在");
            }
        }catch(Exception e){
            System.out.println("你输入数字不合法");
        }
    }
}

