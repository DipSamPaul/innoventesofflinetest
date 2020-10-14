package com.innoventes.test.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "addrlineone")
	private String addrLineOne;
	@Column(name = "addrlinetwo")
	private String addrLineTwo;
	@Column(name = "city")
	private String city;
	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<EmployeeAddress> employeAddressList = new ArrayList();

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddrLineOne() {
		return addrLineOne;
	}

	public void setAddrLineOne(String addrLineOne) {
		this.addrLineOne = addrLineOne;
	}

	public String getAddrLineTwo() {
		return addrLineTwo;
	}

	public void setAddrLineTwo(String addrLineTwo) {
		this.addrLineTwo = addrLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<EmployeeAddress> getEmployeAddressList() {
		return employeAddressList;
	}

	public void setEmployeAddressList(List<EmployeeAddress> employeAddressList) {
		this.employeAddressList = employeAddressList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addrLineOne == null) ? 0 : addrLineOne.hashCode());
		result = prime * result + ((addrLineTwo == null) ? 0 : addrLineTwo.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((employeAddressList == null) ? 0 : employeAddressList.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (addrLineOne == null) {
			if (other.addrLineOne != null)
				return false;
		} else if (!addrLineOne.equals(other.addrLineOne))
			return false;
		if (addrLineTwo == null) {
			if (other.addrLineTwo != null)
				return false;
		} else if (!addrLineTwo.equals(other.addrLineTwo))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (employeAddressList == null) {
			if (other.employeAddressList != null)
				return false;
		} else if (!employeAddressList.equals(other.employeAddressList))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

}
