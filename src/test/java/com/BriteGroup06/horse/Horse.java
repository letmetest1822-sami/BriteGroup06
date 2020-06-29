package com.BriteGroup06.horse;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Horse {
    public static String identifyMyself() {
        return "I am a horse.";

    }

     public static void main(String[] args) {
         System.out.println(args[1]);
     }
}
 interface Flyer {
    static public String identifyMyself() {
        return "I am able to fly.";
    }
}
 interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
 class Pegasus extends Horse{
    public static void main(String... args) {
        Horse.identifyMyself();
        String[] aaaa= {"aa","bb"};
        Horse.main(aaaa);


    //
       // new Pegasus().nonStaticMethod();
    }
    public void nonStaticMethod(){
        System.out.println("nonstatic imp = " + identifyMyself());
    }
     public static void a(){

         List<String> l = new ArrayList<>();
         l.add("a");
         l.add("b");
         Object[] s = l.toArray();
         System.out.println("s[1].toString() = " + s[1].toString());



     }
}