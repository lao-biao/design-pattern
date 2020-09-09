package com.chain;

/**
 * @author 周
 * @title LeaveRequest
 * @date 2020/6/12 18:00
 * @description
 */
public class LeaveRequest {
    private String empName;
    private int leaveDay;
    private String reason;

    public LeaveRequest(String empName, int leaveDay, String reason) {
        this.empName = empName;
        this.leaveDay = leaveDay;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
