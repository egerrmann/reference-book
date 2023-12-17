package by.bsu.referencebook.repositories;

import by.bsu.referencebook.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findAlbumByTitleAndReleaseDateAndNumberOfTracksAndSales(String title,
                                                                            Date releaseDate,
                                                                            Integer numberOfTracks,
                                                                            BigDecimal sales);

    Album findByAlbumId(Long albumId);
}
