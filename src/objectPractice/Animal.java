package objectPractice;

public class Animal {

    // instance variables, they belong to object
    // (Object variables)
    String name;
    String color = "Orange";
    int age;

    double calories;

    public void sleep(){

        System.out.println(name +  " is sleeping");
    }

    public void eat(){
        calories = 500;
        System.out.println( color +" "+ name + " is eating. " +
                "His/her calories getting to "+calories);


    }





}
