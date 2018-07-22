import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NIOFileReadExample {

    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("C:\\Users\\Home\\projects\\oracle-certified-associate\\ch2-operators-and-statements\\src\\main\\java\\data.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter(" ");

                List<String> list = new ArrayList<String>();

        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }

        System.out.println(list);


    }


//    public static void main(String[] args) throws IOException {
//
//
//        File file = new File("data.txt");
//        Scanner input = new Scanner(file);
//        List<String> list = new ArrayList<String>();
//
//        while (input.hasNextLine()) {
//            list.add(input.nextLine());
//        }
//
//        System.out.println(list);
//
//
//
////        RandomAccessFile file = new RandomAccessFile("C:\\Users\\Home\\projects\\oracle-certified-associate\\ch2-operators-and-statements\\src\\main\\java\\data.txt", "r");
////        FileChannel channel = file.getChannel();
////
////        ByteBuffer buffer = ByteBuffer.allocate((int) channel.size());
////
////        channel.read(buffer);
////
////        buffer.flip();//Restore buffer to position 0 to read it
////
////        for (int i = 0; i < channel.size(); i++) {
////
////            System.out.print((char) buffer.get());
////        }
////
////        channel.close();
////        file.close();
////
//    }
}
