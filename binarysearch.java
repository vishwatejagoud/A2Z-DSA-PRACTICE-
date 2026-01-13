import java.util.*;
public class binarysearch {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    System.out.println(binarysearch(nums,target));

    
}

public static int binarysearch(int[] nums,int target){
    int left=0;
    int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
}
}