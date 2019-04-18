package jp.kusutmotolab.jgitTrial.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.file.FileRepository;

import java.io.IOException;
import java.nio.file.Path;

public class GitInitializer {
    private final Path localRepositoryPath;

    public GitInitializer(final Path path) {
        this.localRepositoryPath = path;
    }

    public Git initilize() throws IOException {
        final FileRepository fileRepository = new FileRepository(localRepositoryPath.toFile());
        return new Git(fileRepository);
    }
}
