package yarmark.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by student1 on 10/22/2015.
 */
public class PresidentViewHolder extends RecyclerView.ViewHolder {

    //one row in the list will hold one textview

    @Bind(R.id.name)
    TextView name;
    //private TextView name;

    public PresidentViewHolder(View itemView) {
        super(itemView);
        //tell the class that holds the view that its connected to the president adapter
        //the adapter connects to the president class

        //name = (TextView) itemView.findViewById(R.id.name);

        //'this' is our target
        ButterKnife.bind(this, itemView);
    }

    //set the date in the text view
    public void bind(President president) {
        name.setText(president.getPresident()); //get the name
    }
}
