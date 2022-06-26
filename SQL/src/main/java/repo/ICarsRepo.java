package repo;

import data.Cars;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICarsRepo extends CrudRepository<Cars, Integer> {
    List<Cars> findByName (String name);
}
