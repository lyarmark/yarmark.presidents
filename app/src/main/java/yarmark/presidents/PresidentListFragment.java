package yarmark.presidents;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by student1 on 12/10/2015.
 */
public class PresidentListFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return a view that needs to be inflated first
        //give it a resource- activity main
        return inflater.inflate(R.layout.fragment_president_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) view.findViewById(R.id.list);
        //set up how the recycler view looks
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

//builder appends something until it's done
        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//often call the build method once ur done
        //.create();

        //get the list of presidents
        //Gson gson = new Gson();
        Gson gson = builder.create();

        InputStream in = getResources().openRawResource(R.raw.presidents);

        President[] presidents = gson.fromJson(new InputStreamReader(in), President[].class);

        OnPresidentSelectedListener listener = (OnPresidentSelectedListener) getActivity();

        PresidentRecyclerViewAdapter adapter = new PresidentRecyclerViewAdapter(presidents, listener);
        recyclerView.setAdapter(adapter);
    }
}
