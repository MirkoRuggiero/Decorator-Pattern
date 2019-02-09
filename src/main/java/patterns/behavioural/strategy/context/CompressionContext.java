package patterns.behavioural.strategy.context;

import patterns.behavioural.strategy.strategy.CompressionStrategy;

import java.io.File;
import java.util.List;

public class CompressionContext {

    CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(List<File> files){
        compressionStrategy.compressFiles(files);
    }
}
