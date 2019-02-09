package patterns.creational.factorymethod.domain;

public class DecodedVideo {

    private String decodedVideo;

    public DecodedVideo(String video) {
        this.decodedVideo = video;
    }

    public String getDecodedVideo() {
        return decodedVideo;
    }

    public void setDecodedVideo(String decodedVideo) {
        this.decodedVideo = decodedVideo;
    }

    @Override
    public String toString() {
        return decodedVideo + " is decoded";
    }
}
