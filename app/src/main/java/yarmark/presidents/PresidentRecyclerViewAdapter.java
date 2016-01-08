package yarmark.presidents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by student1 on 10/22/2015.
 */

//adapts array of presidents to view of presidents
//as needed, pulls a president from the array and sends it to the view


//view holder- hold the views related to the data in each view of the recyler view
//need to bind the view holder to a view

//recycler view has :
//recycler view
//adapter
//view holder

public class PresidentRecyclerViewAdapter extends RecyclerView.Adapter<PresidentViewHolder> {
    private OnPresidentSelectedListener listener;
    private President[] presidents;

    public PresidentRecyclerViewAdapter(President[] presidents, OnPresidentSelectedListener listener) {
        this.presidents = presidents;
        this.listener = listener;

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
    public void onBindViewHolder(final PresidentViewHolder holder, final int position) {
        holder.bind(presidents[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onSelect(presidents, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.length;
    }
}
