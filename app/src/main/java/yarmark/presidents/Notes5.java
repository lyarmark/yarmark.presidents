package yarmark.presidents;

/**
 * Created by student1 on 1/7/2016.
 */
public class Notes5 {
    /*
    instead of using R.id.fieldName
    everytime you want to connect to the id in the view, use
    ButterKnife.
    don't download the jar.
    instead put the dependency in the gradle
    compile 'com.jakewharton:butterknife:7.0.1'
    in build.gradle

    also need to tell butterknife system
    that you want to Bind this class and that View

    only need to Bind once for each class that you are binding to
    and add an @Bind fieldName

    you can also do this for activity and fragments, but read docs for fragments

    and you don't need to set the textview. it auto binds

     */
}
