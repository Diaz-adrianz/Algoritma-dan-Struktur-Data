// BinaryTree.java 
package tugas_12;

class Node {

    Node left, right;
    String data;
    int height;

    public Node() {
        left = null;
        right = null;
        data = "";
        height = 1;
    }

    public Node(String n) {
        left = null;
        right = null;
        data = n;
        height = 1;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public void setRight(Node n) {
        right = n;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(String d) {
        data = d;
    }

    public String getData() {
        return data;
    }
}

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(String data) {
        root = insert(root, data);
    }

    static int height(Node N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = 1 + Math.max(height(y.left),
                height(y.right));
        x.height = 1 + Math.max(height(x.left),
                height(x.right));
        return x;
    }

    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = 1 + Math.max(height(x.left),
                height(x.right));
        y.height = 1 + Math.max(height(y.left),
                height(y.right));
        return y;
    }

    static int getBalance(Node N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    static Node insert(Node node, String value) {
        if (node == null) {
            return new Node(value);
        }

        if (value.compareTo(node.data) < 0) {
            node.left = insert(node.left, value);
        } else if (value.compareTo(node.data) > 0) {
            node.right = insert(node.right, value);
        } else {
            return node;
        }
        node.height = 1 + Math.max(height(node.left),
                height(node.right));
        int balance = getBalance(node);
        if (balance > 1
                && value.compareTo(node.left.data) < 0) {
            return rightRotate(node);
        }
        if (balance < -1 && value.compareTo(node.right.data) > 0) {
            return leftRotate(node);
        }
        if (balance > 1
                && value.compareTo(node.left.data) > 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1
                && value.compareTo(node.right.data) < 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(Node r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(String val) {
        return search(root, val);
    }

    private boolean search(Node r, String val) {
        if (r.getData() == null ? val == null : r.getData().equals(val)) {
            return true;
        }
        if (r.getLeft() != null) {
            if (search(r.getLeft(), val)) {
                return true;
            }
        }
        if (r.getRight() != null) {
            if (search(r.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.println("- " + r.getData());
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(Node r) {
        if (r != null) {
            System.out.println("- " + r.getData());
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.println("- " + r.getData());
        }
    }

}
