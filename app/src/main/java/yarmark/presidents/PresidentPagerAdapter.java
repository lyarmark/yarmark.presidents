package yarmark.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by student1 on 10/29/2015.
 */
public class PresidentPagerAdapter extends PagerAdapter {

    President[] presidents;

    public PresidentPagerAdapter(President[] presidents) {
        this.presidents = presidents;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    //this creates a page
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //need an xml to design the view of each page
        LayoutInflater inflater = LayoutInflater.from(container.getContext());

        President president = presidents[position];
        //position parameter is the position in the array
        View view = inflater.inflate(R.layout.president_pager_item, null);

        //need to call findViewById will not work without view.
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(president.getPresident());
        TextView number = (TextView) view.findViewById(R.id.number);
        number.setText(String.valueOf(president.getNumber()));
        TextView birth_year = (TextView) view.findViewById (R.id.birth);
        TextView death_year = (TextView) view.findViewById(R.id.death);
        TextView took_office = (TextView) view.findViewById(R.id.took);
        TextView left_office = (TextView) view.findViewById(R.id.left);
        TextView party = (TextView) view.findViewById(R.id.party);

        container.addView(view);
        return view;
    }

    //the total number of presidents we will display
    @Override
    public int getCount() {
        return presidents.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        //don't understand why we do this
        return view == object;
    }
}
