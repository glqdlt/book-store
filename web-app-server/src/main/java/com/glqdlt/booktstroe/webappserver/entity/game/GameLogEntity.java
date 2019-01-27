package com.glqdlt.booktstroe.webappserver.entity.game;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class GameLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private RoomWithRound roomWithRounds;

    private String value;

    @Data
    @Embeddable
    public static class RoomWithRound implements Serializable{
        @OneToOne
        private RoomEntity roomId;
        @OneToOne
        private RoundEntity roundId;
    }

}
