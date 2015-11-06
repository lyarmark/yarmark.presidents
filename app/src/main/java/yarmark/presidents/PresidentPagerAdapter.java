package yarmark.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by student1 on 10/29/2015.
 */

/*
* pagerAdapter needs a view holder also
* not a separate class, but part of the xml
* need to create a new layout and inflate it with a view of president pager item
* detailActivity creates a view with the presidentAdapter
* */


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

        //use a view holdeer becuase this establishes the view
        //then you just need to setText and stuff
        //THATS WHY YOU USE VIEW.FINDVIEWBYID TO CREATE THE TEXTVIEWS!!!

        //need to call findViewById will not work without view.
        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText("Name:\t" + president.getPresident());
        TextView number = (TextView) view.findViewById(R.id.number);
        number.setText("Number:\t" + String.valueOf(president.getNumber()));
        TextView birth = (TextView) view.findViewById (R.id.birth);
        birth.setText ("Birth Year:\t" + String.valueOf(president.getBirth_year()));
        TextView death = (TextView) view.findViewById(R.id.death);
        death.setText("Death Year:\t" + String.valueOf(president.getDeath_year()));
        TextView took = (TextView) view.findViewById(R.id.took);
        took.setText("Took Office:\t" + president.getTook_office());
        TextView left = (TextView) view.findViewById(R.id.left);
        left.setText("Left Office:\t" + president.getLeft_office());
        TextView party = (TextView) view.findViewById(R.id.party);
        party.setText("Party:\t" + president.getParty());

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
