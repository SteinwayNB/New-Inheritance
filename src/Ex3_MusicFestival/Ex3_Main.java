package Ex3_MusicFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_Main {

    public static void run(){

        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "music"));
        allEvents.add(new MainStageEvent("Hemple Temple", "music"));
        allEvents.add(new MainStageEvent("Sleep", "experimental"));
        allEvents.add(new MainStageEvent("John Cage", "pioneer"));
        allEvents.add(new MainStageEvent("WWDC", "announcement"));

        allEvents.add(new NonMusicEvent("Face Painting Booth", "kids activity", "Tent 4"));
        allEvents.add(new NonMusicEvent("Car Show", "Company ads", "Tent 5"));
        allEvents.add(new NonMusicEvent("Robot Contest", "Sport", "Tent 6"));
        allEvents.add(new NonMusicEvent("Movie watching", "movie", "Tent 7"));
        allEvents.add(new NonMusicEvent("Racing simulator", "games", "Tent 8"));

        allEvents.add(new SmallStageEvent("Works of Liszt", "Piano solo"));
        allEvents.add(new SmallStageEvent("4 Chopin Ballades", "Piano solo"));
        allEvents.add(new SmallStageEvent("Paganini's masterpieces", "Violin solo"));
        allEvents.add(new SmallStageEvent("The Piano Man", "Comedy"));
        allEvents.add(new SmallStageEvent("Othello", "Opera"));


        ((MainStageEvent)allEvents.get(1)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");
        ((MainStageEvent)allEvents.get(0)).addTech("Earth Model");
        ((MainStageEvent)allEvents.get(2)).addTech("Symphony Orchestra");
        ((MainStageEvent)allEvents.get(2)).addTech("Beds");
        ((MainStageEvent)allEvents.get(3)).addTech("Piano");
        ((MainStageEvent)allEvents.get(4)).addTech("Screen");

        for (int i = 0; i < allEvents.size(); i++) {

            System.out.println(allEvents.get(i).getEventName()     );

          if( allEvents.get(i) instanceof  MainStageEvent    ){
              ((MainStageEvent)allEvents.get(i)).printTech();
          }



        }
        System.out.println();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose from the following options.");

            System.out.println("1. Add New Event");
            System.out.println("2. Search for event");
            System.out.println("3. Filter by Type");
            System.out.println("4. Exit");
            System.out.println("5. Group by Type");
            System.out.println("6. Search for Main Stage Events");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Where would you like to set the event in? ");
                String inPlace = input.nextLine();
                System.out.println("What is the name of this event?");
                String inName = input.nextLine();
                System.out.println("What is the type of this event?");
                String inType = input.nextLine();

                if(inPlace.equalsIgnoreCase("Non Music Event")){
                    System.out.println("Where is the exact location of this event?");
                    String inLoc = input.nextLine();
                    allEvents.add(new NonMusicEvent(inName, inType, inLoc));
                }else if (inPlace.equalsIgnoreCase("Small Stage Events")){
                    allEvents.add(new SmallStageEvent(inName,inType));
                }else if (inPlace.equalsIgnoreCase("Main Stage")){
                    allEvents.add(new MainStageEvent(inName,inType));
                }

            } else if (choice == 2) {
                System.out.println("What is the name of the event?");
                String inEvent = input.nextLine();
                for (int i = 0; i < allEvents.size(); i++) {
                    if(inEvent.equalsIgnoreCase(((allEvents.get(i).getEventName())))){
                        System.out.println(allEvents.get(i).getEventName()+", Location: "+allEvents.get(i).getLocation()+", Type: "+allEvents.get(i).getEventType());
//                        ((MainStageEvent)allEvents.get(i)).printTech();
                        if( allEvents.get(i) instanceof  MainStageEvent    ){
                            ((MainStageEvent)allEvents.get(i)).printTech();
                        }

                    }
                }


            } else if (choice == 3) {
                System.out.println("Type in the event type");
                String inType = input.nextLine();
                for (int i = 0; i < allEvents.size(); i++) {
                    if(inType.equalsIgnoreCase(allEvents.get(i).getEventType())){
                        System.out.println(allEvents.get(i).getEventName()+", Location: "+allEvents.get(i).getLocation());
                        if( allEvents.get(i) instanceof  MainStageEvent    ){
                            ((MainStageEvent)allEvents.get(i)).printTech();
                        }
                    }
                }

            } else if (choice == 4) {
                break;
            } else if(choice == 5){
                System.out.println("Non-music: ");
                for (int i = 0; i < allEvents.size(); i++) {
                    if(!allEvents.get(i).getEventType().equalsIgnoreCase("music")){
                        System.out.println(allEvents.get(i).getEventName()+", Location: "+allEvents.get(i).getLocation()+", Type: "+allEvents.get(i).getEventType());
                    }
                }
                System.out.println();
                System.out.println("Main-stage: ");
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i).getLocation().equalsIgnoreCase("main stage")){
                        System.out.println(allEvents.get(i).getEventName()+", Location: "+allEvents.get(i).getLocation()+", Type: "+allEvents.get(i).getEventType());
                    }
                }
                System.out.println();
                System.out.println("Small-stage: ");
                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i).getLocation().equalsIgnoreCase("small stage") ){
                        System.out.println(allEvents.get(i).getEventName()+", Location: "+allEvents.get(i).getLocation()+", Type: "+allEvents.get(i).getEventType());
                    }
                }
                System.out.println();

            } else if (choice == 6) {
                System.out.println("What Main Stage Event are you looking for?");
                String inmainevent = input.nextLine();
                boolean isfound = false;
                for (int i = 0; i < allEvents.size(); i++) {
                    if (inmainevent.equalsIgnoreCase(allEvents.get(i).getEventName())) {
                        System.out.println("What tech requirement would you like to add");
                        String tempTec = input.nextLine();
                        ((MainStageEvent) allEvents.get(i)).addTech(tempTec);
                        isfound = true;
                    }
                }
                if (isfound == false){
                    System.out.println("Event not found, please add event first");
                }
            }


        } // while loop




    }//run

}//Ex3_Main
