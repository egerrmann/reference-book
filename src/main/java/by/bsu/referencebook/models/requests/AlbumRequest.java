package by.bsu.referencebook.models.requests;

import by.bsu.referencebook.models.Album;
import lombok.Data;

import java.util.List;

@Data
public class AlbumRequest {
    private List<Album> albums;
}
