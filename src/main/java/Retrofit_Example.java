import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.Response;

public class Retrofit_Example {
  public static void main(String[] args) {
    OkHttpClient.Builder client = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://covid19.mathdro.id/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client.build())
        .build();

    Service service = retrofit.create(Service.class);
    Call<Response1> responseCall = service.getData("India");
    try {
      Response<Response1> response = responseCall.execute();
      Response1 apiResponse = response.body();
      System.out.println(apiResponse);
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  }
}
