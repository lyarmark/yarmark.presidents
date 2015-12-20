/**
 * Created by student1 on 12/10/2015.
 */
public class Notes3 {
    /*
    when the ipad came out, everyone realized that you need to create apps that look like they were made for tablets.
    not just phones

    honeycomb came out after this
    google's solutions to this was not good
    Fragments:
    http://developer.android.com/guide/components/fragments.html
    if you want to show the pres list and when you click one, show the info next to the list,
     use fragments. like gmail works on the tablet

     app behaves differently based on orientation
     layout changes

     presidentView and detail view in portrait will be 2 different activities and 2 different fragments
     president with details view will be 1 activityh with 2 fragments

     a fragment is very similar to an activity

    extent Fragment
     code override onCreateView() and onViewCreated()

     return a view from the oncreateview()

     copy the logic from the mainActivity.onCreate() into the onViewCreated()
     need to add an instance variable recycler view
     delete everything from MainActivity BUT
         @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

     findViewById is an appCompatActivity. since we don't extend appCompatActivity,
     call view.findViewByID(). using the view from the parameter


     LinearLayoutManager layoutManager = new LinearLayoutManager(this);
     appCompatActivity is a context. a view is not a context.
     a context tells you where you are. a view is inside of a context.
     an activity is a context. a fragment sits in a context
     call this.getActivity() to get the activity asscociated with the fragment

     make sure the import statement in fragment classes say:
     import android.support.v4.app.Fragment;

     copied activity_main and renamed to fragment_president_list
     activity_main will hold a fragment of the above

     fragments in xml need ids
     android:id="@+id/listFragment"

     do the same thing to create a presidentDetailFragment

     in PresidentDetailFragment, there is no need for an intent. we are only dealing with one activity.
     here were need to send info to a fragment of an activity

     in PresidentDetailFragment, make a new method shoPresidentDetail(President[] presidents, int position) {}

     till here, we just moved around the logic
     oncreate -> fragment
     onViewCreated -> show president detail
     created the fragments

     now, we want to call showPresident detail.

     put the call in MainActivity.onCreate()
     */
}
