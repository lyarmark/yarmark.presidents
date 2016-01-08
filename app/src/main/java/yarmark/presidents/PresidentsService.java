package yarmark.presidents;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by student1 on 1/7/2016.
 */

//this interface will download a json of presidents using square's retrofit library
public interface PresidentsService {

    //e/t after the domain from the url goes here
    @GET("/hitch17/sample-data/blob/master/presidents.json")
    Call<List<President>> listPresidents();
}
