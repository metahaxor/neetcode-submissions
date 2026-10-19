class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int tmp = target - numbers[i];
            if (hm.containsKey(tmp)) {
                return new int[] {hm.get(tmp), i + 1};
            }
            hm.put(numbers[i], i + 1);
        }
        return new int[0];
    }
}
