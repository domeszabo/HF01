package com.dd.DBGuiHF.model;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface IncomeRepository extends CrudRepository<Income, Integer>
{
    
    List<Income> findAll();
    
  
}
