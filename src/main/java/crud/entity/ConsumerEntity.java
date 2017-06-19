package crud.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "sys_consumer")
public class ConsumerEntity extends UserEntity {

    private String cpf;

    @OneToMany
    @JoinColumn(name = "consumer_id", referencedColumnName = "id")
    private Set<ScoreEntity> score;

    public ConsumerEntity() {
    }

    public ConsumerEntity(Long id, String name, String email, String cpf, Set<ScoreEntity> score) {
        super(id, name, email);
        this.cpf = cpf;
        this.score = score;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<ScoreEntity> getScore() {
        return score;
    }

    public void setScore(Set<ScoreEntity> score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ConsumerEntity that = (ConsumerEntity) o;

        if (cpf != null ? !cpf.equals(that.cpf) : that.cpf != null) return false;
        return score != null ? score.equals(that.score) : that.score == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
