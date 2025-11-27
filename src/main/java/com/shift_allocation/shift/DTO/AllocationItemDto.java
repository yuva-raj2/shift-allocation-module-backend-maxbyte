package com.shift_allocation.shift.DTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AllocationItemDto {
    private String employeeId;
    private String shiftId;
}
