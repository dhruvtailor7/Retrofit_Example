import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

public class Response1 {

    private Confirmed confirmed;
    private Deaths deaths;
    private String lastUpdate;
    private Recovered recovered;

    public Confirmed getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Confirmed confirmed) {
        this.confirmed = confirmed;
    }

    public Deaths getDeaths() {
        return deaths;
    }

    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Recovered getRecovered() {
        return recovered;
    }

    public void setRecovered(Recovered recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return "Response1{" +
            "confirmed=" + confirmed +
            ", deaths=" + deaths +
            ", lastUpdate='" + lastUpdate + '\'' +
            ", recovered=" + recovered +
            '}';
    }
}
