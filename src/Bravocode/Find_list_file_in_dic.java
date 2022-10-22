package Bravocode;

import java.io.File;

public class Find_list_file_in_dic {
    public static void main(String[] args) {
        //Java program to get list of files, directories from a directory.



                File dirName = new File("G:\\");
                File[] listFiles = dirName.listFiles();

                for (int i = 0; i < listFiles.length; i++)
                {
                    if (listFiles[i].isFile())
                    {
                        System.out.println("File: " + listFiles[i].getName());
                    }
                    else if (listFiles[i].isDirectory())
                    {
                        System.out.println("Directory: " + listFiles[i].getName());
                    }
                }
            }
        }
