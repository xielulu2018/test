package file;

import java.io.File;
import java.io.IOException;

/**
 * Created by lucas on 2018/8/6.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("text");
//        file.mkdir();
//        File file1 = new File("text/text1.txt");
//        file1.createNewFile();
//        File file2 = new File("text/text2");
//        file2.mkdir();
//        File file3 = new File("text/text2/text3.txt");
//        file3.createNewFile();

        new FileDemo().printFile(new File("text"),1);
    }
    public void printFile(File file,int tab){
        if(file.isDirectory()){
            System.out.println("文件夹"+file.getName());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                for (int j = 0; j <tab; j++) {
                    System.out.print("  ");
                }
                if (files[i].isFile()){
                    String name = files[i].getName();
                    System.out.println("文件"+name);
                }else {
                    printFile(files[i],tab+1);
                }
            }
        }
    }
}
