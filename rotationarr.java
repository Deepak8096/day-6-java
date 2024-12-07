import java.util.*;
public class Main{
    public static void Main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,9};
        int k=3;
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+k)%n]=arr[i];
        }
        System.arraycopy(temp,0,arr,0,n);
        for(int i=0;i<ar.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}