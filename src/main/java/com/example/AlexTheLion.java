package com.example;

import java.util.ArrayList;
import java.util.List;

public class AlexTheLion extends Lion {

    public AlexTheLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

/*    public static void main(String[] args) throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion(new Feline());
        System.out.println(alexTheLion.getFood());
        //System.out.println(alexTheLion.getPlaceOfLiving());
        System.out.println(alexTheLion.doesHaveMane());
        //System.out.println(alexTheLion.getKittens());
        //System.out.println(alexTheLion.getFriends());
        System.out.println(alexTheLion.feline.eatMeat());
        System.out.println(alexTheLion.feline.getFamily());
        System.out.println(alexTheLion.feline.getKittens());
        System.out.println(alexTheLion.feline.getFood("Хищник"));
        //System.out.println(alexTheLion.isHasMane());
    }*/
}
