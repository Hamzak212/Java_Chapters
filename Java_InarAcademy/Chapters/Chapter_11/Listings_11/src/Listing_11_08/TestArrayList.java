package Listing_11_08;
import Listing_11_02.CircleFromSimpleGeometricObject;

import java.util.*;
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Tokyo");

        display(cityList);
        System.out.println("List size: " + cityList.size());
        System.out.println("Is Miami on the list: " + cityList.contains("Miami"));
        System.out.println("The location of Denver on the list: " + cityList.indexOf("Denver"));
        System.out.println("Is the List empty: " + cityList.isEmpty());

        cityList.add(2,"Xian");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList.toString());
        System.out.println(cityList.size());
        display(cityList);

        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        System.out.println("Area of the circle: " + list.get(0).getArea());
    }
    public static void display(ArrayList<String> C){
        for(int i = 0; i < C.size(); i++){
            System.out.print(C.get(i) + " ");
        }
        System.out.println();
    }

}
