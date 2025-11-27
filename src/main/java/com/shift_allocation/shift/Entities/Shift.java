package com.shift_allocation.shift.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shift {

    @Id
    private String shiftId;

    private String shiftName;
    private String timings;
}
