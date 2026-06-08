class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String words : strs) {
            String freqstr = get_freq_str(words);

            if (map.containsKey(freqstr)) {
                map.get(freqstr).add(words);
            } else {
                List<String> strlist = new ArrayList<>();
                strlist.add(words);
                map.put(freqstr, strlist);
            }
        }
        return new ArrayList<>(map.values());
    }
    public String get_freq_str(String str) {
        int arr[] = new int[26];
        for(char c : str.toCharArray()) {
            arr[c - 'a']++;
        }
        StringBuilder freqstr = new StringBuilder("");
        char c = 'a';
        for(int i : arr) {
            freqstr.append(c);
            freqstr.append(i);
            c++;
        }
        return freqstr.toString();
    }
}
