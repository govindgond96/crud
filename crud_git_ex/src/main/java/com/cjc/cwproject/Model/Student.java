package com.cjc.cwproject.Model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class Student {

	private int sid;
	private String sname;
	private String saddr;
	
}
