package io.jwehan;

public class Calc {
    public static int run(String exp){

        exp = exp.replaceAll("-", "+ -");

        String[] split = exp.split("\\+");

        int a = Integer.parseInt(split[0].trim());
        int b = Integer.parseInt(split[1].trim());
        int c = 0;

        if ( split.length > 2){
            c = Integer.parseInt(split[2]);
        }
        return a+ b+ c;
    }
}