import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Day1 {
    public static void main(String []args){
        ArrayList<String> lines= new ArrayList<String>();
        lines.add("1abc2");
        lines.add("pqr3stu8vwx");
        lines.add("a1b2c3d4e59");
        lines.add("treb7uchet");

        ArrayList<Integer> calValList= new ArrayList<Integer>();

        for(String line: lines) {
            calValList.add(getCalibrationValue(line));
        }

        int sum = sumOfCalibrationValues(calValList);
        System.out.println("Sum of calibration values: " + sum);
    }

    public static int getCalibrationValue(String line){
        int firstDigit = 0, lastDigit = 0;
        for (char c : line.toCharArray()) {
            if (Character.isDigit(c) && firstDigit == 0) {
                firstDigit = Integer.parseInt(String.valueOf(c));
                lastDigit = Integer.parseInt(String.valueOf(c));
            } else if (Character.isDigit(c)) {
                lastDigit = Integer.parseInt(String.valueOf(c));
            }
        }
        return (firstDigit * 10) + lastDigit;
    }

    public static int sumOfCalibrationValues(List<Integer> calValList) {
        int sum = 0;
        for(int calVal: calValList){
            sum = sum + calVal;
        }
        return sum;
    }
}