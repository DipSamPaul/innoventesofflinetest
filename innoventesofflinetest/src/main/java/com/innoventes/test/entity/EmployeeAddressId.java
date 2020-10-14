package com.innoventes.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmployeeAddressId implements Serializable{
	@Column(name = "emplyee_id")
	private long emplyeeId;
	@Column(name = "address_id")
	private long addressId;
	public EmployeeAddressId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeAddressId(long emplyeeId, long addressId) {
		super();
		this.emplyeeId = emplyeeId;
		this.addressId = addressId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (addressId ^ (addressId >>> 32));
		result = prime * result + (int) (emplyeeId ^ (emplyeeId >>> 32));
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
		EmployeeAddressId other = (EmployeeAddressId) obj;
		if (addressId != other.addressId)
			return false;
		if (emplyeeId != other.emplyeeId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployeeAddressId [emplyeeId=" + emplyeeId + ", addressId=" + addressId + "]";
	}
}
