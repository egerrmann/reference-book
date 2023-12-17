package by.bsu.referencebook.controllers;

import by.bsu.referencebook.models.requests.AlbumRequest;
import by.bsu.referencebook.models.responses.AlbumResponse;
import by.bsu.referencebook.services.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/album")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping
    public String getAlbums(Model model) {
        model.addAttribute("albums", albumService.getAlbums());
        return "album";
    }

    @GetMapping("/entities")
    @ResponseBody
    public AlbumResponse getAlbumEntities() {
        return new AlbumResponse(albumService.getAlbums());
    }

    @GetMapping("/update")
    public String updateAlbumTable(Model model) {
        model.addAttribute("albums", albumService.getAlbums());
        return "album-update";
    }

    @PostMapping("/update")
    public String saveUpdatedAlbumTable(@RequestBody AlbumRequest albumRequest) throws Exception {
        albumService.updateAlbums(albumRequest);
        return "album";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAlbum(@PathVariable String id) {
        albumService.deleteAlbum(id);
        return "album";
    }
}
