class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] freq = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int i=0; i<k; i++) {
            int max = 0;
            int max_val = 0;
            
            for(int key : map.keySet()) {
                if(map.get(key) > max_val) {
                    max_val = map.get(key);
                    max = key;
                }
            }

            freq[i] = max;
            map.remove(max);
        }
        return freq;
    }
}
