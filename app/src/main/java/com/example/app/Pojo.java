package com.example.app;

public class Pojo {
    private  int image;
    private String tiltle;
    private  String  dec;

    public Pojo(int image, String dec, String tiltle) {
        this.image = image;
        this.dec = dec;
        this.tiltle = tiltle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getTiltle() {
        return tiltle;
    }

    public void setTiltle(String tiltle) {
        this.tiltle = tiltle;
    }
}
