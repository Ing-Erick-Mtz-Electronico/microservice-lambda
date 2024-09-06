package com.companies.microservice_companies.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.companies.microservice_companies.entity.CompaniesEntity;

@Service
public class CompaniesService {

    public List<CompaniesEntity> getCompanies(){
        CompaniesEntity companie = new CompaniesEntity();
        companie.setId(1);
        companie.setName("nestle");
        companie.setAddress("address");
        List<CompaniesEntity> companies = new ArrayList<>();
        companies.add(companie);
        return companies;
    }
}
