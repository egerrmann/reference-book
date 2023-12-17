package by.bsu.referencebook.repositories;

import by.bsu.referencebook.models.Band;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<Band, Integer> {
}
