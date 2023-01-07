class Solution {
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> output = new ArrayList<>();
        if(root ==null)
        return output;
        
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);

        while(!nodes.isEmpty()){
            Node curr = nodes.pop();
            if(curr != null){
                output.add(curr.val);

                for(int i= curr.children.size()-1; i>=0; i--){
                    nodes.push(curr.children.get(i));
                }
            }
        }
        return output;
    }
}