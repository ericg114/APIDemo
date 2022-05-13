public class Movie {

    private String title;
    private int id;
    private String posterPath;
    private boolean video;
    private int vote_count;
    private boolean adult;

    public Movie(String title, int id, String posterPath, boolean video, int vote_count, boolean adult)
    {
        this.title = title;
        this.id = id;
        this.posterPath = posterPath;
        this.vote_count = vote_count;
        this.video = video;
        this.adult = adult;
    }

    public String getTitle()
    {
        return title;
    }

    public int getID()
    {
        return id;
    }

    public String getPosterPath()
    {
        return posterPath;
    }

    public boolean getvideo()
    {
        return video;
    }

    public boolean getadult()
    {
        return adult;
    }

    public int getvote_count()
    {
        return vote_count;
    }


}