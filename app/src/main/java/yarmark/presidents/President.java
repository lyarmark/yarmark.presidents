package yarmark.presidents;

import com.google.gson.annotations.SerializedName;

/**
 * Created by student1 on 10/22/2015.
 */
public class President {
    //variables in java should always be in camelCase
    //but the JSON file has under_scores

    //also, some of the values are null, and ints can't be null
    // ex: death year

    //answer:
    //1. serialize
    //2. see main activity- Gson Builder

    private int number;
    private String president;
    private int birth_year;
    private int death_year;

    //DON'T DO THIS
    //tells JSON to look for look_office and put it into tookOffice
    //@SerializedName("took_office")
    private String took_office;
    private String left_office;
    private String party;


    public String getPresident() {
        return president;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public int getDeath_year() {
        return death_year;
    }

    public String getLeft_office() {
        return left_office;
    }

    public int getNumber() {
        return number;
    }

    public String getParty() {
        return party;
    }

    public String getTook_office() {
        return took_office;
    }

}
