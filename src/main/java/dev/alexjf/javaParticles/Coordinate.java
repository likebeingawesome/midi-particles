package dev.alexjf.javaParticles;

public class Coordinate {
    public double xCoordinate;
    public double yCoordinate;

    public Coordinate(double xCoordinate2, double yCoordinate2){
        xCoordinate = xCoordinate2;
        yCoordinate = yCoordinate2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Coordinate coordinate2 = (Coordinate) o;
        return (int) xCoordinate == (int) coordinate2.xCoordinate && (int) yCoordinate == (int) coordinate2.yCoordinate;
    }

    @Override
    public int hashCode(){
        return (int) xCoordinate * 31 + (int) yCoordinate;
    }
}