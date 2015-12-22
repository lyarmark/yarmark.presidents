package yarmark.presidents;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by student1 on 12/10/2015.
 */
public class PresidentDetailFragment extends Fragment {
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_president_detail, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //to get the position on click
        //this is like a hashmap. position is key, 0 is default

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);

        //read in presidents with serializable
        //but serializable is too slow (WE ARE OBBSESSED WITH SPEED)

        //needs to know what to display
        //and it needs the view of how to display it
        //need an adapter

        //need to get the list of presidents
        //see main for the wrong way to do it
        //(make the variable static)
        //and call MainActivity.presidents

        /*
        to launch this activity (or go from activity to activity) ALWAYS use an intent
         */
    }

    public void showPresidentDetail(President[] presidents, int position) {
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(presidents);
        this.viewPager.setAdapter(adapter);
        this.viewPager.setCurrentItem(position);

    }
}
