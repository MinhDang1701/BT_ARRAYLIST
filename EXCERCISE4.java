/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import java.util.ArrayList;
/**
 *
 * @author ThinkPad
 */
public class EXCERCISE4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("HCM");
        cities.add("LONDON");
        cities.add("HA NOI");
        cities.add("HAIPHONG");

      
        boolean ktralondon = false;
        for (String city : cities) {
            if (city.equals("LONDON")) {
                ktralondon = true;
                break;
            }
        }

        System.out.println("ktra xuat hien tp LONDON KHONG " + (ktralondon? " yes" : "no"));
    }
}

