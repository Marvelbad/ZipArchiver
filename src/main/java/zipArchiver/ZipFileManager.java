package zipArchiver;

import java.nio.file.Path;

//храним полный путь к архиву
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {

    }
}
