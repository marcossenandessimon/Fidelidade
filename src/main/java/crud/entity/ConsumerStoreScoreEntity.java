package crud.entity;

import javax.persistence.*;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "sys_consumer_store_score")
public class ConsumerStoreScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consumerStoreScoreId;

    @OneToOne(targetEntity = ConsumerEntity.class)
    private Long consumerId;

    @OneToOne(targetEntity = StoreEntity.class)
    private Long storeId;

    @Column(name = "score")
    private Integer score;

    public ConsumerStoreScoreEntity() {
    }

    public ConsumerStoreScoreEntity(Long consumerStoreScoreId, Long consumerId, Long storeId, Integer score) {
        this.consumerStoreScoreId = consumerStoreScoreId;
        this.consumerId = consumerId;
        this.storeId = storeId;
        this.score = score;
    }

    public Long getConsumerStoreScoreId() {
        return consumerStoreScoreId;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
