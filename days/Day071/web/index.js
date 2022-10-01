/*
JsNode class: represents a node in a binary tree. 
*/
class JsNode {
  constructor(c) {
    this.c = c;
    this.left = null;
    this.right = null;
  }

  add(c) {
    c += "";
    if (c.localeCompare(this.c) < 0) {
      if (this.left == null) {
        this.left = new JsNode(c);
      }
      else {
        this.left.add(c)
      }
    }

    else {
      if (this.right == null) {
        this.right = new JsNode(c);
      }
      else {
        this.right.add(c);
      }
    }
  }

  static maxDepth(node) {
    if (node == null) {
      return -1;
    }
    let lDepth = this.maxDepth(node.left);
    let rDepth = this.maxDepth(node.right);

    if (lDepth > rDepth) {
      return lDepth + 1;
    }
    else {
      return rDepth + 1;
    }
  }

}

function foo() {
  let input = $("#input").val();

  let chars = input.split("");
  let root = new JsNode(chars[0]);
  for (let i = 1; i < chars.length; i++) {
    root.add(chars[i]);
  }

  let output = "" + JsNode.maxDepth(root);
  document.getElementById("output").innerHTML = `This string is ${output} depths deep.`;
}