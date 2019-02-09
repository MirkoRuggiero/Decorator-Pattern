package patterns.creational.factorymethod;

import patterns.creational.factorymethod.domain.DecodedVideo;
import patterns.creational.factorymethod.domain.Video;
import patterns.creational.factorymethod.implementation.MKVReader;
import patterns.creational.factorymethod.implementation.MP4Reader;
import patterns.creational.factorymethod.interfaces.VideoReader;

public class FactoryMethodTest {

    public static void main(String[] args) {
        DecodedVideo decodedVideo;
        VideoReader reader = null;
        Video video = new Video("recita_scolastica.mp4");
        String format = video.getVideo().substring(video.getVideo().indexOf('.') + 1);

        if (format.equals("mp4")) {
            reader = new MP4Reader(video);
        }
        if (format.equals("mkv")) {
            reader = new MKVReader(video);
        }
        System.out.println("Using a " + reader.getClass().getSimpleName());
        decodedVideo = reader.getDecodedVideo();
        System.out.println(decodedVideo);
    }
}
