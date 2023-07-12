package com.dd.DBGuiHF.model;

import com.dd.DBGuiHF.dto.IncomeDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepositoryQuery  extends JpaRepository<Income, Integer>
{
@Query("SELECT new com.dd.DBGuiHF.dto.IncomeDTO(i.partner.name AS partnerName, i.amount, i.created, i.approved) "
        + "FROM Income i "
        + "ORDER BY i.created DESC "
        + "LIMIT 25")
    List<IncomeDTO> findLatest25IncomeDTOs();
    
@Query("Select new com.dd.DBGuiHF.dto.IncomeDTO(i.partner.name AS partnerName, i.partner.contact AS partnerContact, i.project, i.amount, i.created, i.approved)"
        + "FROM Income i "
        + "ORDER BY i.created DESC "
        + "LIMIT 1")
    List<IncomeDTO> findLatestIncomeDTO();
    
@Query("SELECT new com.dd.DBGuiHF.dto.IncomeDTO(i.partner.name AS partnerName, i.amount, i.created, i.approved) "
        + "FROM Income i "
        + "WHERE i.approved IS NULL "
        + "ORDER BY i.created DESC ")
    List<IncomeDTO> findNoPayed();
    
@Query("SELECT new com.dd.DBGuiHF.dto.IncomeDTO(i.partner.name AS partnerName, COUNT(i.partner.name) AS projectCounter) "
        + "FROM Income i "
        + "Group BY i.partner.name")
    List<IncomeDTO> findpartnerWithProjectCount();
}
