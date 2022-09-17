package org.simplilearn.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eno;
	private String name;
	private String address;
	@OneToOne
	@JoinColumn(name = "pid")
	private Passport passport;
	private LocalDate dateOfJoin;
	@CreationTimestamp
	private LocalDateTime creationDate;
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
}
