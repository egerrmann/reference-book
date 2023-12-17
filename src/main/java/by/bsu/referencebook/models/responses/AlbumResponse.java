package by.bsu.referencebook.models.responses;

import by.bsu.referencebook.models.Album;
import lombok.Data;

import java.util.List;

@Data
public class AlbumResponse {
    private List<Album> albums;

    public AlbumResponse(List<Album> albums) {
        this.albums = albums;
    }
}
