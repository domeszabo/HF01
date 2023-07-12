package com.dd.DBGuiHF.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface PartnersRepository extends CrudRepository<Partners, Integer>
{
    List<Partners> findAll();
    Partners save(Partners partner);
    void delete(Partners partner);
}
