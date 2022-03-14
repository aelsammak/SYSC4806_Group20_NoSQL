package sysc4806.group20.springmongodbdemo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import sysc4806.group20.springmongodbdemo.model.Data;
import sysc4806.group20.springmongodbdemo.model.DataPackage;
import sysc4806.group20.springmongodbdemo.service.DataPackageService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/api/v0/data")
@RequiredArgsConstructor
@Slf4j
public class LogController {

    private final DataPackageService dataPackageService;

    @PostMapping
    public ResponseEntity<DataPackage> saveData(@RequestBody Data requestBody, @RequestParam Long userId){
        DataPackage dataPackage = new DataPackage(requestBody, userId);
        dataPackageService.create(dataPackage);
        return ResponseEntity.created(URI.create(
                ServletUriComponentsBuilder
                        .fromCurrentContextPath()
                        .path("/api/v0/data")
                        .toUriString())
        ).body(dataPackage);
    }

    @GetMapping
    public ResponseEntity<List<DataPackage>> getData(@RequestParam Long userId){
        return ResponseEntity.ok(dataPackageService.getAllByUserId(userId));
    }

    @DeleteMapping
    public ResponseEntity<List<DataPackage>> deleteAllData(@RequestParam Long userId){
        dataPackageService.deleteAll(userId);
        return ResponseEntity.ok().build();
    }
}
