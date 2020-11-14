package springmvckarkasxml.service;

import org.springframework.stereotype.Service;
import springmvckarkasxml.model.Applicant;
import springmvckarkasxml.repository.ApplicantRepository;

import java.math.BigDecimal;

@Service
public class ApplicantService {
    private final ApplicantRepository repository;

    public ApplicantService(ApplicantRepository repository){
        this.repository = repository;
    }

    public Applicant get(BigDecimal id){
        return repository.get(id);
    }
}
