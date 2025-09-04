import java.util.*;
class BirthdayCakeCandles{
    public void birthdayCakeCandles(int[] arr){
        int count=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    for(int num:arr){
        if(num==max){
            count+=1;
        }
    }
    System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BirthdayCakeCandles s=new BirthdayCakeCandles();
        s.birthdayCakeCandles(arr);
    }
}
