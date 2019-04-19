package jp.kusutmotolab.jgitTrial;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class Configuration {
    private final String localPath;
    private final String remoteURI;

    private static final String DEFAULT_LOCAL_PATH = ".";
    private static final String DEFAULT_REMOTE_URI = "";

    private Configuration(final Builder builder) {
        this.localPath = builder.localPath;
        this.remoteURI = builder.remoteURI;
    }

    public String getLocalPath() {
        return localPath;
    }

    public String getRemoteURI() {
        return remoteURI;
    }

    public static class Builder {
        private String localPath = ".";
        private String remoteURI = "";

        public static Configuration buildFromArgs(final String[] args) {
            final Builder builder = new Builder();
            final CmdLineParser cmdLineParser = new CmdLineParser(builder);

            try {
                cmdLineParser.parseArgument(args);

            } catch (final CmdLineException e) {
                cmdLineParser.printUsage(System.err);
                throw new IllegalArgumentException(e.getMessage());
            }

            return builder.build();
        }

        public Configuration build() {
            return new Configuration(this);
        }

        @Option(name = "-l",aliases = "--local",usage = "local directory path which you want to track or in which you clone remote repository")
        private void setLocalPath(final String localPath){
            this.localPath = localPath;
        }

        @Option(name = "-r",aliases = "--remote",usage = "remote repository URI")
        private void setRemoteURI(final String remoteURI){
            this.remoteURI = remoteURI;
        }
    }
}
