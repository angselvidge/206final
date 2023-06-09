/*
 File: Mountain.java
 Description: Write a program that will include the following:
A class that will store mountain details which will included the following:

Member for the name, (make it private for java or c++)
Member for the country, (make it private for java or c++)
Member for the elevation, (make it private for java or c++)
Setters and getters for all the data members. (Make them public for java or c++)

A member function call toMeters that will take the elevation and convert the value from feet to meters and return the converted value.  The relationship for feet to meters is 1 meter per 3.2808 feet

In the main function of the Main class(for java, main function for c++ and  a main function for python with the __name__=="__main__" structure) , create 7 instances of Mountain objects and put the mountain data from the table above.
Put the mountain objects in an appropriate data structure for the language that you are writing this for.
Write a method called minElevation in the (Main class for java, main module for python, or the file that has main for c++) that will return the minimum elevation.
Iterate over the data structure that contains the Mountain objects and print out the Mountain details similar to the table above, with the addition of the elevation in feet and in meters.
Programmatically print out the elevation and name of the shortest mountain (do not hard code this)

 Created: Sunday, June 4th 2023 @ 11:43pm
 Author: Angela Selvidge 
 email: angelag8562@student.vvc.edu
 

 */

public class Mountain {
// class for required memebers 
    private String name;
    private String country;
    private int elevation;
    
    public Mountain(String name, String country, int elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }
    public void setName(String name) {
        this.name = name;
    }
     public void setCountry(String country) {
        this.country = country;
    }
    public void setElevation(int elevation) {
        this.elevation = elevation;
    }
    public String getName() {
        return name;
    }
    public String getCountry() { // getcountry
        return country;
    }
    public int getElevation() {
        return elevation;
    }
    public static double toMeters(double elevationInFeets) {
        final double FEET_TO_METER = 1 / 3.2808; // create the converted value 
        return elevationInFeets * FEET_TO_METER;
    }
    public static Mountain minElevation(Mountain mountains[]) {
        int minIndex = 0;
        for (int i = 0; i < mountains.length; i++) { 
            if (mountains[i].getElevation() < mountains[minIndex].getElevation()) {
                minIndex = i; // use chapter 10 as input for elevation index
            }
        }
        return mountains[minIndex];
    } 
    public static void main(String[] args) { // print out table functions #6
        Mountain mountains[] = new Mountain[7];
        mountains[0] = new Mountain("Chimborazo","Ecudador", 20549);
        mountains[1] = new Mountain("Matterhorn", "Switzeland", 14692);
        mountains[2] = new Mountain("Olympus", "Geece(Macedonia)", 9573);
        mountains[3] = new Mountain("Everest", "Nepal", 290929);
        mountains[4] = new Mountain("Mount Marcy-Adirondacks", " United States", 5344);
        mountains[5] = new Mountain("Mount Mitchell-Blue Ridge", " United States", 6684);
        mountains[6] = new Mountain("Zugpitze", "Switzerland", 9719);
        System.out.printf("%-20s%-20s%10s%20s\n",
                "Mountain Name","Country","Elevation (ft)", "Elevation (mts)");
        for (Mountain mountain : mountains) {
            System.out.printf("%-20s%-20s%10d%20.2f\n", // look at ch.10
                    mountain.getName(), mountain.getCountry(), mountain.getElevation(),
                    Mountain.toMeters(mountain.getElevation()));
    }
    Mountain smallest = minElevation(mountains); // written in main function (#4)
    System.out.println("Mountain with smallest elevation:"); // get the lowest elevation 
    System.out.println("Name: " + smallest.getName());
    System.out.println("Country: " + smallest.getCountry());
    System.out.println("Elevation (ft): " + smallest.getElevation());
}  // chapter 10 for function and input 
}



