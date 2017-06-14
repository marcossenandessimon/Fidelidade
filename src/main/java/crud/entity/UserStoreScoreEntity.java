package crud.entity;

import javax.persistence.*;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "sys_user_store_score")
public class UserStoreScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userStoreScoreId;

    @OneToOne(targetEntity = UserEntity.class)
    private long userId;

    @OneToOne(targetEntity = StoreEntity.class)
    private long storeId;

    @Column(name = "score")
    private int score;

    public UserStoreScoreEntity() {
    }

    public UserStoreScoreEntity(long userStoreScoreId, long userId, long storeId, int score) {
        this.userStoreScoreId = userStoreScoreId;
        this.userId = userId;
        this.storeId = storeId;
        this.score = score;
    }

    public long getUserStoreScoreId() {
        return userStoreScoreId;
    }

    public long getUserId() {
        return userId;
    }

    public long getStoreId() {
        return storeId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
