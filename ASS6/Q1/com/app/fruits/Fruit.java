package com.app.fruits;


public class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

 
    public Fruit(String name, double weight, String color, boolean isFresh) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.isFresh = isFresh;
    }

  
    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }


    @Override
    public String toString() {
        return name + " [Color: " + color + ", Weight: " + weight + "]";
    }


    public String taste() {
        return "no specific taste";
    }
}

class Apple extends Fruit {
    public Apple(String name, double weight, String color) {
        super(name, weight, color, true); 
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}

class Mango extends Fruit {
    public Mango(String name, double weight, String color) {
        super(name, weight, color, true); 
    }

    @Override
    public String taste() {
        return "sweet";
    }
}


class Orange extends Fruit {
    public Orange(String name, double weight, String color) {
        super(name, weight, color, true); 
    }

    @Override
    public String taste() {
        return "sour";
    }
}
