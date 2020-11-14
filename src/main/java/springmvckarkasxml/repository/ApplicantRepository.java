package springmvckarkasxml.repository;

import springmvckarkasxml.model.Applicant;

import java.math.BigDecimal;

public interface ApplicantRepository {
    Applicant get(BigDecimal id);
}
