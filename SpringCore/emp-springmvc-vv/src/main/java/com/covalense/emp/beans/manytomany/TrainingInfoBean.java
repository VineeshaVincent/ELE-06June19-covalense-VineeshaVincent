package com.covalense.emp.beans.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.covalense.emp.beans.primary.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name="training_info")
@Data
public class TrainingInfoBean implements Serializable{

	@Id
	@Column(name="course_id")
	private int course_id;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="type")
	private String type;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="employee_training",
	joinColumns = {@JoinColumn(name="course_id")},
	inverseJoinColumns = {@JoinColumn(name="id")})
	List<EmployeeInfoBean> infoBeans;
	
}
