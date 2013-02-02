package com.sdfteam.d3armory.domain.hero;

/**
 * Created with IntelliJ IDEA.
 * User: czochcio
 * Date: 2/1/13
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rune {
    private String slug;
    private String type;
    private String name;
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}
