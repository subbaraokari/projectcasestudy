package org.simplilearn.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpRegistrationModel {
	private String name;
	private String address;
	private LocalDate dateOfJoin;
	private String passportNumber;
	private LocalDate expiryDate;
}
