package jp.kusutmotolab.jgitTrial.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;

import java.io.File;
import java.io.IOException;

public class GitSetUpper {
    private final File directory;
    private final String remoteRepositoryURI;

    public GitSetUpper(final String directory, final String remoteRepositoryURI) {
        this.directory = new File(directory);
        this.remoteRepositoryURI = remoteRepositoryURI;
    }

    public Git setUp() throws GitAPIException, IOException {
        if(remoteRepositoryURI.isEmpty()){
            final FileRepository fileRepository = new FileRepository(directory + File.separator + ".git");
            return new Git(fileRepository);
        }

        return Git.cloneRepository()
                .setURI(remoteRepositoryURI)
                .setDirectory(directory)
                .call();
    }
}
