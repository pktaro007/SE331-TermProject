package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Photo;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface GalleryDao {
    void addAlbum(Album album);
    void editAlbum(Album album);
    void deleteAlbum(Album album);
    void addPhotoToAlbum(Photo photo, Album album);
    void deletePhotoFromAlbum(Photo photo, Album album);
    List<Album> getAlbums();
    List<Photo> getPhotosFromAlbum(Album album);
}
