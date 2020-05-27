package com.example.demo;

public class Room {

    String roomname;

    public class Subroom extends Room {

    }

    public Room createSubRoom(Room room) {
        Room Subroom = new Room();
        return Subroom;
    }

    public String getRoomname() {
        return roomname;
    }



    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

}
