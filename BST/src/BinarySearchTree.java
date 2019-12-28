import java.util.Stack;

/**
 * @ClassName BinarySearchTree
 * @Description 二分搜索树类
 * @author Yin Guiqing
 * @date 2019年6月7日 上午10:35:02
 */
public class BinarySearchTree<E extends Comparable<E>> {

	/**
	 * @ClassName Node
	 * @Description Node节点私有类
	 * @author Yin Guiqing
	 * @date 2019年6月7日 上午10:38:34
	 */
	private class Node {
	    //节点值
	    public E e;
		//左孩子，右孩子
		public Node left, right;
		/**
         * @Description Node构造函数
         * @author Yin Guiqing
         * @date 2019年6月7日 上午10:37:38
         */
		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	//根节点
	private Node root;
	//树中节点个数
	private int size;
	
	/**
     * @Description BST构造函数
     * @author Yin Guiqing
     * @date 2019年6月7日 上午10:40:14
     */
	public BinarySearchTree() {
		root = null;
		size = 0;
	}
	
	/**
     * @Description 获取树中节点个数
     * @author Yin Guiqing
     * @date 2019年6月7日 上午10:43:16
     * @return int
     * @throws
     */
	public int size() {
		return size;
	}
	
	/**
     * @Description 查看树是否为空
     * @author Yin Guiqing
     * @date 2019年6月7日 上午10:43:56
     * @return boolean
     * @throws
     */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
     * @Description 添加元素方法
     * @author Yin Guiqing
     * @date 2019年6月7日 上午10:59:50
     * @param e 
     * @return void
     * @throws
     */
	public void add(E e) {
		root = add(root, e);
	}
	
	/**
     * @Description 私有方法，递归，向以node为根的二分搜索树中插入元素e
     * 返回插入新节点后，二分搜索树的根
     * @author Yin Guiqing
     * @date 2019年6月7日 上午11:47:47
     * @param node
     * @param e
     * @return Node
     * @throws
     */
	private Node add(Node node, E e) {
	    //递归终止条件
		if (node == null) {
			size ++;
			return new Node(e);
		}
		
		//递归操作
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		}
		else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}
		
		return node;
	}
	
	/**
     * @Description 查看二分搜索树中是否包含元素e
     * @author Yin Guiqing
     * @date 2019年6月7日 下午2:48:29
     * @param e
     * @return boolean
     * @throws
     */
	public boolean contains(E e) {
		return contains(root, e);
	}
	
	/**
     * @Description 私有方法，递归，查看以node为根的二分搜索树中是否包含元素e
     * @author Yin Guiqing
     * @date 2019年6月7日 下午2:58:21
     * @param node
     * @param e
     * @return boolean
     * @throws
     */
	private boolean contains(Node node, E e) {
		if (node == null) {
			return false;
		}
		
		if (e.compareTo(node.e) == 0) {
			return true;
		}
		else if (e.compareTo(node.e) < 0) {
			return contains(node.left, e);
		}
		else {
			return contains(node.right, e);
		}
	}
	
	/**
     * @Description 前序遍历
     * @author Yin Guiqing
     * @date 2019年6月7日 下午3:08:20 
     * @return void
     * @throws
     */
	public void preOrder() {
		preOrder(root);
	}
	
	/**
     * @Description 私有方法，递归，前序遍历以node为根的二叉树
     * @author Yin Guiqing
     * @date 2019年6月7日 下午3:09:27
     * @param node 
     * @return void
     * @throws
     */
	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		
		System.out.println(node.e);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	/**
	 * @Description 二分搜索树非递归前序遍历
	 * @author Yin Guiqing
	 * @date 2019年6月8日
	 * @return void
	 * @throws
	 */
	public void preOrderNR() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.println(current.e);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }
	
	/**
     * @Description 中序遍历
     * @author Yin Guiqing
     * @date 2019年6月7日 下午4:09:12 
     * @return void
     * @throws
     */
    public void inOrder() {
        inOrder(root);
    }
    
    /**
     * @Description 私有方法，递归，中序遍历以node为根的二叉树
     * @author Yin Guiqing
     * @date 2019年6月7日 下午4:10:16
     * @param node 
     * @return void
     * @throws
     */
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }
    
    /**
     * @Description 后序遍历
     * @author Yin Guiqing
     * @date 2019年6月7日 下午4:09:12 
     * @return void
     * @throws
     */
    public void postOrder() {
        postOrder(root);
    }
    
    /**
     * @Description 私有方法，递归，后序遍历以node为根的二叉树
     * @author Yin Guiqing
     * @date 2019年6月7日 下午4:10:16
     * @param node 
     * @return void
     * @throws
     */
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }
	
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

	    StringBuilder result = new StringBuilder();
	    generateBstString(root, 0, result);
	    
	    return result.toString();
	}
	
    /**
     * @Description 生成以node为根节点，深度为depth的描述二叉树的字符串
     * @author Yin Guiqing
     * @date 2019年6月7日 下午3:36:31 
     * @return void
     * @throws
     */
    private void generateBstString(Node node, int depth, StringBuilder result) {
        if (node == null) {
            result.append(generateDepthString(depth) + "null\n");
            return;
        }
        result.append(generateDepthString(depth) + node.e +"\n");
        generateBstString(node.left, depth + 1, result);
        generateBstString(node.right, depth + 1, result);
    }
    
    /**
     * @Description 用--描述二叉树的深度
     * @author Yin Guiqing
     * @date 2019年6月7日 下午3:42:11
     * @param depth
     * @return String
     * @throws
     */
    private String generateDepthString(int depth) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            result.append("--");
        }
        return result.toString();
    }
	
}
