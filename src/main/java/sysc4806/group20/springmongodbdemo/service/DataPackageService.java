package sysc4806.group20.springmongodbdemo.service;

import sysc4806.group20.springmongodbdemo.model.DataPackage;

import java.util.List;

public interface DataPackageService {
    List<DataPackage> getAllByUserId(Long userId);
    void create(DataPackage dataPackage);
    void deleteAll(Long userId);
}
