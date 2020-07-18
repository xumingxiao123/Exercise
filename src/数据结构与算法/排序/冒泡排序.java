package 数据结构与算法.排序;

public class 冒泡排序 {
       public  static  int [] arraySort(int [] nums){
           for(int j=1;j<nums.length;j++){
               boolean  M=false;
               for(int i=0;i<nums.length-j;i++){
                   if(nums[i]>nums[i+1]){
                       int temp= nums[i];
                       nums[i]=nums[i+1];
                       nums[i+1]=temp;
                       M=true;
                   }
               }
               if(!M) return nums;
           }

           return nums;
       }
}
