package com.glqdlt.booktstroe.webappserver.entity.game;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class MoneyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moneySeq;

    @Embedded
    private LogWithRoomAndRound logWithRoomAndRound;

    private String anotherValue;

    @Data
    @Embeddable
    public static class LogWithRoomAndRound implements Serializable {
        @ManyToOne(targetEntity = GameLogEntity.class)
        private List<GameLogEntity> gameLogEntity;
        @ManyToOne(targetEntity = RoomEntity.class)
        private List<RoomEntity> roomId;
        @ManyToOne(targetEntity = RoundEntity.class)
        private List<RoundEntity> roundId;
    }

}
