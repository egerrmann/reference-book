package by.bsu.referencebook.controllers;

import by.bsu.referencebook.models.requests.AlbumRequest;
import by.bsu.referencebook.models.requests.BandRequest;
import by.bsu.referencebook.services.AlbumService;
import by.bsu.referencebook.services.BandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/band")
@RequiredArgsConstructor
public class BandController {

    private final BandService bandService;
    private final AlbumService albumService;

    @GetMapping
    public String getAlbums(Model model) {
        model.addAttribute("bands", bandService.getBands());
        return "band";
    }

    @GetMapping("/update")
    public String updateAlbumTable(Model model) {
        model.addAttribute("bands", bandService.getBands());
        model.addAttribute("albums", albumService.getAlbums());
        return "band-update";
    }

    @PostMapping("/update")
    public String saveUpdatedBandTable(@RequestBody BandRequest bandRequest) {
        System.out.println(bandRequest);
        bandService.updateBands(bandRequest);
        return "album";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAlbum(@PathVariable String id) {
        bandService.deleteAlbum(id);
        return "album";
    }
}
