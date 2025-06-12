class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        
        dfsHelper(0,adj,visited,result);
        
        return result;
        
    }
    
    private void dfsHelper(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result){
        visited[node] = true;
        result.add(node);
        
        for(int i = 0; i < adj.get(node).size(); i++){
            int n = adj.get(node).get(i);
            if(!visited[n]){
                dfsHelper(n,adj,visited,result);
            }
        }
    }
}