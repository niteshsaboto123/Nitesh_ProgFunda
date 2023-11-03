package com.gradedproject.q1;

public class Hr extends SuperDepartment{

	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String doActivity() {
		return "team Lunch";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}