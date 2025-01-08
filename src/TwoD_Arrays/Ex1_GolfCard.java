package TwoD_Arrays;

public class Ex1_GolfCard {

    public static void run(){
        String[] names = {"Bob", "Serena", "Gill", "Steve"};
        int[][] scorecard = new int[4][18];
        System.out.println(scorecard.length);
        scorecard[0][0] = 4;
        scorecard[1][0] = 3;
        scorecard[2][0] = 5;
        scorecard[3][0] = 4;

        scorecard[0][1] = 7;
        scorecard[1][1] = 6;
        scorecard[2][1] = 9;
        scorecard[3][1] = 3;

        scorecard[0][2] = 4;
        scorecard[1][2] = 6;
        scorecard[2][2] = 9;
        scorecard[3][2] = 4;

        System.out.println("Name          Scores");

        for(int row = 0; row < scorecard.length; row++){
            int sumP = 0;


            for(int col = 0; col < scorecard[row].length; col++){
                System.out.print(scorecard[row][col] + "  ");
                sumP += scorecard[row][col];
            }
            System.out.print(names[row]+"  ");
            System.out.print(sumP+"  ");
            System.out.println();
        }

        for(int row = 0; row<18; row++){

            int avgH = 0;
            for (int col = 0; col < 4; col++) {
                avgH += scorecard[row][col];
            }
            System.out.print(avgH+"  ");
        }



    }

}
