import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Confirmed {

    @Expose
    private String detail;
    @Expose
    private Long value;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Confirmed{" +
            "detail='" + detail + '\'' +
            ", value=" + value +
            '}';
    }
}
