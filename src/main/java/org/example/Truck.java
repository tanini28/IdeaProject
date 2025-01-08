package org.example;

public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(float speed, int weight, String color, boolean isLoaded) {
        super(speed, weight, color);
        this.isLoaded = isLoaded;
    }

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded) {
        super.speed = speed;
        super.weight = weight;
        super.color = color;
       super.coordinates = coordinates;
       this.isLoaded = isLoaded;
    }

    @Override
    public String getValues() {
       String info = super.getValues();
       return info + "\n" + getLoaded();
    }

    @Override
    public void moveObject() {

    }


    public void setLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public String getLoaded() {
        if (isLoaded)
            return "Truck is loaded";
        else
            return "Truck is NOT loaded";
    }

    @Override
    public void moveobject(){
        System.out.println("object is moving");
    }

    @Override
    public void stopObject() {
        System.out.println("object stopped");
    }
}
