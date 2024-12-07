package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentData {
	
	
@Id
@Column(name="sid")
int studid;
@Column(name="sname")
String stuname;
public int getStudid() {
	return studid;
}
public void setStudid(int studid) {
	this.studid = studid;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}






}
