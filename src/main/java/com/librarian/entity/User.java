package com.myblog.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "user")
public class User  implements Serializable {

	@Column(name = "use_id")
	@Id
	private Integer useId;

	private String name;

	private String password;

	private Integer id;

}
