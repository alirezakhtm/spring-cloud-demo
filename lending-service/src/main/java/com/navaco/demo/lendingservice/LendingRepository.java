package com.navaco.demo.lendingservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LendingRepository extends CrudRepository<Lending, Long> {

    List<Lending> findByNi(String ni);

}
