package patterns.creational.factorymethod.implementation;

import patterns.creational.factorymethod.domain.DecodedVideo;
import patterns.creational.factorymethod.domain.Video;
import patterns.creational.factorymethod.interfaces.VideoReader;

public class MP4Reader implements VideoReader {

    private DecodedVideo decodedVideo;

    public MP4Reader(Video video) {
        this.decodedVideo = new DecodedVideo(video.getVideo());
    }

    @Override
    public DecodedVideo getDecodedVideo() {
        return decodedVideo;
    }
}
