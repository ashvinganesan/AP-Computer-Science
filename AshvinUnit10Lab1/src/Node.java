/**
 *
 * @author chemiup
 */
public class Node {
        public Node left;
        public Node right;
        public String name;

        public Node(String name) {
            this.name = name;
        }

        public Node getLeft() {
            return this.left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return this.right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
}
