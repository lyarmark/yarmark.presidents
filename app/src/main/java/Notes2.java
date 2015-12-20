/**
 * Created by student1 on 10/29/2015.
 */
public class Notes2 {
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
     give it a layout manager- which knows how to display things on the screen
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

      read through class for how to make the on click go to the right president
      //basically pass it into the intent and get it in the detailActivity

      android stores a backstack
      keeping track of the activities you were in and what the back button should go back to.

      problem of static variables:
      when android deletes your activities to save memory,
      if you try to reopen the detail, it will only know what president you were up to
      because it only save the intent (current viewPager, back to recycler)
      so when you hit back, it doesn't have the static variable of presidents
      CRASH!

      therefore, need to pass the array through the intent

      //show pic of each pres from
      http://americanpresidents.org/
      pic: width match parent
      name: L    number: R
      Birthyear - deathYear L = one textView  / took - left: R = one textview
      party: C

      relative layout allows you to layout views relative to parent or other views
      change layout of president_pager_item to relative

      if using this with design tool
      do: tools:text="NAME" to textView in XML
      and you will see it in the android studio preview

      to set the
      android:layout_alignParentRight="true""

     */
}
