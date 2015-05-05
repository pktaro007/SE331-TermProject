package CAMT.SE331.TermProject.Entity;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class Album {
    int id;
    String name;
    String desc;
    String date;
    List<Photo> photos;

    public Album(int id, String name, String desc, String date, List<Photo> photos) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.date = date;
        this.photos = photos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
