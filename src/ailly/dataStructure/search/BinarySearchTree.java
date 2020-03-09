package ailly.dataStructure.search;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

  private Node root;

  class Node {

    private Key key;
    private Value value;
    private Node left;
    private Node right;
    private int nodeNum;

    public Node(Key key, Value value, int n) {
      this.key = key;
      this.value = value;
      this.nodeNum = n;
    }
  }

  public int size() {
    return size(root);
  }

  public int size(Node node) {
    if (node == null) {
      return 0;
    } else {
      return node.nodeNum;
    }
  }

  public Value get(Key key) {
    return get(root, key);
  }

  public Value get(Node node, Key key) {
    if (node == null) {
      return null;
    }
    int cmp = key.compareTo(node.key);
    if (cmp < 0) {
      return get(node.left, key);
    } else if (cmp > 0) {
      return get(node.right, key);
    } else {
      return node.value;
    }
  }

  public void put(Key key, Value value) {
    root = put(root, key, value);
  }

  public Node put(Node node, Key key, Value value) {
    if (node == null) {
      return new Node(key, value, 1);
    }
    int cmp = key.compareTo(node.key);
    if (cmp > 0) {
      node.right = put(node.right, key, value);
    } else if (cmp < 0) {
      node.left = put(node.left, key, value);
    } else {
      node.value = value;
    }
    node.nodeNum = size(node.left) + size(node.right) + 1;
    return node;
  }

  public int randNum(int x, int y) {
    return x + (int) (Math.random() * (y - x));
  }

  public static void main(String[] args) {
    BinarySearchTree<String, Integer> bst = new BinarySearchTree<>();
    String str = "Backpropagation allowed us to measure how each weight in the network "
        + "contributed to the overall error This ultimately allowed us to change these weights "
        + "using a different algorithm Gradient Descent";
    String[] strs = str.split(" ");
    for (String s : strs) {
      bst.put(s.trim(), bst.randNum(10, 200));
    }
    System.out.println("value of Backpropagation is " + bst.get("Backpropagation"));
  }
}
