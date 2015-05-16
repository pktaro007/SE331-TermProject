package CAMT.SE331.TermProject.Service;

import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Photo;

import java.util.List;

/**
 * Created by Pktaro on 5/4/2015.
 */
public interface GalleryService {
    Album createAlbum(Album album);
    Album updateAlbum(Album album);
    Album deleteAlbum(Album album);
    Photo uploadPhotoToAlbum(Photo photo, Album album);
    Photo deletePhotoFromAlbum(Photo photo, Album album);
    List<Album> getAlbums();
    List<Photo> getPhotosFromAlbum(Album album);
}
