package com.beeCarefull.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_user")
public class User {

private Long id;

private String firstName;

private String lastName;

private String phone;

private String address;

private LocalDateTime create;

private LocalDateTime update;

private Integer status;

private String password;

private String email;

private Boolean builtIn;

@ManyToMany
@JoinTable(name="tbl_user_Role", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns= @JoinColumn(name="role_id"))
private Set<Role> roles=new HashSet<>();
}
