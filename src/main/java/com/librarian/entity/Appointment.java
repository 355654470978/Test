package com.myblog.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "appointment")
public class Appointment  implements Serializable {

	@Id
	@Column(name = "book_id")
	private Integer bookId;

	@Column(name = "student_id")
	private String studentId;

	@Column(name = "appoint_time")
	private java.util.Date appointTime;

}
