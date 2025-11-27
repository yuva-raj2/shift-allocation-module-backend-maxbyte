package com.shift_allocation.shift.DTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShiftAllocationRequestDto {
    private LocalDate date;
    private List<AllocationItemDto> allocations;
}
