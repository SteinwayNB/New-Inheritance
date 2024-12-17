package Ex3_MusicFestival;

import java.util.ArrayList;

class Others extends NonMusicEvent{

    ArrayList<String> Sells = new ArrayList<>();

    public Others(String name, String type, String loc) {
        super(name, type, loc);
    }

    public void addItemToSell(String item) {
        Sells.add(item);
    }

}
