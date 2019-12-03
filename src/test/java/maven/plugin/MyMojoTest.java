package maven.plugin;

import org.apache.maven.plugin.MojoExecutionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.nio.file.Paths;

@ExtendWith(MockitoExtension.class)
class MyMojoTest {

    private MyMojo mockMyMojo;
    @Mock
    private File sourceDirectory;

    @BeforeEach
    void setUp() {
//        mockMyMojo = new MyMojo(sourceDirectory);
//        D:\BigData\code\my-maven-plugin\src\main\java\maven\plugin
    }

    @Test()
    @Disabled
    void execute() throws MojoExecutionException {
        Mockito.when(sourceDirectory.toPath()).thenReturn(Paths.get("src\\main"));
        mockMyMojo.execute();
        Mockito.verify(sourceDirectory).toPath();
    }
}