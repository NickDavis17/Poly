package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Language lang1 = new Java();

        Java language1 = ((Java)lang1);
        language1.writeCode();

        /*ArrayList<Language> listOfLang = new ArrayList<>();
        Collections.addAll(listOfLang, lang0, lang1, lang2, lang3);
        for (Language a : listOfLang) {
            a.displayInfo();
        }*/
    }
}

class Language{
    public void displayInfo(){
        System.out.println("This is common English");

    }

}

class Java extends Language {
    public void displayInfo(){
        System.out.println("This is Java Programming!");
    }

    public void writeCode(){
        System.out.println("Wow!");
    }
}

class Spanish extends Language{
    public void displayInfo(){
        System.out.println("Hola, soy Espanol");
    }
}

class German extends Language{
    public void displayInfo(){
        System.out.println("Guten Tag, Ich bin ein Deutschlander!");
    }
}

