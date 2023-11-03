package com.gradedproject.q1;

public class Main extends SuperDepartment {

	public static void main(String[] args) {

		SuperDepartment superdept = new SuperDepartment();

		// Printing the returning string
		Admin admdept = new Admin();
		System.out.println(admdept.departmentName());
		System.out.println(admdept.getTodaysWork());
		System.out.println(admdept.getWorkDeadline());
		System.out.println(admdept.isTodayAHoliday());

		System.out.println();

		Hr hrdept = new Hr();
		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		System.out.println();

		Tech techdept = new Tech();
		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());

	}

}
