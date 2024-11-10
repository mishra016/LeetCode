/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    private HashMap<Node, Node> visited = new HashMap<>();

    public Node cloneGraph(Node node) {

        if(node == null){
            return null;
        }

        //if node was already cloned return teh clone
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        //clone the nodes
        Node copy = new Node(node.val);
        visited.put(node, copy);

        //clone neighbors recursively
        for(Node neighbor: node.neighbors){
            copy.neighbors.add(cloneGraph(neighbor));
        }


        return copy;
        // Node copy = new Node(node.val);

        // for(Node neighbor: node.neighbors){
        //     copy.neighbors.add(cloneGraph(neighbor));
        // }

        // return copy;
        
    }
}