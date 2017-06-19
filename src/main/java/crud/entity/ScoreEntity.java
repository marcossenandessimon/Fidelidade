package crud.entity;

import javax.persistence.*;

/**
 * Created by msimon on 19/06/17.
 */
@Entity
@Table(name = "sys_score")
public class ScoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private StoreEntity store;

    private Integer score;

    public ScoreEntity() {

    }

    public ScoreEntity(Long id, StoreEntity store, Integer score) {
        this.id = id;
        this.store = store;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public StoreEntity getStore() {
        return store;
    }

    public void setStore(StoreEntity store) {
        this.store = store;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoreEntity that = (ScoreEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (store != null ? !store.equals(that.store) : that.store != null) return false;
        return score != null ? score.equals(that.score) : that.score == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (store != null ? store.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
