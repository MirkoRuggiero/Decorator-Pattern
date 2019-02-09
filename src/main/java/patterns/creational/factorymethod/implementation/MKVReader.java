package patterns.creational.factorymethod.implementation;

import patterns.creational.factorymethod.domain.DecodedVideo;
import patterns.creational.factorymethod.domain.Video;
import patterns.creational.factorymethod.interfaces.VideoReader;

public class MKVReader implements VideoReader {

    private DecodedVideo decodedVideo;

    public MKVReader(Video video) {
        this.decodedVideo = new DecodedVideo(video.getVideo());
    }

    @Override
    public DecodedVideo getDecodedVideo() {
        return decodedVideo;
    }
}
