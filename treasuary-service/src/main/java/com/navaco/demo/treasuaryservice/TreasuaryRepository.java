package com.navaco.demo.treasuaryservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreasuaryRepository extends CrudRepository<Treasuary, Long> {

    Treasuary findAllByNi(String ni);

}
