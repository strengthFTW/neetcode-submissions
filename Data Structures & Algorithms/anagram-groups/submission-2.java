class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] arr = new int[26];

            for(char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            String key = Arrays.toString(arr);
            if(map.containsKey(key)) {
                map.get(key).add(s);
            }
            else{
                ArrayList<String> strlst = new ArrayList<>();
                strlst.add(s);
                map.put(key,strlst);
            }
                
            }
            return new ArrayList<>(map.values());
        }
    }

