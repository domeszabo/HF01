package com.dd.DBGuiHF.model;

import com.dd.DBGuiHF.dto.IncomeDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Model 
{
    @Autowired
    private IncomeRepository incomeRepository;
    @Autowired
    private PartnersRepository partnersRepository;
    @Autowired
    private IncomeRepositoryQuery incomeRQuery;
    
    public List<Income> getIncomes()
    {
        return incomeRepository.findAll();
    }
    
    public List<Partners> getPartners()
    {
        return partnersRepository.findAll();
    }
    
    public List<IncomeDTO> getLatest25IncomeDTOs()
    {
        return incomeRQuery.findLatest25IncomeDTOs();
    }
    
    public List<IncomeDTO> getLatestActivity()
    {
        return incomeRQuery.findLatestIncomeDTO();
    }
    
    public List<IncomeDTO> getNoPayed()
    {
        return incomeRQuery.findNoPayed();
    }
    
    public List<IncomeDTO> getPartnersProjectCount()
    {
        return incomeRQuery.findpartnerWithProjectCount();
    }
    
    public void save(Partners partner)
    {
        partnersRepository.save(partner);
    }
    
    public void delete(Partners partner)
    {
        partnersRepository.delete(partner);
    }
}
