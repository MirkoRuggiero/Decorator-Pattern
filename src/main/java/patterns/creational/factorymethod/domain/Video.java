package patterns.creational.factorymethod.domain;

public class Video {

    private String video;

    public Video(String video) {
        this.video = video;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return video + " is not decoded";
    }
}
