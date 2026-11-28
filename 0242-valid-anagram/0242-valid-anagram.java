class Solution {
    public boolean isAnagram(String s, String t) {

    //     if(s.length() != t.length()){
    //         return false;
    //     }else{
    //         HashMap<Character , Integer> map1 = new HashMap<>();
    //         HashMap<Character , Integer> map2 = new HashMap<>();

    //     for(int i = 0 ; i < s.length() ; i++){
    //         char ch = s.charAt(i);
    //         map1.put(ch , map1.getOrDefault(ch , 0) + 1);
    //     }
        
    //    for(int i = 0 ; i < s.length() ; i++){
    //         char ch = t.charAt(i);
    //         map2.put(ch , map2.getOrDefault(ch , 0) + 1);
    //     }


    //     if(map1.equals(map2)){
    //         return true;
    //     }else{
    //         return false;
    //     }


    int []arr = new int[26];

    for(int i = 0 ; i < s.length() ; i++){
        char ch = s.charAt(i);
        arr[ch-'a'] += 1;
    }

    for(int i = 0 ; i < t.length() ; i++){
        char ch = t.charAt(i);
        arr[ch-'a'] -= 1;
    }


    for(int i = 0 ; i < 26 ; i++){
        if(arr[i] != 0){
            return false;
        }
    }
    return true;

        }
    }