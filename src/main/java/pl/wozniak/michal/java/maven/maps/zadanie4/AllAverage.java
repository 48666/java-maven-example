package pl.wozniak.michal.java.maven.maps.zadanie4;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class AllAverage {
    public static double bigAverage( double...average ){
        int suma = 0;
        for (int i = 0; i < average.length; i++) {
          suma+=average[i];
        }

        return suma/average.length;
    }
}
