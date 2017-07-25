package model.data;

import model.PasswordEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by davidprince on 7/25/17.
 */
public interface PasswordDAO extends CrudRepository<PasswordEntity, Integer> {
}
