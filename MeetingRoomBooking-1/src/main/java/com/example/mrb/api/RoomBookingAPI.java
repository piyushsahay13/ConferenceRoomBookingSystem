package com.example.mrb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mrb.repodb.Initializer;
import com.example.mrb.vo.MRBPayload;
import com.example.mrb.vo.MeetingRoomVo;

@RestController
@RequestMapping("/mrb")
public class RoomBookingAPI {
	@Autowired
	private Initializer repo;
	
	@GetMapping("/availableRooms")
	public ResponseEntity<Boolean> getAvailableRooms() {
		boolean res = false;
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	@PostMapping("/createBooking")
	public ResponseEntity<Boolean> createNewBooking(@RequestBody MRBPayload mrbRequest) {
//		boolean reqValidation = validation.validateBookingDetails(mrbRequest);
//		boolean advBookingValidation = validation.validateBookingTiming(confRequest.getTo(),confRequest.getFrom());
//		boolean validateUser = validation.validateUser(confRequest.getRequestor());
//		if(reqValidation && advBookingValidation && validateUser) {
//			
//		}
		return new ResponseEntity<>(true,HttpStatus.OK);
	}
	
	@GetMapping("/getAllConfRooms")
	public ResponseEntity<List<MeetingRoomVo>> getAllRooms() {
		List<MeetingRoomVo> res = repo.getConfRoom();
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
