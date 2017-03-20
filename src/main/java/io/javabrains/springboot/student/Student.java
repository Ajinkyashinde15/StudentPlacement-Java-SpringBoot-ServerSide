package io.javabrains.springboot.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	

	private String sid;
	
	private String fname;
	private String sname;
	private String email;
	private String collegename;
	private String address;
	private String latitude;
	private String longitude;
	
	public Student(String sid, String fname, String sname, String email, String collegename, String address,
			String latitude, String longitude) {
		this.sid = sid;
		this.fname = fname;
		this.sname = sname;
		this.email = email;
		this.collegename = collegename;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Id
	@Column(name="sid")
	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}

	@Column(name="fname")
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}

	@Column(name="sname")
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="collegename")
	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Column(name="address")
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="latitude")
	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name="longitude")
	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public Student()
	{
		
	}	
	
}
