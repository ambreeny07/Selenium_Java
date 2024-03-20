package com.ultimateqa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils {

	// List to store file names
    private List<String> fileList;

    // Output zip file path
    public static final String OUTPUT_ZIP_FILE = System.getProperty("user.dir") + "/Web Automation Test Report.zip";

    // Source folder path
    private static final String SOURCE_FOLDER = System.getProperty("user.dir") + "/reports";

    /**
     * Constructor to initialize the file list.
     */
    public ZipUtils() {
        fileList = new ArrayList<>();
    }

    /**
     * Generates the zip file.
     */
    public static void generateZipFile() {
        ZipUtils appZip = new ZipUtils();
        appZip.generateFileList(new File(SOURCE_FOLDER));
        appZip.zipIt(OUTPUT_ZIP_FILE);
    }

    /**
     * Zips the files in the source folder and creates the zip file.
     *
     * @param zipFile The output zip file path.
     */
    public void zipIt(String zipFile) {
        byte[] buffer = new byte[1024];
        String source = new File(SOURCE_FOLDER).getName();
        FileOutputStream fos = null;
        ZipOutputStream zos = null;
        try {
            fos = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(fos);
            FileInputStream in = null;

            for (String file : this.fileList) {
                ZipEntry ze = new ZipEntry(source + File.separator + file);
                zos.putNextEntry(ze);
                try {
                    in = new FileInputStream(SOURCE_FOLDER + File.separator + file);
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        zos.write(buffer, 0, len);
                    }
                } finally {
                    in.close();
                }
            }

            zos.closeEntry();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                zos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Generates the list of files to be included in the zip file.
     *
     * @param node The current file or directory.
     */
    public void generateFileList(File node) {
        // Add file only
        if (node.isFile()) {
            fileList.add(generateZipEntry(node.toString()));
        }

        if (node.isDirectory()) {
            String[] subNote = node.list();
            for (String filename : subNote) {
                generateFileList(new File(node, filename));
            }
        }
    }

    /**
     * Generates the zip entry for a file.
     *
     * @param file The file path.
     * @return The zip entry.
     */
    private String generateZipEntry(String file) {
        return file.substring(SOURCE_FOLDER.length() + 1, file.length());
    }
}
