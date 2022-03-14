package sysc4806.group20.springmongodbdemo.repository;

import sysc4806.group20.springmongodbdemo.model.DataPackage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataPackageRepo extends MongoRepository<DataPackage, Long> {
    List<DataPackage> findByUserId(Long userId);
    void deleteAllByUserId(Long userId);
}