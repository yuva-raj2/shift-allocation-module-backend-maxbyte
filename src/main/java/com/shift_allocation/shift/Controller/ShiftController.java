package com.shift_allocation.shift.Controller;
import com.shift_allocation.shift.DTO.ShiftAllocationRequestDto;
import com.shift_allocation.shift.Entities.Employee;
import com.shift_allocation.shift.Entities.Shift;
import com.shift_allocation.shift.Repository.EmployeeRepository;
import com.shift_allocation.shift.Repository.ShiftAllocationRepository;
import com.shift_allocation.shift.Service.ShiftService;
import  com.shift_allocation.shift.Repository.ShiftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ShiftController {

    private final EmployeeRepository employeeRepo;
    private final ShiftRepository shiftRepo;
    private final ShiftService shiftService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @GetMapping("/shifts")
    public List<Shift> getShifts() {
        return shiftRepo.findAll();
    }

    @PostMapping("/allocate")
    public String allocate(@RequestBody ShiftAllocationRequestDto req) {
        int count = shiftService.saveAllocations(req);
        return "Successfully allocated " + count + " shifts.";
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }

}
