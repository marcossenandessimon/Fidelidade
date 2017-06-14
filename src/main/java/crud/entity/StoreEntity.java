package crud.entity;

import javax.persistence.*;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "sys_store")
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long storeId;

    //razão social
    @Column(name = "company_name")
    private String companyName;

    //nome fantasia
    @Column(name = "trading_name")
    private String tradingName;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "address")
    private String address;

    @Column(name = "score_type")
    private int scoreType;

    public StoreEntity() {
    }

    public StoreEntity(long storeId, String companyName, String tradingName, String cnpj, String address, int scoreType) {
        this.storeId = storeId;
        this.companyName = companyName;
        this.tradingName = tradingName;
        this.cnpj = cnpj;
        this.address = address;
        this.scoreType = scoreType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScoreType() {
        return scoreType;
    }

    public void setScoreType(int scoreType) {
        this.scoreType = scoreType;
    }

    public long getStoreId() {
        return storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreEntity that = (StoreEntity) o;

        if (storeId != that.storeId) return false;
        if (scoreType != that.scoreType) return false;
        if (companyName != null ? !companyName.equals(that.companyName) : that.companyName != null) return false;
        if (tradingName != null ? !tradingName.equals(that.tradingName) : that.tradingName != null) return false;
        if (cnpj != null ? !cnpj.equals(that.cnpj) : that.cnpj != null) return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (storeId ^ (storeId >>> 32));
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (tradingName != null ? tradingName.hashCode() : 0);
        result = 31 * result + (cnpj != null ? cnpj.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + scoreType;
        return result;
    }
}
