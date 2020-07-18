package 面试;

public class 找出最大的k个数 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,1,1,1,8,8,8,8,8,1,8,1,1};
        int k=6;
        int i=0;
        int j=nums.length-1;
        //helper1(nums,i,j,nums.length-1-k);
        helper2(nums,k);
    }
    public static  void helper1(int [] nums,int i ,int j ,int k){
        int temp=nums[i];
        int low=i;
        int high=j;
        //由于是递归，所以要有结束条件
        //为什么i=j，相当于只有一个数，则不必再判断退出，不然会越界
        if(i==k){
            for(int n=k;n<nums.length-1;n++){
                System.out.print(nums[n]);
            }
            return;
        }
        //这里有一个循环，当i=j时候才结束
        while(i!=j){
            //当i=j时候退出
            while(i<j&&nums[j]>temp){
                j--;
            }
            //当i=j时候退出
            if(i<j){
                nums[i]=nums[j];
                i++;
            }
            //当i=j时候退出
            while(i<j&&nums[i]<=temp){
                i++;
            }
            //当i=j时候退出
            if(i<j){
                nums[j]=nums[i];
                j--;
            }
        }
        nums[i]=temp;
        if(i>k){
            helper1(nums,low,i-1,k);
        }
        if(k>i){
            helper1(nums,i+1,high,k);
        }
    }
    //利用大顶堆查找k个最大的数
     public static  void helper2(int[] nums,int k){
        int[] arr=new int[k];
        System.arraycopy(nums,0,arr,0,k);
        //for(Integer i:arr){
        //    System.out.print(i);
        //}
         //注意边界条件，球球了
         //不要再把索引当成值了
         //球球你惹，细心点
         for(int i=(arr.length)/2-1;i>=0;i--){
             helper3(arr,i);
         }
        // helper3(arr,0);
//         for(Integer i:arr){
//             System.out.print(i);
//         }
         for(int j=k;j<nums.length;j++){
             if(nums[j]>arr[0]){
                 arr[0]=nums[j];
                 helper3(arr,0);
             }
         }
         for(Integer i:arr){
             System.out.print(i);
         }

     }
     //树调整函数
     public static  void helper3(int[] nums,int i ){
         int index=2*i+1;
         while(index<nums.length){
             //太粗心，下标能不能想好再做
             //nums[index+1]>nums[i]？？？？
             if(index+1<nums.length&&nums[index+1]<nums[index]){
                 index++;
             }
             if(nums[index]<nums[i]){
                 int temp=nums[i];
                 nums[i]=nums[index];
                 nums[index]=temp;
                 i=index;
                 index=2*i+1;
             }else{
                 break;
             }
         }
     }
}
