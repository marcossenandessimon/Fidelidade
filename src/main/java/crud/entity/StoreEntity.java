package crud.entity;

import javax.persistence.*;

/**
 * Created by marqu on 13/06/2017.
 */
@Entity
@Table(name = "SYS_STORE")
public class StoreEntity extends UserEntity {

    /*
    nome fantasia da empresa
     */
    @Column(name = "TRADING_NAME")
    private String tradingName;

    /*
    cnpj da empresa
     */
    @Column(name = "CNPJ")
    private String cnpj;

    /*
    endereço da empresa
     */
    @Column(name = "ADDRESS")
    private String address;

    /*
    tipo de pontuação da empresa
    1- por unidade
    2- por valor
     */
    @Column(name = "SCORE_TYPE")
    private Integer scoreType;

    /*
    valor necessário para gerar um ponto no caso de pontuação por valor
     */
    @Column(name = "POINT_VALUE")
    private Double pointValue;

    /*
    quantidade de pontos necessários para realizar um resgate
     */
    @Column(name = "NUMBER_OF_POINTS_TO_TRADE")
    private Integer numberOfPointsToTrade;


    /*
    tipo de resgate
    1- troca por unidade
    2- troca por valor de desconto
     */
    @Column(name = "TRADE_TYPE")
    private Integer tradeType;

    /*
    valor de desconto no resgate no caso de resgate de valor
     */
    @Column(name = "TRADE_VALUE")
    private Integer tradeValue;

    public StoreEntity() {
    }

    public StoreEntity(Long id, String name, String email, String tradingName, String cnpj, String address, Integer scoreType, Double pointValue, Integer numberOfPointsToTrade, Integer tradeType, Integer tradeValue) {
        super(id, name, email);
        this.tradingName = tradingName;
        this.cnpj = cnpj;
        this.address = address;
        this.scoreType = scoreType;
        this.pointValue = pointValue;
        this.numberOfPointsToTrade = numberOfPointsToTrade;
        this.tradeType = tradeType;
        this.tradeValue = tradeValue;
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

    public Integer getScoreType() {
        return scoreType;
    }

    public void setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
    }

    public Double getPointValue() {
        return pointValue;
    }

    public void setPointValue(Double pointValue) {
        this.pointValue = pointValue;
    }

    public Integer getNumberOfPointsToTrade() {
        return numberOfPointsToTrade;
    }

    public void setNumberOfPointsToTrade(Integer numberOfPointsToTrade) {
        this.numberOfPointsToTrade = numberOfPointsToTrade;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getTradeValue() {
        return tradeValue;
    }

    public void setTradeValue(Integer tradeValue) {
        this.tradeValue = tradeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        StoreEntity that = (StoreEntity) o;

        if (tradingName != null ? !tradingName.equals(that.tradingName) : that.tradingName != null) return false;
        if (cnpj != null ? !cnpj.equals(that.cnpj) : that.cnpj != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (scoreType != null ? !scoreType.equals(that.scoreType) : that.scoreType != null) return false;
        if (pointValue != null ? !pointValue.equals(that.pointValue) : that.pointValue != null) return false;
        if (numberOfPointsToTrade != null ? !numberOfPointsToTrade.equals(that.numberOfPointsToTrade) : that.numberOfPointsToTrade != null)
            return false;
        if (tradeType != null ? !tradeType.equals(that.tradeType) : that.tradeType != null) return false;
        return tradeValue != null ? tradeValue.equals(that.tradeValue) : that.tradeValue == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (tradingName != null ? tradingName.hashCode() : 0);
        result = 31 * result + (cnpj != null ? cnpj.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (scoreType != null ? scoreType.hashCode() : 0);
        result = 31 * result + (pointValue != null ? pointValue.hashCode() : 0);
        result = 31 * result + (numberOfPointsToTrade != null ? numberOfPointsToTrade.hashCode() : 0);
        result = 31 * result + (tradeType != null ? tradeType.hashCode() : 0);
        result = 31 * result + (tradeValue != null ? tradeValue.hashCode() : 0);
        return result;
    }
}
