package by.bsu.referencebook.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Entity
@Table
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Long albumId;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @Column(name = "release_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "number_of_tracks", nullable = false)
    private Integer numberOfTracks;

    @Column(name = "sales", precision = 8, scale = 3, nullable = false)
    private BigDecimal sales;
}
