package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Photo;

import java.util.List;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface GalleryService {
    void createAlbum(Album album);
    void updateAlbum(Album album);
    void deleteAlbum(Album album);
    void uploadPhotoToAlbum(Photo photo, Album album);
    void deletePhotoFromAlbum(Photo photo, Album album);
    List<Album> getAlbums();
    List<Photo> getPhotosFromAlbum(Album album);
}
