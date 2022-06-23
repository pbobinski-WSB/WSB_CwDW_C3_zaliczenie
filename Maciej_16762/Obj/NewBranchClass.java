package Obj;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Random;

import static java.lang.Math.random;

public class NewBranchClass {

    //zachowane do poprawienia i mozliwego wykorzystania
    //nie implementowane

    public void los() {
        Random random = new Random();
        for (int i=0; i<5; i++) {
            System.out.println(random.nextInt());
        }

    }

    Date data = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("HH 'o''clock' , zzzz");
    //System.out.println(sdf.format(data));


}
