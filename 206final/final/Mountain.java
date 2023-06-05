public class Mountain {

    private String name;
    private String country;
    private int elevation;

    public Mountain() {
        this.name = "";
        this.country = "";
        this.elevation = 0;
    }
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
    public String getCountry() {
        return country;
    }
    public int getElevation() {
        return elevation;
    }
    public static double toMeters(double elevationInFeets) {
        final double FEET_TO_METER = 1 / 3.2808;
        return elevationInFeets * FEET_TO_METER;
    }
    public static Mountain minElevation(Mountain mountains[]) {
        int minIndex = 0;
        for (int i = 0; i < mountains.length; i++) {
            if (mountains[i].getElevation() < mountains[minIndex].getElevation()) {
                minIndex = i;
            }
        }
        return mountains[minIndex];
    } 
    public static void main(String[] args) {
        Mountain mountains[] = new Mountain[7];
        mountains[0] = new Mountain("Chimborazo","Ecudador", 20549);
        mountains[1] = new Mountain("Matterhorn", "Switzeland", 14692);
        mountains[2] = new Mountain("Olympus", "Geece(Macedonia)", 9573);
        mountains[3] = new Mountain("Everest", "Nepal", 290929);
        mountains[4] = new Mountain("Mount Marcy-Adirondacks", "United Staes", 5344);
        mountains[5] = new Mountain("Mount Mitchell-Blue Ridge", "United States", 6684);
        mountains[6] = new Mountain("Zugpitze", "Switzerland", 9719);
        System.out.printf("%-20s%-20s%10s%20s\n",
                "Mountain Name","Country","Elevation (ft)", "Elevation (mts)");
        for (Mountain mountain : mountains) {
            System.out.printf("%-20s%-20s%10d%20.2f\n",
                    mountain.getName(), mountain.getCountry(), mountain.getElevation(),
                    Mountain.toMeters(mountain.getElevation())
            );
        }
        Mountain smallest = minElevation(mountains);
        System.out.println("Mountain with smallest elevation:"); // might need \n
        System.out.println("Name: " + smallest.getName());
        System.out.println("Country: " + smallest.getCountry());
        System.out.println("Elevation (ft): " + smallest.getElevation());
    }
}



