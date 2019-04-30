import java.util.LinkedList;

public class BST01_A {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int n[] = {50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
        System.out.println(BinarySearchTree.inorder(tree.root));
    }
}

class BinarySearchTree {
    static String s="";
    public static String inorder(BinaryTree root) {
//        if (root != null) {
//            inorder(root.left);
//            s=s+root.key+" ";
//            inorder(root.right);
//        }
//        return s;
        if(root==null) return "";
        return inorder(root.left)+" "+root.key+" "+inorder(root.right);
    }

    class BinaryTree {
        int key;
        BinaryTree left, right;

        public BinaryTree(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return Integer.toString(key);
        }
    }

    BinaryTree root;

    public void add(int key) {
        BinaryTree temp = root;
        if (root == null) {
            root = new BinaryTree(key);
            return;
        }
        while (temp != null) {
            BinaryTree parent = temp;
            if (temp.key < key) {
                temp = temp.right;
                if (temp == null) {
                    temp = new BinaryTree(key);
                    parent.right = temp;
                    break;
                }
            } else {
                temp = temp.left;
                if (temp == null) {
                    temp = new BinaryTree(key);
                    parent.left = temp;
                    break;
                }
            }
        }
        temp.key = key;
    }

//    public void add(int key) {
//        root = add(root, key);
//    }

    private BinaryTree add(BinaryTree tree, int key) {
        if (tree == null) return new BinaryTree(key);
        if (tree.key < key) tree.right = add(tree.right, key);
        else if (tree.key > key) tree.left = add(tree.left, key);
        else ; // value 삽입 시 else tree.value=value;
        return tree;
    }

    //    public BinaryTree search(int key) {
//        BinaryTree node=root;
//        while(node!=null){
//            if(node.key==key) return node;
//            if(node.key<key) node=node.right;
//            else node=node.left;
//        }
//        return node;
//    }
    public BinaryTree search(int key) {
        return searchRecur(root, key);
    }

    private BinaryTree searchRecur(BinaryTree node, int key) {
        if (node == null) return node;
        if (node.key == key) return node;
        if (node.key < key) return searchRecur(node.right, key);
        else return searchRecur(node.left, key);
    }

    @Override
    public String toString() {
        return levelOrder().toString();
    }

    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list = new LinkedList<>();
        LinkedList<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.removeFirst();
            list.add(node);
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
        }
        return list;
    }
}