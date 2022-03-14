package sysc4806.group20.springmongodbdemo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sysc4806.group20.springmongodbdemo.model.DataPackage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sysc4806.group20.springmongodbdemo.repository.DataPackageRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class DataPackageServiceImpl implements DataPackageService {

    private final DataPackageRepo dataPackageRepo;

    @Override
    public List<DataPackage> getAllByUserId(Long userId) {
        return dataPackageRepo.findByUserId(userId);
    }

    @Override
    public void create(DataPackage dataPackage) {
        dataPackageRepo.save(dataPackage);
    }

    @Override
    public void deleteAll(Long userId) {
        dataPackageRepo.deleteAllByUserId(userId);
    }
}
