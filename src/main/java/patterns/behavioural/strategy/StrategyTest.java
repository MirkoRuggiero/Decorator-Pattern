package patterns.behavioural.strategy;

import patterns.behavioural.strategy.context.CompressionContext;
import patterns.behavioural.strategy.strategyimpl.TarCompressionStrategy;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class StrategyTest {
    public static void main(String[] args) {

        CompressionContext compressionContext = new CompressionContext(new TarCompressionStrategy());
        List<File> fileList = Arrays.asList(new File("c:\\user\\file"));

        compressionContext.createArchive(fileList);
    }
}