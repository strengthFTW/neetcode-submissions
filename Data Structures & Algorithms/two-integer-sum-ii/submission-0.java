class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = numbers[left] + numbers[right];
            if(sum > target) {
                right--;
            }
            else if(sum < target) {
                left++;
            }
        }
        return new int[] {left+1,right+1};
    }
}
