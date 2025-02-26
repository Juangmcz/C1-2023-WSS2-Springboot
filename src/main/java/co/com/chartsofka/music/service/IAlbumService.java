package co.com.chartsofka.music.service;

import co.com.chartsofka.music.dto.AlbumDTO;
import co.com.chartsofka.music.entity.Album;

import java.util.List;

public interface IAlbumService {

    //To manage the DTOs - Entity dynamic
    Album dtoToEntity (AlbumDTO albumDTO);
    AlbumDTO entityToDTO(Album album);

    //Basic operate
    List<AlbumDTO> getAlbums();

    AlbumDTO findAlbumById(String albumID);

    String saveAlbum(AlbumDTO albumDTO);

    AlbumDTO updateAlbum(AlbumDTO albumDTO);

    String deleteAlbum(String albumID);

}
