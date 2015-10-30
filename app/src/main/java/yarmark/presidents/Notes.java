package yarmark.presidents;

/**
 * Created by student1 on 10/29/2015.
 */
public class Notes {
    /*
    MODEL VIEW CONTROLLER
    View- recycler view
    model- president array
    controller- none because view is not editable
     adapter- adapts the model to the view

     adapter is another design pattern:
     takes the predident and outputs it view that displays the president
     takes an object and adapts it to something else


     RecyclerView (RV) only know how to recylce components
     give it a loyout manager- which knows how to display things on the screen
     also give it an adapter,
     which knows how to take the model object (president) and pass in a view holder to the RV
     view holder holds the view

     recylcler view can work with any adapter- polymorphism
     when you extend recycler view, you must implement the methods
     that's how the recycler view can use the adapter

     HOW TO SWIPE
     ViewPager works with recyclerView
      the list (recyclerView) and expanded view (ViewPager) will be 2 different activities
      default creates 3 pages- before, current, and after
      it is possible to set the number of pages
      by default, view pager does not recycle
     */
}
