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

        printFamily(person1);
        System.out.println();
        countFamily(person1);




    }//run

    public static void printFamily(Person temp){
        System.out.print(temp.getName() +" has children: ");
        for (int i = 0; i < temp.getChildren().size(); i++) {
            System.out.print(temp.getChildren().get(i).getName() + ", ");
        }
        for (int i = 0; i < temp.getChildren().size(); i++) {
            System.out.println();
            System.out.print(temp.children.get(i).getName() + " has children: ");
            for (int j = 0; j < temp.children.get(i).children.size(); j++) {
                System.out.print(temp.getChildren().get(i).children.get(j).getName() + ", ");
            }
        }
        for (int i = 0; i < temp.getChildren().size(); i++) {
            for (int j = 0; j < temp.children.get(i).children.size(); j++) {
                System.out.println();
                System.out.print(temp.getChildren().get(i).children.get(j).getName() + " has children: ");
                for (int k = 0; k < temp.children.get(i).children.get(j).children.size(); k++) {
                    System.out.print(temp.children.get(i).children.get(j).children.get(k).getName() + ", ");
                }
            }
        }
        for (int i = 0; i < temp.getChildren().size(); i++) {
            for (int j = 0; j < temp.children.get(i).children.size(); j++) {
                for (int k = 0; k < temp.children.get(i).children.get(j).children.size(); k++) {
                    System.out.println();
                    System.out.print(temp.getChildren().get(i).children.get(j).children.get(k).getName() + " has children: ");
                    for (int l = 0; l < temp.children.get(i).children.get(j).children.get(k).children.size(); l++) {
                        System.out.print(temp.children.get(i).children.get(j).children.get(k).children.get(l).getName() + ", ");
                    }
                }
            }
        }

    }

    public static int countFamily(Person pTemp){
        int num = 0;

        return num;
    }


}
