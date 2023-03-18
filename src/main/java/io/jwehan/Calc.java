package io.jwehan;

public class Calc {
    public static int run(String exp){

        exp = exp.replaceAll(" - ", "+ -");

        String[] ttd = exp.split("\\+");

        int a = Integer.parseInt(ttd[0].trim());
        int b = Integer.parseInt(ttd[1].trim());
        int c = 0;

        if ( ttd.length > 2){
            c = Integer.parseInt(ttd[2]);
        }
        return a+ b+ c;
    }
}