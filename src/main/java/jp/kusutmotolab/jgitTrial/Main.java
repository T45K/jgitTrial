package jp.kusutmotolab.jgitTrial;

import jp.kusutmotolab.jgitTrial.git.GitInitializer;
import org.eclipse.jgit.api.Git;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final Git git = new GitInitializer(args[0]).initilize();
    }
}
