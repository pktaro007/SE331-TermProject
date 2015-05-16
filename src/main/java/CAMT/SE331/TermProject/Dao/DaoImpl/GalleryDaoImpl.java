package CAMT.SE331.TermProject.Dao.DaoImpl;

import CAMT.SE331.TermProject.Dao.GalleryDao;
import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Gallery;
import CAMT.SE331.TermProject.Entity.Photo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by GolfPapilio on 5/5/15.
 */
@Repository
public class GalleryDaoImpl implements GalleryDao {
    private Set<Gallery> galleries;

    public GalleryDaoImpl(){
        Gallery[] initGallery={
            new Gallery(getAlbums()) //ต้องเอาอย่าอื่นมาใส่
        };
        galleries = new TreeSet<Gallery>(Arrays.asList(initGallery));
    }

    @Override
    public Album addAlbum(Album album) {
        return null;
    }

    @Override
    public Album editAlbum(Album album) {
        return null;
    }

    @Override
    public Album deleteAlbum(Album album) {
        return null;
    }

    @Override
    public Photo addPhotoToAlbum(Photo photo, Album album) {
        return null;
    }

    @Override
    public Photo deletePhotoFromAlbum(Photo photo, Album album) {
        return null;
    }

    @Override
    public List<Album> getAlbums() {
        return null;
    }

    @Override
    public List<Photo> getPhotosFromAlbum(Album album) {
        return null;
    }
}
