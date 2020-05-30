package pl.wozniak.michal.java.maven.maps.zadanie4;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private String lastName;
    private String maiLanguage;
  private final int   HOW_MANY_MARKS =5;
    private List <Integer> list = new ArrayList<>();



    public Student(String name, String lastName, String maiLanguage) {
        this.name = name;
        this.lastName = lastName;
        this.maiLanguage = maiLanguage;
    }


    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMaiLanguage() {
        return maiLanguage;
    }

    public void setMaiLanguage(String maiLanguage) {
        this.maiLanguage = maiLanguage;
    }
    private double markSum(List<Integer> grades){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        return sum;
    }
    public double calculateAverage(List<Integer> grades){
        double suma = markSum(grades);
        double average = suma / grades.size();
        return average;
    }
    public void getMarks(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < HOW_MANY_MARKS; i++) {
            System.out.println("Podaj ocenę numer " + (i +1));
            int ocena = scanner.nextInt();
            if(ocena<0 || ocena>6){
                throw new IndexOutOfBoundsException("Nie można dodadć takiej oceny");
            }

          list.add(ocena);

        }
        System.out.println("Przypisywanie ocen zakończyło się");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", maiLanguage='" + maiLanguage + '\'' +
                "Oceny za semestr" + list +  " " +
                '}';
    }
}
