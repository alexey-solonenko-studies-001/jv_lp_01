package com.jv_lp_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {
        try {

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "dir1", "file1copy.txt");
//            Files.deleteIfExists(fileToDelete);

//            Path fileToCreate = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.createFile(fileToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
//            Files.createDirectory(dirToCreate);
//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5");
//            Files.createDirectories(dirToCreate);
            Path filePath = FileSystems.getDefault().getPath("Examples","Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);
            System.out.println("Lastt modified  = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath,BasicFileAttributes.class);
            System.out.println("Size " + attrs.size());
            System.out.println("Last modified " + attrs.lastModifiedTime());
            System.out.println("Created " + attrs.creationTime());
            System.out.println("is directory " + attrs.isDirectory());
            System.out.println("is regular file " + attrs.isRegularFile());



            /* from video 238 */


//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","file2.txt");
//            Files.move(fileToMove,destination);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples","Dir1","file1copy.txt");
//            Files.move(fileToMove,destination);

//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

//            sourceFile = FileSystems.getDefault().getPath("Examples","Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
//    public static void main(String[] args) {
//        Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//        printFile(path);
//        path = FileSystems.getDefault().getPath("Files\\SubdirectoryFile.txt");
//        printFile(path);
//        path = FileSystems.getDefault().getPath("Files","SubdirectoryFile.txt");
//        printFile(path);
//        path = FileSystems.getDefault().getPath("..\\..\\outthere.txt");
//        printFile(path);
//        path = Paths.get("C:\\outthere.txt");
//        printFile(path);
//        path = Paths.get("C:\\","outthere.txt");
//        printFile(path);
//        path = Paths.get(".","Files","SubdirectoryFile.txt");
//        printFile(path);
//
//        path = Paths.get(".");
//        System.out.println(path.toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("thisFileDoesNotExists.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("C:\\doesNotExist\\somewhere.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        path = FileSystems.getDefault().getPath("Files");
//        System.out.println("Exitst = " + Files.exists(path));
//        System.out.println("Exitst = " + Files.exists(path3));
//        System.out.println("Exitst = " + Files.notExists(path4));
//        System.out.println("Exitst = " + Files.isReadable(path4));
//        System.out.println("Exitst = " + Files.isWritable(path4));
//        System.out.println("Exitst = " + Files.isExecutable(path4));
//
//        /* might not have permissions*/
//
//    }

    /**
     * @param path Path
     */
    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
