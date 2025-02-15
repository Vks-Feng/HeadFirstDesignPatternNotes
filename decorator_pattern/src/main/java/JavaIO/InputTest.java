package JavaIO;

import com.sun.tools.javac.Main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
//    public static void main(String[] args) {
//        int c;
//        try {
//            InputStream in =
//                    new LowerCaseInputStream(
//                            new BufferedInputStream(
//                                    new FileInputStream("test.txt")));
//            while ((c = in.read()) >= 0) {
//                System.out.print((char)c);
//            }
//            in.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main(String[] args) {
        try {
            // 使用 ClassLoader 获取文件输入流
            InputStream resourceStream = Main.class.getClassLoader().getResourceAsStream("test.txt");
            if (resourceStream != null) {
                // 包装输入流
                InputStream in = new LowerCaseInputStream(
                        new BufferedInputStream(resourceStream));

                int data;
                while ((data = in.read()) != -1) {
                    System.out.print((char) data);
                }

                // 关闭输入流
                in.close();
            } else {
                System.out.println("未找到文件");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
