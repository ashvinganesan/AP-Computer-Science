/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
public class Runner {
    public static void main(String[] args) {
//        Mail demo = new FlatRateBox();
//        Mail demo1 = new FlatRateEnv();
//        Mail demo2 = new PriorityMail(10.9,7);
//        Mail demo3 = new InsuredMail(demo, 100.0);
//        System.out.println("FlatRBox is " + demo.calculatePostage());
//        System.out.println("FlatREnvelope is " + demo1.calculatePostage());
//        System.out.println("Priority mail is " + demo2.calculatePostage());
//        System.out.println("Insured mail" + demo3.calculatePostage());
          Kennel demo4 = new Kennel();
          Pet cooper = new Dog("Cooper");
          Pet cat = new Cat("Kitty");
          Pet loudyPants = new LoudDog("LoudDog");
          demo4.addPet(cooper);
          demo4.addPet(cat);
          System.out.println(cat.speak());
          System.out.println(cooper.speak());
          System.out.println(loudyPants.speak());
          demo4.addPet(loudyPants);
          demo4.allSpeak();

    }
}
