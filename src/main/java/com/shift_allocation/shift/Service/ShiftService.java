package com.shift_allocation.shift.Service;
import com.shift_allocation.shift.DTO.ShiftAllocationRequestDto;
import com.shift_allocation.shift.Entities.ShiftAllocation;
import com.shift_allocation.shift.Repository.ShiftAllocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShiftService {

    private final ShiftAllocationRepository repo;

    public int saveAllocations(ShiftAllocationRequestDto request) {
        repo.saveAll(
                request.getAllocations().stream().map(a ->
                        new ShiftAllocation(null, a.getEmployeeId(), a.getShiftId(), request.getDate())
                ).toList()
        );
        return request.getAllocations().size();
    }
}
