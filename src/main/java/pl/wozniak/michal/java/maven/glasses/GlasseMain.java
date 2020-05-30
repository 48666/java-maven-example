package pl.wozniak.michal.java.maven.glasses;

import java.util.HashSet;
import java.util.Set;

public class GlasseMain {
    public static void main(String[] args) {


        Glasses glasses = new Glasses("Rayban", "ranban1", 45);
        Glasses glasses2 = new Glasses("Rayban", "ranban1", 45);
        Glasses glasses3 = new Glasses("Rayban", "ranban1", 45);
        Glasses glasses4 = new Glasses("Rayban1", "ranban12", 46565);
        Glasses glasses5 = new Glasses("Rayban", "ranban1", 45);
        Glasses glasses6 = new Glasses("Rayban1", "ranban1", 45);
        Glasses glasses7 = new Glasses("Rayban", "ranban12", 57);
        Set <Glasses> setOfGlasses = new HashSet<>();
        setOfGlasses.add(glasses);
        setOfGlasses.add(glasses2);
        setOfGlasses.add(glasses3);
        setOfGlasses.add(glasses4);
        setOfGlasses.add(glasses5);
        setOfGlasses.add(glasses6);
        setOfGlasses.add(glasses7);

        System.out.println(setOfGlasses);

    }
}