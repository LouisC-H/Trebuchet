import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Main {

    public static void main(String[] args)
    {
        Integer rollingSum = 0;
        try {
            File myObj = new File("src/resources/TrebuchetInput.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                rollingSum += extractDigits(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.print(rollingSum);
    }

    public static int extractDigits(String lineOfText){
        ArrayList<String> digitList = new ArrayList<>();
        lineOfText.chars().forEachOrdered(c -> {
            if (isDigit(c)) {
                digitList.add(String.valueOf((char)c));
            }
        });
        return Integer.parseInt(digitList.get(0)+digitList.get(digitList.size()-1));
    }
}
