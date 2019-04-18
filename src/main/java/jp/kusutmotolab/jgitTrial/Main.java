package jp.kusutmotolab.jgitTrial;

import jp.kusutmotolab.jgitTrial.git.GitInitializer;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;

public class Main {

    /*
    git clone するところから始まる
    args[0] clone したリポジトリを格納するディレクトリ(Path)
    args[1] clone 先(URI)
     */
    public static void main(String[] args) throws GitAPIException {
        final Git git = new GitInitializer(args[0], args[1]).initialize();
    }
}
