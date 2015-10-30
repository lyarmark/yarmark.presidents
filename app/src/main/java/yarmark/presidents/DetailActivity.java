package yarmark.presidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        //needs to know what to display
        //and it needs the view of how to display it
        //need an adapter
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(MainActivity.presidents);
        viewPager.setAdapter(adapter);

        //need to get the list of presidents
        //see main for the wrong way to do it
        //(make the variable static)
        //and call MainActivity.presidents

        /*
        to launch this activity (or go from activity to activity) ALWAYS use an intent
         */

    }
}
