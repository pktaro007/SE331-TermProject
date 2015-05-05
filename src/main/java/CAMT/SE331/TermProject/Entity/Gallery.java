package CAMT.SE331.TermProject.Entity;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public class Gallery {
    List<Album> albums;

    public Gallery(List<Album> albums) {
        this.albums = albums;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
