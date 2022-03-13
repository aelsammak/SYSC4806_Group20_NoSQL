package service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.PlaceHolderModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.PlaceHolderRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class PlaceHolderServiceImpl implements PlaceHolderService {

    private final PlaceHolderRepo placeHolderRepo;

    @Override
    public List<PlaceHolderModel> getAll() {
        return placeHolderRepo.findAll();
    }
}
