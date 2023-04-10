package AOC2022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayTwo {
    public static int scoreGame(List<String> rounds){
        int score = 0;
        for (String round : rounds) {
            String[] roundsArray = round.split(" ");

            if (roundsArray[1].equals("X")){
                score += 1;
            } else if(roundsArray[1].equals("Y")){
                score += 2;
            } else if(roundsArray[1].equals("Z")){
                score += 3;
            }

            if (roundsArray[0].equals("A") && roundsArray[1].equals("Y")){
                score += 6;
            } else if (roundsArray[0].equals("B") && roundsArray[1].equals("Z")){
                score += 6;
            } else if (roundsArray[0].equals("C") && roundsArray[1].equals("X")){
                score += 6;
            } else if((roundsArray[0].equals("A") && roundsArray[1].equals("X")) 
            || (roundsArray[0].equals("B") && roundsArray[1].equals("Y")) 
            || (roundsArray[0].equals("C") && roundsArray[1].equals("Z"))){
                score += 3;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        List<String> rounds = new ArrayList<>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("dayTwo.txt"));
            String input = fileReader.readLine();
            while(input != null){
                rounds.add(input);
                input = fileReader.readLine();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(scoreGame(rounds));
    }
}
