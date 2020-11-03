package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {

}
