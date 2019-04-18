package jp.kusutmotolab.jgitTrial;

import jp.kusutmotolab.jgitTrial.git.GitInitializer;
import org.eclipse.jgit.api.Git;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        final Path localRepositoryPath = Paths.get(args[0]);
        if(!Files.exists(localRepositoryPath)){
            Files.createFile(localRepositoryPath);
        }

        final Git git = new GitInitializer(localRepositoryPath).initialize();
    }
}
