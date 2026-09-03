class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;
        int currentSum = 0;
        while(left<right) {
            currentSum = numbers[left]+numbers[right];
            if(currentSum>target) {
                right--;
            }
            if(currentSum < target) {
                left++;
            }
            else if(currentSum == target){
                break;
            }
            currentSum = 0;
        }
        return new int[]{left+1, right+1};
    }
}
