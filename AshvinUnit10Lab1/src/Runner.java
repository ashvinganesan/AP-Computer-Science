/*
Ashvin Ganesan
APCS Unit 10 Lab 1
Monday March 2nd 2020
 */
public class Runner {
//    public static void main(String[] args) {
//        RecursionDemo demo = new RecursionDemo();
////        System.out.println(demo.fib2(45));
////        System.out.println(demo.fib(45));
////        U10L1 demo1 = new U10L1();
////        System.out.println(demo1.luckySevens(327747077));
//        AtCounter demo2 = new AtCounter(10);
//        demo2.print();
//        System.out.println(demo2.recursion(0, 0));
//    }
//}
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
        FamilyTree demo = new FamilyTree();
        demo.levelorder(myFamily);
        System.out.println("");
        System.out.println(demo.countMembers(myFamily));
        System.out.println(demo.countMembers(gen1b));
        System.out.println(demo.countGenerations(myFamily));
        System.out.println(demo.countGenerations(gen1b));
        System.out.println(demo.countGenerations(gen1a));
        System.out.println("");
        System.out.println(demo.countGenerationFromRoot(myFamily, gen1a));
        System.out.println("");
        System.out.println("");
        demo.print(myFamily);


    }
    
}
