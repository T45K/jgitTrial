package jp.kusutmotolab.jgitTrial.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

import java.io.File;

public class GitInitializer {
    private final File directory;
    private final String remoteRepositoryURI;

    public GitInitializer(final String directory, final String remoteRepositoryURI) {
        this.directory = new File(directory);
        this.remoteRepositoryURI = remoteRepositoryURI;
    }

    public Git initialize() throws GitAPIException {
        return Git.cloneRepository()
                .setURI(remoteRepositoryURI)
                .setDirectory(directory)
                .call();
    }
}
