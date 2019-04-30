package com.navaco.demo.cifservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CifRepository extends CrudRepository<User, Long> {
    User findUserById(Long id);
    User findUserByName(String name);
    User findUserByNi(String ni);
}
