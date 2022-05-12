package coding.challenge;

public class Main {
    public static void main(String[] args) {
        /* 루트에서 균형이 맞지 않음
                  40
                /    \
               30     49
              /  \   /  \
             20  35 45   52
                /  \
               34  37
                  /
                 36
        */
        BinaryTree<Integer> bt = new BinaryTree<>();

        bt.insert(40);
        bt.insert(30);
        bt.insert(49);
        bt.insert(20);
        bt.insert(35);
        bt.insert(45);
        bt.insert(52);
        bt.insert(34);
        bt.insert(37);
        bt.insert(36); // 이 줄을 주석 처리하면 트리가 균형을 이룹니다.

        System.out.println("Balanced (approach 1)? " + bt.isBalanced1());
        System.out.println("Balanced (approach 2)? " + bt.isBalanced2());
    }
}