package com.example.mrb.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeVo {
	String eid;
	String employeeName;
	String department;
	String emailId;
}
