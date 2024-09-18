package module;

public class Genre {
    public String genrename;
    public String description;

    public Genre(String genrename, String description) {
        this.genrename = genrename;
        this.description = description;
    }

    public String getGenrename() {
        return genrename;
    }

    public void setGenrename(String genrename) {
        this.genrename = genrename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
