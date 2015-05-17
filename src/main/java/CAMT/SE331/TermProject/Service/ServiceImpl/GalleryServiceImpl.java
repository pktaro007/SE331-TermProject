package CAMT.SE331.TermProject.Service.ServiceImpl;

import CAMT.SE331.TermProject.Dao.GalleryDao;
import CAMT.SE331.TermProject.Entity.Album;
import CAMT.SE331.TermProject.Entity.Photo;
import CAMT.SE331.TermProject.Service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Pktaro on 5/5/2015.
 */
public class GalleryServiceImpl implements GalleryService {
    @Autowired
    GalleryDao galleryDao;

    @Override
    public Album createAlbum(Album album) {
        return galleryDao.addAlbum(album);
    }

    @Override
    public Album updateAlbum(Album album) {
        return galleryDao.editAlbum(album);
    }

    @Override
    public Album deleteAlbum(Album album) {
        return galleryDao.deleteAlbum(album);
    }

    @Override
    public Photo uploadPhotoToAlbum(Photo photo, Album album) {
        return galleryDao.addPhotoToAlbum(photo, album);
    }

    @Override
    public Photo deletePhotoFromAlbum(Photo photo, Album album) {
        return galleryDao.deletePhotoFromAlbum(photo,album);
    }

    @Override
    public List<Album> getAlbums() {
        return galleryDao.getAlbums();
    }

    @Override
    public List<Photo> getPhotosFromAlbum(Album album) {
        return galleryDao.getPhotosFromAlbum(album);
    }
}
