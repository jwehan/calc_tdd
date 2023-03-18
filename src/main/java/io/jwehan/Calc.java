package io.jwehan;

public class Calc {
    public static int run(String exp){
        boolean getSum = exp.contains("+");
        boolean getMin = exp.contains("-");

        String[] bits = null;

        if(getSum){
            bits = exp.split("\\+");
        } else if (getMin) {
            bits = exp.split("\\-");
        }

        int a = Integer.parseInt(bits[0].trim());
        int b = Integer.parseInt(bits[1].trim());
        int c = 0;

        if (bits.length > 2){
            c = Integer.parseInt(bits[3].trim());
        }
        if ( getSum){
            return a + b;
        } else if ( getMin){
            return a - b;
        }

        throw new RuntimeException("오 류 오 류 ");
    }
}