package com.example.mrb.vo;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = Include.NON_NULL)
@Getter
@ToString
public class MRBPayload {
	@JsonProperty(value="RoomSize")
	@NonNull
	int roomSize;
	@JsonProperty(value = "RequestorUserId")
	@NonNull
	String requestor;
	@JsonProperty(value = "IsProjectorRequired")
	boolean projectorRequired;
	@NonNull
	@JsonProperty(value = "DateOfBooking")
	String bookingDate;
	@NonNull
	@JsonProperty(value="StartTime")
	String from;
	@NonNull
	@JsonProperty(value = "EndTime")
	String to;
}
