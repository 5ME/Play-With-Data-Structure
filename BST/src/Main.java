/**
 * @ClassName Main
 * @Description 测试类
 * @author Yin Guiqing
 * @date 2019年6月7日 下午3:13:18
 */
public class Main {

    /**
     * @Description main方法
     * @author Yin Guiqing
     * @date 2019年6月7日 下午3:23:21
     * @param args 
     * @return void
     * @throws
     */
    public static void main(String[] args) {
        
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        int nums[] = {5, 3, 6, 8, 4, 2};
        for (int i : nums) {
            bst.add(i);
        }
        bst.preOrder();
        System.out.println();
        
        bst.preOrderNR();
        System.out.println();
        
//        bst.inOrder();
//        System.out.println();
//        
//        bst.postOrder();
//        System.out.println();
    }
}
