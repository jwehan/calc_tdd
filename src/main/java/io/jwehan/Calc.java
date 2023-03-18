package io.jwehan;

public class Calc {
    public static int run(String exp){

        exp = exp.replaceAll(" - ", "+ -");

        String[] ttd = exp.split("\\+");

        int sum = 0;

        for (String s : ttd) {
            sum += Integer.parseInt(s.trim());
        }
        return sum;
    }
}