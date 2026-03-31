class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> two = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int diff = target - num;
            if(two.containsKey(diff)){
                return new int[]{two.get(diff),i};
            }
            two.put(num,i);
        }
        return new int[]{};
    }
}
