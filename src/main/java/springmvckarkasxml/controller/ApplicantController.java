package springmvckarkasxml.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springmvckarkasxml.model.Applicant;
import springmvckarkasxml.service.ApplicantService;

import java.math.BigDecimal;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ApplicantController {
    private Logger log = LoggerFactory.getLogger(getClass());
    private static final String REST_URL = "applicant";

    @Autowired
    private ApplicantService service;

    @GetMapping(REST_URL + "/{id}")
    public Applicant get(@PathVariable BigDecimal id){
        log.info("Applicant get");
        return service.get(id);
    }
}