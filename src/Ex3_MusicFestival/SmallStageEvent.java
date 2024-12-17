package Ex3_MusicFestival;

class SmallStageEvent extends Event{
    public int NumPeople;

    public SmallStageEvent(String name, String type) {
        super(name, type);
        super.setLocation("Small Stage");
    }

    public void genre(int g){
        String gnr = "";
        if(g == 1){
            gnr = "Traditional Classical";
        }else if(g == 2){
            gnr = "Minimalism";
        }else if(g == 3){
            gnr = "Romanticism";
        }
        System.out.println(gnr);
    }

}
