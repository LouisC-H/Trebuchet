import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        for (int i = 0; i < lineOfText.length(); i++) {
            char c = lineOfText.charAt(i);
            if (isDigit(c)) {
                digitList.add(String.valueOf(c));
            } else if (c == 'o') {
                digitList = oDigitTest(lineOfText, i, digitList);
            } else if (c == 't') {
                digitList = tDigitTest(lineOfText, i, digitList);
            } else if (c == 'f') {
                digitList = fDigitTest(lineOfText, i, digitList);
            } else if (c == 's') {
                digitList = sDigitTest(lineOfText, i, digitList);
            } else if (c == 'e') {
                digitList = eDigitTest(lineOfText, i, digitList);
            } else if (c == 'n') {
                digitList = nDigitTest(lineOfText, i, digitList);
            }
        }
        System.out.println(digitList);
        return Integer.parseInt(digitList.get(0)+digitList.get(digitList.size()-1));
    }

    public static ArrayList<String> oDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+2) {
            if (lineOfText.charAt(i+1) == 'n') {
                if (lineOfText.charAt(i+2) == 'e') {
                    digitList.add("1");
                }
            }
        }
        return digitList;
    }

    public static ArrayList<String> tDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+2) {
            if (lineOfText.charAt(i + 1) == 'w') {
                if (lineOfText.charAt(i + 2) == 'o') {
                    digitList.add("2");
                }
            } else if (lineOfText.charAt(i + 1) == 'h' && lineOfText.length() >= i+4) {
                if (lineOfText.charAt(i + 2) == 'r') {
                    if (lineOfText.charAt(i + 3) == 'e') {
                        if (lineOfText.charAt(i + 4) == 'e') {
                            digitList.add("3");
                        }
                    }
                }
            }
        }
        return digitList;
    }

    public static ArrayList<String> fDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+3) {
            if (lineOfText.charAt(i + 1) == 'o') {
                if (lineOfText.charAt(i + 2) == 'u') {
                    if (lineOfText.charAt(i + 3) == 'r') {
                        digitList.add("4");
                    }
                }
            } else if (lineOfText.charAt(i + 1) == 'i') {
                if (lineOfText.charAt(i + 2) == 'v') {
                    if (lineOfText.charAt(i + 3) == 'e') {
                        digitList.add("5");
                    }
                }
            }
        }
        return digitList;
    }

    public static ArrayList<String> sDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+2) {
            if (lineOfText.charAt(i + 1) == 'i') {
                if (lineOfText.charAt(i + 2) == 'x') {
                    digitList.add("6");
                }
            } else if (lineOfText.charAt(i + 1) == 'e' && lineOfText.length() >= i+4) {
                if (lineOfText.charAt(i + 2) == 'v') {
                    if (lineOfText.charAt(i + 3) == 'e') {
                        if (lineOfText.charAt(i + 4) == 'n') {
                            digitList.add("7");
                        }
                    }
                }
            }
        }
        return digitList;
    }

    public static ArrayList<String> eDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+2) {
            if (lineOfText.charAt(i + 1) == 'i') {
                if (lineOfText.charAt(i + 2) == 'g') {
                    if (lineOfText.charAt(i + 3) == 'h') {
                        if (lineOfText.charAt(i + 4) == 't') {
                            digitList.add("8");
                        }
                    }
                }
            }
        }
        return digitList;
    }

    public static ArrayList<String> nDigitTest(String lineOfText, Integer i, ArrayList<String> digitList){
        if (lineOfText.length() >= i+3) {
            if (lineOfText.charAt(i + 1) == 'i') {
                if (lineOfText.charAt(i + 2) == 'n') {
                    if (lineOfText.charAt(i + 3) == 'e') {
                        digitList.add("9");
                    }
                }
            }
        }
        return digitList;
    }
}
