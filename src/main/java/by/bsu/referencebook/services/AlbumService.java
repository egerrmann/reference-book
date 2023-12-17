package by.bsu.referencebook.services;

import by.bsu.referencebook.models.Album;
import by.bsu.referencebook.models.requests.AlbumRequest;
import by.bsu.referencebook.repositories.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    public List<Album> getAlbums() {
        return albumRepository.findAll();
    }

    public void updateAlbums(AlbumRequest request) {
        albumRepository.saveAll(request.getAlbums());
    }

    public void deleteAlbum(String id) {
        albumRepository.deleteById(Integer.valueOf(id));
    }
}
