package CAMT.SE331.TermProject.Dao;

import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Photo;

import java.util.List;

/**
 * Created by Pktaro on 5/3/2015.
 */
public interface GalleryDao {
    Album addAlbum(Album album);
    Album editAlbum(Album album);
    Album deleteAlbum(Album album);
    Photo addPhotoToAlbum(Photo photo, Album album);
    Photo deletePhotoFromAlbum(Photo photo, Album album);
    List<Album> getAlbums();
    List<Photo> getPhotosFromAlbum(Album album);
}
