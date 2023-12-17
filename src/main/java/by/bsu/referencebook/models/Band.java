package by.bsu.referencebook.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "band_id")
    private Long bandId;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @JsonFormat(pattern = "dd.MM.yyyy")
    @Column(name = "formation_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date formationDate;

    @Column(name = "number_of_members", nullable = false)
    private int numberOfMembers;

    @Column(name = "most_popular_album", unique = true)
    private Long mostPopularAlbumId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "most_popular_album",
            referencedColumnName = "album_id",
            insertable = false,
            updatable = false)
    private Album mostPopularAlbum;

}
