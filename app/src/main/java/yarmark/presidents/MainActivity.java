package yarmark.presidents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    //THE WRONG WAY
    //public static President[] presidents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.list);
        //set up how the recycler view looks
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

//builder appends something until it's done
        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//often call the build method once ur done
        //.create();

        //get the list of presidents
        //Gson gson = new Gson();
        Gson gson = builder.create();

        InputStream in = getResources().openRawResource(R.raw.presidents);

        President[] presidents = gson.fromJson(new InputStreamReader(in), President[].class);

        int[] presidentPictures = new int[]{
                R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
                R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p,
                R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.wa,
                R.drawable.x, R.drawable.y, R.drawable.z, R.drawable.za, R.drawable.zb, R.drawable.zc, R.drawable.zd, R.drawable.ze,
                R.drawable.zf,R.drawable.zg, R.drawable.zh, R.drawable.zi, R.drawable.zj, R.drawable.zk, R.drawable.zl, R.drawable.zm,
                R.drawable.zn, R.drawable.zo, R.drawable.zp, R.drawable.zq};

        PresidentRecyclerViewAdapter adapter = new PresidentRecyclerViewAdapter(presidents, presidentPictures);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
