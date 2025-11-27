package com.shift_allocation.shift.Repository;
import com.shift_allocation.shift.Entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, String> {
}
