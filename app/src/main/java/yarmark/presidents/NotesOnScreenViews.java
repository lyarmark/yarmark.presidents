package yarmark.presidents;

/**
 * Created by student1 on 11/12/2015.
 */
public class NotesOnScreenViews {
    /*
    mobile apps must support multiple screen sizes and resolutions
    resolutions are measured in ppi- pixels per inch

    can't use pixels because varies by device
    so use dip- device independent pixels
    you can define a button to be x pixels high/wide,
    and the button will resize based on the device resolution

    sceen size
    screen density
    resolution
    orientation
    http://developer.android.com/guide/practices/screens_support.html

    you can target the resource to be shown in different options of the above 4

    if you definee sizes as pixels, it will look bigger on lower density devices
    if you define it in dip, it will look the same size on all of them

    we want the presidenPagerItem xml to support landscape also
    make a layout-land folder in the res.
    android will recognize this as landscape and rearrange is

    relative layout can get complicated.
    linear layout has a solution: layout weight
    http://developer.android.com/guide/topics/ui/layout/linear.html

    see equalheights.xml for code
    if you want to make a textview, edittext, textview, edittext
    the textviews are wrap content and the edittexts should take up the rest of the space, in equal sizes

    for edittext:
        android:layout_height="0"
        android:layout_weight="1:"

        it checks which layout weight has a higher value


     modern android apps keep all strings in xml files and styles in style
     then you can change everything with one setting. ex: text size
     see res > values > styles.xml
     */
}
