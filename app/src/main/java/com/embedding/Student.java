package com.embedding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="embedding_student")
public class Student {
	@Id
	private int sid;
	private String name;
	@Column(name = "certificate")
	private Certificate certi;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, Certificate certi) {
		super();
		this.sid = sid;
		this.name = name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", certi=" + certi + "]";
	}
	
}
