package jp.kusutmotolab.jgitTrial;

public class Main {
    private Configuration configuration;

    public Main(final Configuration configuration) {
        this.configuration = configuration;
    }

    public static void main(String[] args) {
        final Configuration configuration = Configuration.Builder.buildFromArgs(args);
        final Main main = new Main(configuration);
        main.run();
    }

    private void run() {

    }
}
