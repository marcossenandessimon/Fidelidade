package crud.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "sys_consumer")
public class ConsumerEntity extends UserEntity {

    private String cpf;

    public ConsumerEntity() {
    }

    public ConsumerEntity(long id, String name, String email, String cpf) {
        super(id, name, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ConsumerEntity that = (ConsumerEntity) o;

        return cpf != null ? cpf.equals(that.cpf) : that.cpf == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        return result;
    }
}
