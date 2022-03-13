package controller;

import lombok.AllArgsConstructor;
import model.PlaceHolderModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PlaceHolderService;

import java.util.List;

@RestController
@RequestMapping("api/v0/PlaceHolderModel")
@AllArgsConstructor
public class PlaceHolderController {

    private final PlaceHolderService placeHolderService;

    @GetMapping("")
    public List<PlaceHolderModel> getAll() {
        return placeHolderService.getAll();
    }
}
