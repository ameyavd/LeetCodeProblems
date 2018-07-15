package leetcode;

public class MoveDuplicateCharsAtEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,1,2,2,3,4};
		MoveDuplicateCharsAtEndOfArray mv = new MoveDuplicateCharsAtEndOfArray();
		int res = mv.removeDuplicatesssss(nums);
		System.out.println(res);
		for(int i=0;i<res;i++){
			System.out.println(nums[i]);
		}

	}
	
	public int removeDuplicates(int[] nums) {
        int count = 0; int length = nums.length;
        for(int i=0;i<length-2;i++){
            for(int j=i+1;j<length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                    int counter = j;
                    int marker = 0;
                    while(marker<=length - 1- j || counter <= length-1-j){
                        int temp = nums[counter];
                        nums[counter] = nums[counter+1];
                        nums[counter+1] = temp;
                        counter++;
                        marker++;
                    }
                    length--;
                }
            }
        }
        
        return nums.length-count;
    }
	
	public int removeDuplicatesssss(int nums[]) {
		if(nums.length == 0 || nums.length == 1) return nums.length;
    int i=0, j=1;
    while(j<nums.length){
        if(nums[i] == nums[j]) j++;
        else{
	        i++;
	        nums[i] =nums[j];
	        j++;
	    }
    }
    return ++i;
    }
	


}
