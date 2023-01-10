package com.example.mrb.repodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.mrb.vo.AddressVo;
import com.example.mrb.vo.EmployeeVo;
import com.example.mrb.vo.MeetingRoomVo;
import com.example.mrb.vo.RoomSize;

import lombok.Getter;

@Component
@Getter
public class Initializer {
	List<EmployeeVo> employee = new ArrayList<>();
	List<MeetingRoomVo> confRoom = new ArrayList<>();
	
	public void buildmployeesRepo() {
		EmployeeVo e1 = EmployeeVo.builder().eid("T100").department("Technology").employeeName("Piyush Sahay").emailId("piyushsahay13@outlook.com").build();
		EmployeeVo e2 = EmployeeVo.builder().eid("T101").department("Technology").employeeName("Raj").emailId("raj@outlook.com").build();
		EmployeeVo e3 = EmployeeVo.builder().eid("T102").department("Technology").employeeName("Ayush").emailId("ayush@outlook.com").build();
		EmployeeVo e4 = EmployeeVo.builder().eid("T103").department("Technology").employeeName("Rajesh").emailId("Rajesh@outlook.com").build();
		EmployeeVo e5 = EmployeeVo.builder().eid("T104").department("Technology").employeeName("Prakash").emailId("Prakash@outlook.com").build();
		EmployeeVo e6 = EmployeeVo.builder().eid("T105").department("Technology").employeeName("Anjali").emailId("Anjali@outlook.com").build();
		EmployeeVo e7 = EmployeeVo.builder().eid("T106").department("Technology").employeeName("Ravi").emailId("Ravi@outlook.com").build();
		EmployeeVo e8 = EmployeeVo.builder().eid("T107").department("Technology").employeeName("Ram").emailId("Ram@outlook.com").build();
		EmployeeVo e9 = EmployeeVo.builder().eid("T108").department("Technology").employeeName("Aditya").emailId("Aditya@outlook.com").build();
		EmployeeVo e10 = EmployeeVo.builder().eid("T109").department("Technology").employeeName("Deepikia").emailId("Deepikia@outlook.com").build();
		EmployeeVo e11 = EmployeeVo.builder().eid("T110").department("Technology").employeeName("Katrina").emailId("Katrina@outlook.com").build();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		employee.add(e7);
		employee.add(e8);
		employee.add(e9);
		employee.add(e10);
		employee.add(e11);
		System.out.println("Employee REPO Build!!!!");
	}

	public void buildConfRoomRepo() {
		AddressVo a1 = AddressVo.builder().floor(1).campus("Main Campus").buiding("A").city("Bangalore").bid("A1").build();
		AddressVo a2 = AddressVo.builder().floor(1).campus("Main Campus").buiding("B").city("Bangalore").bid("B1").build();
		AddressVo a3 = AddressVo.builder().floor(1).campus("Main Campus").buiding("C").city("Bangalore").bid("C1").build();
		AddressVo a4 = AddressVo.builder().floor(2).campus("Main Campus").buiding("A").city("Bangalore").bid("A2").build();
		AddressVo a5 = AddressVo.builder().floor(2).campus("Main Campus").buiding("B").city("Bangalore").bid("B2").build();
		AddressVo a6 = AddressVo.builder().floor(2).campus("Main Campus").buiding("C").city("Bangalore").bid("C2").build();
		AddressVo a7 = AddressVo.builder().floor(3).campus("Main Campus").buiding("A").city("Bangalore").bid("A3").build();
		AddressVo a8 = AddressVo.builder().floor(3).campus("Main Campus").buiding("B").city("Bangalore").bid("B3").build();
		AddressVo a9 = AddressVo.builder().floor(3).campus("Main Campus").buiding("C").city("Bangalore").bid("C3").build();
		MeetingRoomVo cr1 = MeetingRoomVo.builder().id("A101").capacity(100).projecter(false).name("Ninja").bookings(null).size(RoomSize.SMALL).add(a1).build();
		MeetingRoomVo cr2 = MeetingRoomVo.builder().id("A301").capacity(100).projecter(true).name("Samurai").bookings(null).size(RoomSize.MEDIUM).add(a7).build();
		MeetingRoomVo cr3 = MeetingRoomVo.builder().id("B201").capacity(100).projecter(true).name("Shaktiman").bookings(null).size(RoomSize.LARGE).add(a4).build();
		MeetingRoomVo cr4 = MeetingRoomVo.builder().id("A202").capacity(100).projecter(true).name("Thor").bookings(null).size(RoomSize.SMALL).add(a4).build();
		MeetingRoomVo cr5 = MeetingRoomVo.builder().id("A203").capacity(100).projecter(true).name("Superman").bookings(null).size(RoomSize.MEDIUM).add(a4).build();
		MeetingRoomVo cr6 = MeetingRoomVo.builder().id("A102").capacity(100).projecter(false).name("Batman").bookings(null).size(RoomSize.LARGE).add(a1).build();
		MeetingRoomVo cr7 = MeetingRoomVo.builder().id("A302").capacity(100).projecter(false).name("xyz").bookings(null).size(RoomSize.SMALL).add(a7).build();
		MeetingRoomVo cr8 = MeetingRoomVo.builder().id("B101").capacity(100).projecter(false).name("abc").bookings(null).size(RoomSize.MEDIUM).add(a2).build();
		MeetingRoomVo cr9 = MeetingRoomVo.builder().id("B201").capacity(100).projecter(true).name("dummy1").bookings(null).size(RoomSize.LARGE).add(a4).build();
		MeetingRoomVo cr10 = MeetingRoomVo.builder().id("B102").capacity(100).projecter(false).name("dummy9").bookings(null).size(RoomSize.SMALL).add(a2).build();
		MeetingRoomVo cr11 = MeetingRoomVo.builder().id("B202").capacity(100).projecter(true).name("dummy8").bookings(null).size(RoomSize.MEDIUM).add(a4).build();
		MeetingRoomVo cr12 = MeetingRoomVo.builder().id("C301").capacity(100).projecter(true).name("dummy7").bookings(null).size(RoomSize.LARGE).add(a9).build();
		MeetingRoomVo cr13 = MeetingRoomVo.builder().id("C302").capacity(100).projecter(false).name("dummy6").bookings(null).size(RoomSize.SMALL).add(a9).build();
		MeetingRoomVo cr14= MeetingRoomVo.builder().id("C303").capacity(100).projecter(false).name("dummy5").bookings(null).size(RoomSize.MEDIUM).add(a9).build();
		MeetingRoomVo cr15 = MeetingRoomVo.builder().id("C304").capacity(100).projecter(false).name("dummy4").bookings(null).size(RoomSize.LARGE).add(a9).build();
		MeetingRoomVo cr16 = MeetingRoomVo.builder().id("C201").capacity(100).projecter(true).name("dummy3").bookings(null).size(RoomSize.SMALL).add(a4).build();
		MeetingRoomVo cr17= MeetingRoomVo.builder().id("C202").capacity(100).projecter(true).name("dummy2").bookings(null).size(RoomSize.MEDIUM).add(a1).build();
		confRoom.add(cr1);
		confRoom.add(cr2);
		confRoom.add(cr3);
		confRoom.add(cr4);
		confRoom.add(cr5);
		confRoom.add(cr6);
		confRoom.add(cr7);
		confRoom.add(cr8);
		confRoom.add(cr9);
		confRoom.add(cr10);
		confRoom.add(cr11);
		confRoom.add(cr12);
		confRoom.add(cr13);
		confRoom.add(cr14);
		confRoom.add(cr15);
		confRoom.add(cr16);
		confRoom.add(cr17);
		System.out.print("Conference Room Repo Build!!!");
	}
}
