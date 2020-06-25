import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {
  @GET("/api/countries/{country}")
  public Call<Response1> getData(@Path("country")String country);
}
