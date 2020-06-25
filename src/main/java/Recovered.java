import javax.annotation.Generated;
import com.google.gson.annotations.Expose;


public class Recovered {

    private String detail;
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
        return "Recovered{" +
            "detail='" + detail + '\'' +
            ", value=" + value +
            '}';
    }
}
