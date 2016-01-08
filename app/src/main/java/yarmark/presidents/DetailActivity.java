package yarmark.presidents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        PresidentDetailFragment fragment = (PresidentDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        Intent intent = getIntent();
        President[] presidents = (President[]) intent.getSerializableExtra("PRESIDENTS");
        int position = intent.getIntExtra("POSITION", 0);
        fragment.showPresidentDetail(presidents, position);
    }


}
