
import java.util.LinkedList;
import java.util.Queue;

/*
Ashvin Ganesan
APCS Unit 10 Lab 1
Monday March 2nd 2020
 */
//This class uses linked lists to generate and manipulate a family tree.
//it can print the whole tree in 2 different ways using levelorder and pring
public class FamilyTree {

    //display members of a sub-family starting from Node n
    public void levelorder(Node n) {
        Queue<Node> nodequeue = new LinkedList<Node>();
        if (n != null) {
            nodequeue.add(n);
        }
        while (!nodequeue.isEmpty()) {
            Node next = nodequeue.remove();
            System.out.print(next.name + " ");
            if (next.getLeft() != null) {
                nodequeue.add(next.getLeft());
            }
            if (next.getRight() != null) {
                nodequeue.add(next.getRight());
            }
        }
    }
    //prints in a this person has blank children: x and y. format
    //prints everyone starting from a specific node(generally the oldest person)
    public void print(Node n) {
        //System.out.print(n.name + " ");
        boolean hasLeft = false;
        boolean hasRight = false;
        if(n.getLeft() != null) {
            hasLeft = true;

        }
        if(n.getRight() != null) {
            hasRight = true;
        }
        if(hasLeft == false && hasRight == false) {
            System.out.println(n.name +" has no children. ");
        }
        else if(hasRight == true && hasLeft == true){
            System.out.println(n.name + " has 2 children: "+ n.getLeft().name + " and " + n.getRight().name + ". ");
            print(n.getLeft());
            print(n.getRight());
        }
        else if(hasRight == true) {
            System.out.println(n.name + " has 1 child: " + n.getRight().name + ". ");
            print(n.getRight());

        }
        else {
            System.out.println(n.name + " has 1 child: " + n.getLeft().name + ". ");
            print(n.getLeft());

        }
    }

    // Complete this method 
    // Count number of members of a sub-family starting from a specific head of household, i.e. Node n
    //uses recursion to count the members in the family
    public int countMembers(Node n) {
        int total = 1;
        if (n.getLeft() != null) {
            total += countMembers(n.getLeft());
        }
        if (n.getRight() != null) {
            total += countMembers(n.getRight());
        }

        return total;//basecase if the node is empty it returns 0;
    }

    // Complete this method 
    // Count number of generations of a sub-family starting from a specific head of household, i.e. Node n
    //Counts the number of generations in the family. 
    public int countGenerations(Node n) {

        int leftTotal = 0;
        int rightTotal = 0;
        if (n.getLeft() != null) {
            leftTotal = countGenerations(n.getLeft());
        }
        if (n.getRight() != null) {
            rightTotal = countGenerations(n.getRight());
        }

        if (leftTotal > rightTotal) {
            return leftTotal + 1;
        }
        return rightTotal + 1;

    }

    // Complete this method 
    // Count number of generations between the oldest person and a specific generation, i.e. otherGen
    // I did total distance so if it was like a parent and their kid it would return 1
    public int countGenerationFromRoot(Node root, Node otherGen) {
        int rightTotal = 0;
        int leftTotal = 0;
        if(root == otherGen) {
            return 0;
        }
        if(root.getLeft() != null) {
            leftTotal = countGenerationFromRoot(root.getLeft(), otherGen);
        } else {
            leftTotal = Integer.MIN_VALUE;
        } 
        if(root.getRight() != null) {
            rightTotal = countGenerationFromRoot(root.getRight(), otherGen);
        } else {
            rightTotal = Integer.MIN_VALUE;
        }
        return 1 + Math.max(rightTotal, leftTotal);
    }

}

/*Suggested test data
 public static void main(String[] args) {
            Node myFamily = new Node("James");
            //1st gen
            Node gen1a = new Node("John P");
            Node gen1b = new Node("William J");
            myFamily.setLeft(gen1a);
            myFamily.setRight(gen1b);

            //2nd gen
            Node gen2a = new Node("John C");
            Node gen2b = new Node("Donna");
            Node gen2c = new Node("Tom");
            gen1a.setLeft(gen2a);
            gen1b.setLeft(gen2b);
            gen1b.setRight(gen2c);

            //3rd gen
            Node gen3a = new Node("Jack");
            Node gen3b = new Node("William P");
            Node gen3c = new Node("Jeremy");
            Node gen3d = new Node("Jennifer");
            gen2a.setLeft(gen3a);
            gen2b.setRight(gen3b);
            gen2c.setLeft(gen3c);
            gen2c.setRight(gen3d);

            //4th gen
            Node gen4a = new Node("Grant");
            gen3c.setLeft(gen4a);
            
            levelorder(myFamily);

}
 */
