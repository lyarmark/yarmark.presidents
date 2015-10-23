/**
 * Created by student1 on 10/22/2015.
 */
public class Notes {
    /*
    recyclerView is used to scroll through a list ex: contacts
EX: LIST
A
B
C
D
E
F
There are textViews for each of the viewable items on the screen
as you scroll, A will disappear and G will appear. and everything else moves up.
the textViews move up
system recycles the textView from a to a pool,
H picks one up from the pool (g is created already bec. assume will use right away)
it only creates as many as needs to fill the screen plus the one underneath

to make a recycler view, need to add it to the dependencies in the build.gradle

place to put files the app is using

image- layout
something else- create Raw directory in res

to use json in android
go gson github website to link below
http://search.maven.org/#artifactdetails%7Ccom.google.code.gson%7Cgson%7C2.4%7Cjar

and look for gradel in dependecy info
put into build.gradle
compile 'com.google.code.gson:gson:2.4'

recycler views can lay things out in different ways
controls it with LayoutManager

need to connect presidents to recycle view
adapter will connect list to view

convension for naming
president_list_item
list will hole items of president

GIVE SOMETHING FROM A CLASS TAHT HAS TO A CLASS THAT NEED BY PASSING IT THROUGH THE CONSTRUCTOR OR SETTER
     */
}
