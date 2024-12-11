package Ex1_Animals;

public class Camel extends Animal{

    int numberHumps;
    public Camel(String name, int h){
        super(name);
        numberHumps = h;

    }
    public void talk() {
        System.out.println(name + " is a Camel that says \"neoooahy\"");
    }

}
