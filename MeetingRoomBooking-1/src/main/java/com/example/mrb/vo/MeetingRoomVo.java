package com.example.mrb.vo;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(value = Include.NON_NULL)
public class MeetingRoomVo {
	@JsonProperty(value = "ConferenceRoomId")
	String id;
	@JsonProperty(value = "Capacity")
	int capacity;
	@JsonProperty(value = "IsProjectorAvailable")
	boolean projecter;
	@JsonProperty(value = "RoomSize")
	RoomSize size;
	@JsonProperty(value = "ConferenceRoomName")
	String name;
	@JsonProperty(value = "Address")
	AddressVo add;
	@JsonProperty(value = "BookingsList")
	Map<String,Map<String,String>> bookings;
	//<date<time,uid>> 

}
