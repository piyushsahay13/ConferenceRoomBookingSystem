package com.example.mrb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(value = Include.NON_NULL)
public class AddressVo {
	@JsonProperty(value = "BuildingId")
	String bid;
	@JsonProperty(value = "Floor")
	int floor;
	@JsonProperty(value = "BuildingName")
	String buiding;
	@JsonProperty(value = "City")
	String city;
	@JsonProperty(value = "Campus")
	String campus;
}
