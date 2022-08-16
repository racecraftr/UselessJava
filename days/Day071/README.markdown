## Day 71: Depth of a string
>The depth of a play is not determined by 
> the quantity of the words, or the looks of actors, 
> but rather by finding the maximum depth of that string when converte to a binary tree.

*~some guy, most likely~*

Takes in a string, and finds the depth of the binary tree. 
The root node is the first character of the string.

```java
class Node {
  char c;
  Node left, right;
  
  public Node(char c) {
    this.c = c;
    this.left = null;
    this.right = null;
  }
  
  public void add(char c) {
    //go to left
    if(c < this.c) {
      if(left == null) {
        left = new Node(c);
      }
      else {
        left.add(c);
      }
    }
    //go to right
    else {
      if(right == null) {
        right = new Node(c);
      }
      else {
        right.add(c);
      }
    }
  }
  
  public static int maxDepth(Node node) {
    if(node == null) {
      return - 1;
    }
    int lDepth = maxDepth(node.left);
    int rDepth = maxDepth(node.right);
    
    if(lDepth > rDepth) {return lDepth + 1;}
    else {
      return rDepth + 1;
    }
  }
}
```