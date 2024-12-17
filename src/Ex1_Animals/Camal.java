package Ex1_Animals;

public class Camal extends Animal   {

    int numHumps;

    public Camal( String name, int h ){
        super(name);
        numHumps = h;


    }

    public void talk() {
        System.out.println(name + " is an Camal that says neoooaahy");
    }

}
