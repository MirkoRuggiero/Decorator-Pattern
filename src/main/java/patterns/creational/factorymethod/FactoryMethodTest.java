package patterns.creational.factorymethod;

import patterns.creational.factorymethod.domain.DecodedVideo;
import patterns.creational.factorymethod.domain.Video;
import patterns.creational.factorymethod.factory.VideoReaderFactory;
import patterns.creational.factorymethod.interfaces.VideoReader;

public class FactoryMethodTest {

    public static void main(String[] args) {
        DecodedVideo decodedVideo;
        VideoReader reader;
        Video video = new Video("recita_scolastica.mp4");

        reader = VideoReaderFactory.getVideoReader(video);

        System.out.println("Using a " + reader.getClass().getSimpleName());
        decodedVideo = reader.getDecodedVideo();
        System.out.println(decodedVideo);
    }
}
