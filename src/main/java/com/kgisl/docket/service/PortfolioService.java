package com.kgisl.docket.service;

import java.util.List;

import javax.validation.Valid;

import com.kgisl.docket.model.Portfolio;



public interface PortfolioService {

    public List<Portfolio> getAll();

    // public Portfolio save(Portfolio portfolio);

    // public Portfolio find(long id);

    public void delete(Long pId);


    public List<Portfolio>save( List<Portfolio>  portfolio);

    public Portfolio update(Portfolio portfolio,Long pId);

}