package yarmark.presidents;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.List;


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

    private President[] presidents;

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

        //use a view holder because this establishes the view
        //then you just need to setText and stuff
        //THATS WHY YOU USE VIEW.FINDVIEWBYID TO CREATE THE TEXTVIEWS!!!

        //need to call findViewById will not work without view.
        int[] presidentPictures = new int[]{
                R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
                R.drawable.i, R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p,
                R.drawable.q, R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.wa,
                R.drawable.x, R.drawable.y, R.drawable.z, R.drawable.za, R.drawable.zb, R.drawable.zc, R.drawable.zd, R.drawable.ze,
                R.drawable.zf, R.drawable.zg, R.drawable.zh, R.drawable.zi, R.drawable.zj, R.drawable.zk, R.drawable.zl, R.drawable.zm,
                R.drawable.zn, R.drawable.zo, R.drawable.zp, R.drawable.zq};



        ImageView picture = (ImageView) view.findViewById(R.id.image);
        picture.setImageResource(presidentPictures[position]);

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText("Name:\t" + president.getPresident());

        TextView number = (TextView) view.findViewById(R.id.number);
        number.setText("Number:\t" + String.valueOf(president.getNumber()));

        TextView lived = (TextView) view.findViewById(R.id.birthDeath);
        lived.setText("Lived:\t" + String.valueOf(president.getBirth_year() + " - "));
        if (president.getDeath_year() != 0) {
            lived.append(String.valueOf(president.getDeath_year()));
        } else {
            lived.append("present");
        }

        TextView served = (TextView) view.findViewById(R.id.tookLeft);
        served.setText("Served:\t" + president.getTook_office() + " - ");

        if (president.getLeft_office() != null) {
            served.append(president.getLeft_office());
        } else {
            served.append("present");
        }

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
