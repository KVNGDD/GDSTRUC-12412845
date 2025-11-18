public class Trees {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrderAsc() {
        if (root != null) {
            root.traverseInOrderAsc();
        }
    }
    public void traverseInOrderDesc() {
        if (root != null) {
            root.traverseInOrderDesc();
        }
    }

    public Node get(int value) {
        if (root == null) {
            return  null;
        }

        return  root.get(value);
    }

    public Node getMin() {
        if (root == null) {
            return  null;
        }

        return  root.getMin();
    }

    public Node getMax() {
        if (root == null) {
            return  null;
        }

        return  root.getMax();
    }
}