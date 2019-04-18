package jp.kusutmotolab.jgitTrial.git;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.file.FileRepository;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GitInitializer {
    private final Path localRepositoryPath;

    public GitInitializer(final Paths path) {
        this.localRepositoryPath = Paths.get(path.toString(),".git");
    }

    public Git initilize() throws IOException {
        final FileRepository fileRepository = new FileRepository(localRepositoryPath.toFile());
        return new Git(fileRepository);
    }
}
