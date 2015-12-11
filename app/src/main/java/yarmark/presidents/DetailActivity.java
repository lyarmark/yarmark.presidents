package yarmark.presidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        PresidentDetailFragment fragment = (PresidentDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);

        President[] presidents = (President[]) getIntent().getSerializableExtra("PRESIDENTS");
        int position = getIntent().getIntExtra("POSITION", 0);
        int[] presidentPictures = getIntent().getIntArrayExtra("PRESIDENTPICTURES");
        fragment.showPresidentDetail(presidents, 0, presidentPictures);
    }


}
