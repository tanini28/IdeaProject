package org.example;

public abstract class Transport {

    protected float speed;

    protected int weight;

    protected String color;

    protected byte[] coordinates;
    public Engine engine = new Engine();

    public Transport(int speed, int weight, String color, String coordinates) {

    }


    class Engine {

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
        this.isReady = isReady;
        this.km = km;

        }

        public void IsReady(boolean isReady){
            this.isReady = isReady;
        }

        public void info() {
            if (isReady)
                System.out.println("Engine is good");
            else
                System.out.println("Engine is damaged. He has already  driven" + km + "km.");
        }
    }

    public Transport() {
       // System.out.println("Object ia created");
        setValues(speed, weight, color, coordinates);
        System.out.println(getValues());
    }

    public Transport(float speed, int weight, String color) {
        // System.out.println("Object ia created");
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = new byte[0];
    }

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinates) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinates = _coordinates;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";

        if (coordinates.length > 0) {
            String infoCoordinates = "Coordinates:\n";
            for (byte el : coordinates)
                infoCoordinates += el + "\n";

            return info + infoCoordinates;
        }

       return info;
    }

    public abstract void moveObject();

    public abstract void moveobject();

    public abstract void stopObject();
}

