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
    public double getPrice(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public double getReservationTotal(){
        throw new UnsupportedOperationException("Not implemented yet");
    }


}
