
package com.crewsync.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String attendanceServiceUrl = "http://localhost:3000/api/attendance/";

    @GetMapping("/{employeeId}")
    public ResponseEntity<String> getAttendance(@PathVariable String employeeId) {
        String url = attendanceServiceUrl + employeeId;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response;
    }
}
