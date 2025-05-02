package etc;

public class Bfs_node   {
	Node2 root;

    public void DFS(Node2 root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " "); //전위순회
            DFS(root.lt); 
             //System.out.print(root.data + " ");// 중위순회
            DFS(root.rt);
            //System.out.print(root.data + " "); //후위순회
/*
			   			   	   1
			   			2			 3
			   		4	   5  		6   7
			 전위순회 : 1 - 2 - 4 - 5 - 3 - 6 - 7
			중위순회 : 4 - 2 - 5 - 1 - 6 - 3 - 7
			후위순회 : 4 - 5 - 2 - 6 - 7 - 3 - 1
 * */
        }
    }

    public static void main(String[] args) {
    	Bfs_node tree = new Bfs_node();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.DFS(tree.root);
    }
 
}

class Node2 {
    int data;
    Node2 lt, rt;  // 왼쪽 주소, 오른쪽 주소 저장

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}
 
 