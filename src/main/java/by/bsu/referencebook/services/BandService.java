package by.bsu.referencebook.services;

import by.bsu.referencebook.models.Band;
import by.bsu.referencebook.models.requests.BandRequest;
import by.bsu.referencebook.repositories.BandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BandService {

    private final BandRepository bandRepository;

    public List<Band> getBands() {
        return bandRepository.findAll();
    }

    public void updateBands(BandRequest bandRequest) {
        bandRepository.saveAll(bandRequest.getBands());
    }

    public void deleteAlbum(String id) {
        bandRepository.deleteById(Integer.valueOf(id));
    }
}
