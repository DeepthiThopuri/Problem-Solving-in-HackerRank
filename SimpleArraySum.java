import java.util.*;
class Solution{
    public void arraySum(int[] arr){
        int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
       } 
       System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.arraySum(arr);
    }
}