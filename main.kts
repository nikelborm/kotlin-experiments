class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}

fun node(left: TreeNode?, value: Int, right: TreeNode?): TreeNode {
  val newNode = TreeNode(value)
  newNode.left = left
  newNode.right = right
  return newNode
}



class Solution {
  fun step(node: TreeNode, traceToParentStack: MutableList<TreeNode>, ret: MutableList<Int>): TreeNode {
    if(node.left !== null) {
      traceToParentStack.add(node)
      return node.left
    }
    if(node.right !== null) {
      traceToParentStack.add(node)
      return node.right
    }
    ret.add(node.`val`)


    var leftLeaf = root
    while(leftLeaf?.left !== null) {
      stack.add(leftLeaf)
      leftLeaf = leftLeaf!!.left
    }
    return leftLeaf
  }

  fun postorderTraversal(root: TreeNode?): List<Int> {
    if (root === null) return listOf<Int>();

    val mutableList = mutableListOf<Int>();

    val stack = mutableListOf<TreeNode>();
    var currentNode = root;

    // going down
    while(currentNode?.left !== null) {
      stack.add(currentNode)
      currentNode = currentNode!!.left
    }
    println(stack)

    // while(currentNode !== root) {

    // }


    return mutableList.toList()

  }
}

val sol = Solution()

val test = mapOf(
  node(null, 1, node(TreeNode(3), 2, null)) to listOf(3, 2, 1),

  node(
    node(TreeNode(1), 3, TreeNode(2)),
    7,
    node(TreeNode(4), 6, TreeNode(5))
  ) to listOf(1, 2, 3, 4, 5, 6, 7)
)

for (i in test) {
  val result = sol.postorderTraversal(i.key);

  // if (result !== i.value)
  //   throw Exception("postorderTraversal(${i.key})=${result}. Expected ${i.value}")
  // println("postorderTraversal(${i.key}) is fine ❤️ ")
}
