package top.jlu.springbootweek02.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author: jlu
 * @date: 2023/10/10 15:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    public enum Gender {
        MALE, FEMALE
    }
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate birthday;
    private Phone phone;
}
