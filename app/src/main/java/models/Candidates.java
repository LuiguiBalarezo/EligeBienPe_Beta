package models;

/**
 * Created by BALAREZO on 17/01/2016.
 */
public class Candidates {
    private int img;
    private String name_candidate, political_party;
    private boolean like, dislike;
    private Double pollster_percentage, comunity_percentage;

    public Candidates(int img) {
        this.img = img;
    }

    public Candidates(int img, String name_candidate, String political_party) {
        this.img = img;
        this.name_candidate = name_candidate;
        this.political_party = political_party;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName_candidate() {
        return name_candidate;
    }

    public void setName_candidate(String name_candidate) {
        this.name_candidate = name_candidate;
    }

    public String getPolitical_party() {
        return political_party;
    }

    public void setPolitical_party(String political_party) {
        this.political_party = political_party;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public boolean isDislike() {
        return dislike;
    }

    public void setDislike(boolean dislike) {
        this.dislike = dislike;
    }

    public Double getPollster_percentage() {
        return pollster_percentage;
    }

    public void setPollster_percentage(Double pollster_percentage) {
        this.pollster_percentage = pollster_percentage;
    }

    public Double getComunity_percentage() {
        return comunity_percentage;
    }

    public void setComunity_percentage(Double comunity_percentage) {
        this.comunity_percentage = comunity_percentage;
    }
}
