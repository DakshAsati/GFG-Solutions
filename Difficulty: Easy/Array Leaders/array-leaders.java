class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int leader = arr[n-1];
        result.add(leader);
      
      
        for(int i = n -2; i >= 0; i--){
            if(arr[i] >= leader){
                leader = arr[i];
                result.add(leader);
            }
        }
        
        ArrayList<Integer> reversed = new ArrayList<>();
        
        for(int i = result.size() - 1; i >= 0; i--){
            reversed.add(result.get(i));
        }
        return reversed;
    }
}
