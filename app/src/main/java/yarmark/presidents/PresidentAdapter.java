package yarmark.presidents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by student1 on 10/22/2015.
 */
public class PresidentAdapter extends RecyclerView.Adapter<PresidentViewHolder> {
    private President[] presidents;

    public PresidentAdapter(President[] presidents) {
        this.presidents = presidents;

    }

//recyclerView is an interface that requires the following methods

    //for the beginning of the list
    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //layout inflator takes the xml and creates java classes out of it (like gson reads gson)
        //tell it to inflate with the xml you made
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.president_list_item, parent, (false));
        return new PresidentViewHolder(itemView);
    }

    //after you scroll, already have the view
    //just need to bind the next instance to an available view
    @Override
    public void onBindViewHolder(final PresidentViewHolder holder, int position) {
        holder.bind(presidents[position]);

        //when i click on one of the items in my list view
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //make an intent to switch activities on click

                Context context = holder.itemView.getContext();
                //intents need a context and the name of the activity
                Intent intent = new Intent(context, DetailActivity.class);

                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.length;
    }
}
