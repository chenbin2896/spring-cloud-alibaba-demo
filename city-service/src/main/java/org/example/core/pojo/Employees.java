package org.example.core.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Employees {

  private long empNo;
  private java.sql.Date birthDate;
  private String firstName;
  private String lastName;
  private String gender;
  private Date hireDate;
}
