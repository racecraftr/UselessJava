package UselessJava.days.Day071;

import java.util.Scanner;

public class Day71 {
  static int stringDepth(String s) {
    Node root = new Node(s.charAt(0));
    for(int i = 1; i < s.length(); i++) {
      root.add(s.charAt(i));
    }
    return Node.maxDepth(root);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.print("Enter a string>>\t");
      String s = sc.nextLine();
      System.out.println("The depth of the string is " + stringDepth(s));
    }
  }
}

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