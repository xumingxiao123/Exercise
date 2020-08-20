import java.util.List;
//树的数据结构
class Node {
    public int id;
    public int val;
    public List<Node> children;
    //指向父节点
    Node next = null;
    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class 红点系统 {
    //将目标和父节点做减1操作
    void ResetNoticeCount(Node root ,int nodeId){
        Node node= dfs(root,nodeId);
        while(node!=null){
            node.val--;
            node=node.next;
        }
    }
    //找出符合要求的目标结点
    private Node dfs(Node root,int nodeId){
        if(root==null) return  null;
        if (root.id==nodeId) return root;
        Node node = null;
        for(int i=0;i<root.children.size();i++){
             node=dfs(root.children.get(i),nodeId);
        }
        return node;
    }

}
