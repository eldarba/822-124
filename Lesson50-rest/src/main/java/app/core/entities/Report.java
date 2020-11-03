package app.core.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Report {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
	private LocalDateTime reportTime;
	private String description;

	public Report() {
	}

	public Report(LocalDateTime dateTime, String description) {
		super();
		this.reportTime = dateTime;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDateTime() {
		return reportTime;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.reportTime = dateTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", dateTime=" + reportTime + ", description=" + description + "]";
	}

}
