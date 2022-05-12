package coding.challenge;

public class Main {
    public static void main(String[] args) {
        /*  최대 경로의 합계는 30입니다.
                    -4
                /       \
               7         2
              / \       / \
             1   -2    4   5
            / \    \       /
           6   5   10    12
        */
        BinaryTree bt = new BinaryTree();

        bt.insert(-4);
        bt.insert(7);
        bt.insert(2);
        bt.insert(1);
        bt.insert(-2);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.insert(5);
        bt.insert(0);
        bt.insert(10);
        bt.insert(0);
        bt.insert(0);
        bt.insert(12);

        int max = bt.maxPathSum();

        System.out.println("Max: " + max);
    }
}