package com.companies.microservice_companies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companies.microservice_companies.entity.CompaniesEntity;
import com.companies.microservice_companies.service.CompaniesService;


@RestController
@RequestMapping("companies")
public class CompaniesController {
    @Autowired
    CompaniesService companiesService;

    @GetMapping("/")
    public ResponseEntity<?> getCompanies() {
        List<CompaniesEntity> companies = companiesService.getCompanies();
        return ResponseEntity.ok(companies);
    }

}
