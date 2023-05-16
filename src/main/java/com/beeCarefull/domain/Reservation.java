package com.beeCarefull.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl_reservation")
public class Reservation {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 
 private String firstName;
 
 private String lastName;
 
 private String email;
 
 private String phone;
 
 private String address;
 
 private LocalDateTime time;

}
