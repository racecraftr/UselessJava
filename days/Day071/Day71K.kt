package UselessJava.days.Day071

import java.util.*

class Day71K {
  companion object{
    @JvmStatic fun stringDepth(s: String): Int{
      val root = NodeK(s[0])
      for(i in 1 until s.length){
        root.add(s[i])
      }
      return NodeK.maxDepth(root)
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    print("Enter a string>>\t")
    val s = sc.nextLine();
    println("The depth of the string is " + Day71K.stringDepth(s))
  }
}

class NodeK (val c: Char){
  var left: NodeK? = null
  var right: NodeK? = null

  fun add(c: Char){
    //go to left
    if(c < this.c){
      if(left == null) {
        left = NodeK(c)
      }
      else {
        left!!.add(c)
      }
    }
    // go to right
    else{
      if(right == null){
        right = NodeK(c)
      }
      else {
        right!!.add(c)
      }
    }
  }

  companion object{
    @JvmStatic fun maxDepth(node: NodeK?) : Int{
      if(node == null) {
        return -1;
      }
      val lDepth = maxDepth(node.left)
      val rDepth = maxDepth(node.right)

      return if(lDepth > rDepth){
        lDepth + 1
      } else {
        rDepth + 1
      }
    }
  }
}