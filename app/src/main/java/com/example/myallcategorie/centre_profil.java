package com.example.myallcategorie;

public class centre_profil {
    int image;
    String nom;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return tele;
    }

    public void setDesc(String desc) {
        this.tele = desc;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public centre_profil(int image, String nom, String desc, String loc) {
        this.image = image;
        this.nom = nom;
        this.tele = desc;
        this.loc = loc;
    }

    String tele;
    String loc;
}
