package kr.co.fastcampus.eatgo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    private Long Id;

    private Long userId;

    private Long restaurantId;

    @Setter
    private String name;
    @Setter
    @NotEmpty
    private String date;
    @Setter
    @NotEmpty
    private String time;
    @Setter
    @NotNull
    private Integer partySize;
}
