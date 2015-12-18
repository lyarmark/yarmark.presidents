package yarmark.presidents;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnPresidentSelectedListener {

    //THE WRONG WAY
    //public static President[] presidents;
    PresidentListFragment listFragment;
    PresidentDetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();

        listFragment = (PresidentListFragment) manager.findFragmentById(R.id.listFragment);
        detailFragment = (PresidentDetailFragment) manager.findFragmentById(R.id.detailFragment);
    }


    @Override
    public void onSelect(President[] presidents, int[] presidentPictures, int position) {

        if (detailFragment != null) {
            //landscape
            detailFragment.showPresidentDetail(presidents, position, presidentPictures);
        } else {

            Intent intent = new Intent(this, DetailActivity.class);

            //sent the location in the array to the intent with put extra
            //to access position, need to have it final in the header
            //this is like a hashmap
            intent.putExtra("POSITION", position);

            //send in the array of presidents
            //in a serializable way
            intent.putExtra("PRESIDENTS", presidents);
            intent.putExtra("PRESIDENTPICTURES", presidentPictures);
            this.startActivity(intent);
        }
    }
}

