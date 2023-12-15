package edu.srpingsec.repository;

import edu.srpingsec.dao.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
