package com.pluralsight;


public class Reservation {
    //field members (backing variables)
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //getters and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    //derived methods
    public double getPrice() {
        return switch (roomType.toLowerCase()) {
            case "king" -> 139;
            case "double" -> 124;
            default -> throw new IllegalArgumentException("Invalid room type: " + roomType);
        };
    }


    public double getReservationTotal(){
        throw new UnsupportedOperationException("Not implemented yet");
    }


}
