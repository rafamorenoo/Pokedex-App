package com.example.pokedex.model;

import java.util.List;

public class Pokemon {
    private String name;
    private String image;
    private int height;
    private int weight;
    private List<String> types;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public List<String> getTypes() { return types; }
    public void setTypes(List<String> types) { this.types = types; }
}
