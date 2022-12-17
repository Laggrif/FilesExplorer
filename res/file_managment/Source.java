package file_managment;

import java.io.File;

public interface Source<E> {
    default E[] listDir() { return null; }

    default E[] listFile() { return null; }

    default boolean isFile() { return false; }

    default boolean isDir() { return false; }

    default E getParent() { return null; }

    default String getName() { return null; }

    default String getExtension() { return null; }
}
