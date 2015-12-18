package yarmark.presidents;

/**
 * Created by student1 on 12/17/2015.
 */
public class Notes3 {

    //copy activity_main xml into the layout-land folder
    /*
    on landscape, we will display a different xml, that has 2 fragments

    make sure it has linear layout so you can use layout weight
    need to tell it that when you click, the fragment should come up

    use a fragment manager to check how many fragments we're currently displaying
    make an instance of each fragment as a member variable of mai activiy
    you will know which view you're in based on which fragments are displayed
    pass in onclick to recyclerview adapter

    single responsibility:
    every activity should only do one thing
    since the recycler view is also doing the on click, that's too much

    //make an onselect interface
    mainactivity implements it, and in the onselect method, it open the detail activity

    pass the an instance of the interface to the recycler view adapter
    in onbindviewholder, do
    holder.itemView.setOnClickListener(new View.OnClickListener() {

     */
}
