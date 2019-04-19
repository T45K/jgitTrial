package jp.kusutmotolab.jgitTrial;

import jp.kusutmotolab.jgitTrial.git.GitSetUpper;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.IOException;

public class Main {
    private Configuration configuration;

    private Main(final Configuration configuration) {
        this.configuration = configuration;
    }

    public static void main(String[] args) throws GitAPIException, IOException {
        final Configuration configuration = Configuration.Builder.buildFromArgs(args);
        final Main main = new Main(configuration);
        main.run();
    }

    private void run() throws GitAPIException, IOException {
        final GitSetUpper gitSetUpper = new GitSetUpper(configuration.getLocalPath(), configuration.getRemoteURI());
        final Git git = gitSetUpper.setUp();
    }
}
