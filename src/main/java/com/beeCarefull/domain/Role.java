package com.beeCarefull.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.beeCarefull.domain.Enum.RoleType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Enumerated(EnumType.STRING)
private RoleType roleType;
@Override
public String toString() {
	return "Role [type=" + roleType + "]";
}	
}
