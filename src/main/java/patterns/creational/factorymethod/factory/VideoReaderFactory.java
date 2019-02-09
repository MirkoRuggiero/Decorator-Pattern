package patterns.creational.factorymethod.factory;

import patterns.creational.factorymethod.domain.Video;
import patterns.creational.factorymethod.implementation.MKVReader;
import patterns.creational.factorymethod.implementation.MP4Reader;
import patterns.creational.factorymethod.interfaces.VideoReader;

public class VideoReaderFactory {

    public static VideoReader getVideoReader(Video video){
        String format = video.getVideo().substring(video.getVideo().indexOf('.') + 1);
        VideoReader reader = null;

        if (format.equals("mp4")) {
            reader = new MP4Reader(video);
        }
        if (format.equals("mkv")) {
            reader = new MKVReader(video);
        }
        return reader;
    }
}
