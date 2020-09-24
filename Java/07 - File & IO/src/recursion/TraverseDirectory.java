package recursion;

import java.io.File;

public class TraverseDirectory {
    public static void main(String[] args) {
//        指定要遍历的根目录
        File srcDirectory = new File("Your directory pathname");

//        调用函数递归遍历该目录
        traverse(srcDirectory);
    }

//    遍历并输出指定文件目录中的所有文件
    public static void traverse(File srcDirectory) {
//        1. 拿到该目录下的所有内容
        File[] files = srcDirectory.listFiles();

//        2. 遍历，如果是目录就再次调用方法，否则将文件的绝对路径输出在控制台
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getAbsolutePath());
                } else {
                    traverse(file);
                }
            }
        }
    }
}
