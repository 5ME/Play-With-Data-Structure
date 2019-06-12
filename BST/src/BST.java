/**
 * 
 */

/**
 * @ClassName BST
 * @Description ������������
 * @author Yin Guiqing
 * @date 2019��6��7�� ����10:35:02
 */
public class BST<E extends Comparable<E>> {

	/**
	 * @ClassName Node
	 * @Description Node�ڵ�˽����
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����10:38:34
	 */
	private class Node {
		//�ڵ�ֵ
		public E e;
		//���ӣ��Һ���
		public Node left, right;
		/**
		 * @Description Node���캯��
		 * @author Yin Guiqing
		 * @date 2019��6��7�� ����10:37:38
		 */
		public Node(E e) {
			this.e = e;
			left = null;
			right = null;
		}
	}
	
	//���ڵ�
	private Node root;
	//���нڵ����
	private int size;
	
	/**
	 * @Description BST���캯��
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����10:40:14
	 */
	public BST() {
		root = null;
		size = 0;
	}
	
	/**
	 * @Description ��ȡ���нڵ����
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����10:43:16
	 * @return int
	 * @throws
	 */
	public int size() {
		return size;
	}
	
	/**
	 * @Description �鿴���Ƿ�Ϊ��
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����10:43:56
	 * @return boolean
	 * @throws
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @Description ���Ԫ�ط���
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����10:59:50
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void add(E e) {
		root = add(root, e);
	}
	
	/**
	 * @Description ˽�з������ݹ飬����nodeΪ���Ķ����������в���Ԫ��e
	 * ���ز����½ڵ�󣬶����������ĸ�
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����11:47:47
	 * @param node
	 * @param e
	 * @return Node
	 * @throws
	 */
	private Node add(Node node, E e) {
		//�ݹ���ֹ����
		if (node == null) {
			size ++;
			return new Node(e);
		}
		
		//�ݹ����
		if (e.compareTo(node.e) < 0) {
			node.left = add(node.left, e);
		}
		else if (e.compareTo(node.e) > 0) {
			node.right = add(node.right, e);
		}
		
		return node;
	}
	
	/**
	 * @Description �鿴�������������Ƿ����Ԫ��e
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����2:48:29
	 * @param e
	 * @return boolean
	 * @throws
	 */
	public boolean contains(E e) {
		return contains(root, e);
	}
	
	/**
	 * @Description ˽�з������ݹ飬�鿴��nodeΪ���Ķ������������Ƿ����Ԫ��e
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����2:58:21
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
	 * @Description ǰ�����
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����3:08:20 
	 * @return void
	 * @throws
	 */
	public void preOrder() {
		preOrder(root);
	}
	
	/**
	 * @Description ˽�з������ݹ飬ǰ�������nodeΪ���Ķ�����
	 * @author Yin Guiqing
	 * @date 2019��6��7�� ����3:09:27
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
     * @Description �������
     * @author Yin Guiqing
     * @date 2019��6��7�� ����4:09:12 
     * @return void
     * @throws
     */
    public void inOrder() {
        inOrder(root);
    }
    
    /**
     * @Description ˽�з������ݹ飬���������nodeΪ���Ķ�����
     * @author Yin Guiqing
     * @date 2019��6��7�� ����4:10:16
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
     * @Description �������
     * @author Yin Guiqing
     * @date 2019��6��7�� ����4:09:12 
     * @return void
     * @throws
     */
    public void postOrder() {
        postOrder(root);
    }
    
    /**
     * @Description ˽�з������ݹ飬���������nodeΪ���Ķ�����
     * @author Yin Guiqing
     * @date 2019��6��7�� ����4:10:16
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
	
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

	    StringBuilder result = new StringBuilder();
	    generateBSTString(root, 0, result);
	    
	    return result.toString();
	}
	
	/**
     * @Description ������nodeΪ���ڵ㣬���Ϊdepth���������������ַ���
     * @author Yin Guiqing
     * @date 2019��6��7�� ����3:36:31 
     * @return void
     * @throws
     */
    private void generateBSTString(Node node, int depth, StringBuilder result) {
        if (node == null) {
            result.append(generateDepthString(depth) + "null\n");
            return;
        }
        result.append(generateDepthString(depth) + node.e +"\n");
        generateBSTString(node.left, depth + 1, result);
        generateBSTString(node.right, depth + 1, result);
    }
    
    /**
     * @Description ��--���������������
     * @author Yin Guiqing
     * @date 2019��6��7�� ����3:42:11
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
