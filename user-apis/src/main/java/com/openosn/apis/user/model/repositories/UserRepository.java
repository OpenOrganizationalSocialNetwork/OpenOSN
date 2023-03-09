package com.openosn.apis.user.model.repositories;

import com.openosn.apis.user.model.to.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
