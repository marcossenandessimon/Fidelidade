package crud.request;

/**
 * Created by msimon on 19/06/17.
 */
public class ScoreRequest {

    private Long storeId;
    private Long consumerId;
    private Integer score;

    public ScoreRequest() {
    }

    public ScoreRequest(Long storeId, Long consumerId, Integer score) {
        this.storeId = storeId;
        this.consumerId = consumerId;
        this.score = score;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
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

        ScoreRequest that = (ScoreRequest) o;

        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (consumerId != null ? !consumerId.equals(that.consumerId) : that.consumerId != null) return false;
        return score != null ? score.equals(that.score) : that.score == null;
    }

    @Override
    public int hashCode() {
        int result = storeId != null ? storeId.hashCode() : 0;
        result = 31 * result + (consumerId != null ? consumerId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        return result;
    }
}
