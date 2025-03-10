package Family_Tree;

public class FamilyTree {

    public static void run(){
        //generation 0
        Person person1 = new Person("Bobbie", "Mexico");

        //generation 1
        person1.addChild(new Person("Susan", "Canada"));
        person1.addChild(new Person("Jill", "Canada"));
        person1.addChild(new Person("Bobette", "Czechia"));

        //generation 2
        person1.children.get(0).addChild(new Person("Zain", "Czechia"));
        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));

        person1.children.get(1).addChild(new Person("Luke", "Canada"));
        person1.children.get(1).addChild(new Person("Rachel", "UK"));


        //generation 3
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

        person1.children.get(1).children.get(1).addChild(new Person("Arthur", "USA"));
        person1.children.get(1).children.get(1).addChild(new Person("Martin", "France"));

        //generation 4
        person1.children.get(1).children.get(1).children.get(1).addChild(new Person("Max","Germany"));

    }//run

    public static void printFamily(Person ptemp){
        System.out.println();


    }

    public static int countFamily(Person pTemp){
        int num = 0;
        return num;
    }


}
