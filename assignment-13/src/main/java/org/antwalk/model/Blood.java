package org.antwalk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.antwalk.validation.Organization;
import org.antwalk.validation.Email;

@Entity
@Table(name="EmployeeBloodGroups")
public class Blood 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	@Email
	private String email;
	
	@Column(name="organization")
	@Organization
	private String organization;
	

	@Column(name="bloodGroup")
	private String bloodGroup;
	
	
	
	
	

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public Blood(int id, String name, String email, String organization, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.organization = organization;
		this.bloodGroup = bloodGroup;
	}

	public Blood()
	{
		super();
	}
	
	
	
}
