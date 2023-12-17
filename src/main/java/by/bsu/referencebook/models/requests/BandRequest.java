package by.bsu.referencebook.models.requests;

import by.bsu.referencebook.models.Band;
import lombok.Data;

import java.util.List;

@Data
public class BandRequest {
    private List<Band> bands;
}
