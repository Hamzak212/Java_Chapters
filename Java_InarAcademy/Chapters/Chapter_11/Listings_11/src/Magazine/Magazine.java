package Magazine;

public class Magazine {
    private String title;
    //-----------------------------------------------------------------
    //  Sets up the new magazine with its title.
    //-----------------------------------------------------------------
    public Magazine(String newTitle)
    {
        this.title = newTitle;
    }
    //-----------------------------------------------------------------
    //  Returns this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return title;
    }
}
