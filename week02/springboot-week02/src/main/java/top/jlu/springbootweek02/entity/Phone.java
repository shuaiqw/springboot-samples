package top.jlu.springbootweek02.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: jlu
 * @date: 2023/10/10 15:20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
        private String band;
        private Double price;
        private String color;
}
