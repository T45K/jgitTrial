package jp.kusutmotolab.jgitTrial.git;

import org.eclipse.jgit.api.Git;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

public class GitInitializerTest {

    @Test
    public void testInitializer() throws IOException {
        final GitInitializer gitInitializer = new GitInitializer(Paths.get("sample"));
        assertThat(gitInitializer.initialize()).isNotNull().isInstanceOf(Git.class);
    }

}
