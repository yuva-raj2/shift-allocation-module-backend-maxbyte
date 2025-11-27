package com.shift_allocation.shift.Repository;
import com.shift_allocation.shift.Entities.ShiftAllocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftAllocationRepository extends JpaRepository<ShiftAllocation, Long> {
}
