class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        int V = adj.size();
        boolean[] vis = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        
        q.add(0);
        vis[0] = true;
        
        
        while(!q.isEmpty()){
            int curr = q.remove();
            result.add(curr);
            
            for(int neighbour : adj.get(curr)){
                if(!vis[neighbour]){
                    q.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
        
        return result;
        
    }
}