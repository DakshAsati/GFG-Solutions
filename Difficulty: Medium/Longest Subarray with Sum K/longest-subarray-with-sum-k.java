// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        
        int sum = 0; int maxlength = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            
              if(sum == k){
                maxlength = i + 1;
            
        }
        if(map.containsKey(sum - k)){
            int length = i - map.get(sum - k);
            maxlength = Math.max(maxlength, length);
        }
        if(!map.containsKey(sum)){
            map.put(sum, i);
        }
            
        
      
        }
        return maxlength;
        
    }
}
