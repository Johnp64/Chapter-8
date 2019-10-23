package GameZone;

import java.util.Random;

public class FiveDice {

    public static void main(String[] args){

        Random rand = new Random();
        int total = 0;
        int[] dieRolls = new int[5];



        for(int i = 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            dieRolls[i] = die;
            System.out.println(die);
        }
        for (int j = 0; j < dieRolls.length; ++j){
            total = total + dieRolls[j];
        }
        System.out.println("Total = " + total);
    }
}
