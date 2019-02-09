package patterns.behavioural.strategy.strategyimpl;

import patterns.behavioural.strategy.strategy.CompressionStrategy;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        System.out.println("Compressing as RAR");
    }
}
