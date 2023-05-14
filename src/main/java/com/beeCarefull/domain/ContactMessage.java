package com.beeCarefull.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity 
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactMessage {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	
	private String message;
	private String email;
	private String firstName;
	private String lastName;
	private LocalDateTime time;
	

}
