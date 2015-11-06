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

        //to get the position on click
        //this is like a hashmap. position is key, 0 is default

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //read in presidents with serializable
        //but serializable is too slow (WE ARE OBBSESSED WITH SPEED)
        President[] presidents = (President[]) getIntent().getSerializableExtra("PRESIDENTS");


        //needs to know what to display
        //and it needs the view of how to display it
        //need an adapter
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(presidents);
        viewPager.setAdapter(adapter);

        // int position = getIntent().getIntExtra("POSITION", 0);
        //viewPager.setCurrentItem(position);

        //need to get the list of presidents
        //see main for the wrong way to do it
        //(make the variable static)
        //and call MainActivity.presidents

        /*
        to launch this activity (or go from activity to activity) ALWAYS use an intent
         */

    }
}
