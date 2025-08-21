package java_solutions;

public class jump_game_II {
    public static void main(String[] args){
        int[] nums = {9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int numJumps=0;
        int index=0;
        if(nums[0]==0)
            return numJumps;
        while(index<nums.length-1)
        {
            numJumps++;
            int jump = nums[index];

            // go through each possible jump
            for(int j=nums[index]-1; j>0; j--)
            {
                if(jump+index>=nums.length-1)
                    return numJumps;
                int curNextIndex = index+jump+nums[index+jump];
                if(index+j+nums[index+j]>curNextIndex)
                    jump = j;

            }

            index += jump;
        }

        return numJumps;

        /* want to rewrite algorithm
        what i should be comparing is for each possible jump, does the following jump get you to a 
        greater index that is nonzero? if it does, that's when you should change the jump.
        comparing the actual index to the array is more important than the jump value at the index*/
    }
    
}
