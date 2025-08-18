package java_solutions;

public class remove_element {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));

    }
    public static int removeElement(int[] nums, int val) {
      
        // length of 0
        if(nums.length==0)
          return 0;
  
        // length of 1
        if(nums.length==1){
          if(nums[0]==val){
              return 0;
          }
          else
              return 1;
        }
  
        int k=0;
        int i=0;
  
        while(i<nums.length && nums[i]!=-1){
          if(nums[i]==val){
              
              // check if it's the last element or last element to be checked
              if(i+1==nums.length || i==nums.length-1-k){
                  k++;
                  break;
              }
  
              // loop back from end until you find a value that's not k
              while(nums.length-1-k>0 && nums[nums.length-1-k]==val){
                  nums[nums.length-1-k] = -1;
                  k++;
  
                  if(nums.length-1-k >=0 && nums[nums.length-1-k]==-1)
                      return k;
                  
                  // check to see if you are at your current value
                  if(i==nums.length-1-k){
                      k++;
                      return nums.length-k;
                  }
              }
              
              // "swap"
              nums[i] = nums[nums.length-1-k];
              nums[nums.length-1-k] = -1;
              k++;
          }
  
          i++;
        }
  
        return nums.length-k;
      }
    
}
