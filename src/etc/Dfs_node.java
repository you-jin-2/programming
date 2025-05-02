package etc;

import java.util.LinkedList;
import java.util.Queue;

public class Dfs_node   {
	Node root;

	public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0; // level
        while (!Q.isEmpty()) {
            int len = Q.size(); // 레벨 당 원소개수
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) Q.offer(cur.lt); // 왼쪽 자식이 있으면 offer
                if (cur.rt != null) Q.offer(cur.rt); // 오른쪽 자식이 있으면 offer
            }
            L++; // level 1 증가
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	Dfs_node tree = new Dfs_node();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
 
}


class Node {
    int data;
    Node lt, rt;  // 왼쪽 주소, 오른쪽 주소 저장

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

 