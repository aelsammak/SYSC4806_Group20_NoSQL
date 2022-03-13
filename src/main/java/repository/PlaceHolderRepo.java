package repository;

import model.PlaceHolderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceHolderRepo extends MongoRepository<PlaceHolderModel, Long> {
}
