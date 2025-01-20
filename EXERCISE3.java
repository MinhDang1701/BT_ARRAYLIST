/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ThinkPad
 */
public class EXERCISE3 {

    public static void main(String[] args) {
        ArrayList<Double> names = new ArrayList<>();
        names.add(17.5);
        names.add(19.2);
        names.add(20.1);
        names.add(8.8);
        names.add(9.0);

        System.out.print("GIA : ");
        for (double name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}

