package wyklady.w13.io;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("H:\\Mój dysk\\Studia PJATK\\PPJ\\allWyklady\\readEx1.txt");
            /*
            int val = fr.read();
            System.out.print((char)val);
            while (val != -1) {
                val = fr.read();
                System.out.print((char)val);
            }
            System.out.println();
             */

            int val;
            while ((val = fr.read()) != -1) {
                System.out.print((char)val);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //===================================

        int data = 1234;   // 0100_1101_0010
                            // 0000_1101_0010

        try {
            FileOutputStream fos = new FileOutputStream("H:\\Mój dysk\\Studia PJATK\\PPJ\\allWyklady\\write.bin");
            fos.write((data >> 24) & 0b1111_1111);
            fos.write((data >> 16) & 0b1111_1111);
            fos.write((data >> 8) & 0b1111_1111);
            fos.write((data >> 0) & 0b1111_1111);

            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("H:\\Mój dysk\\Studia PJATK\\PPJ\\allWyklady\\write.bin");
            int res = 0;
            res = (res << 8) | fis.read(); // 0 bit
            res = (res << 8) | fis.read(); // 8
            res = (res << 8) | fis.read(); // 16
            res = (res << 8) | fis.read(); // 24

            System.out.println(res);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //=================================

        try {
            FileReader fr = new FileReader("H:\\Mój dysk\\Studia PJATK\\PPJ\\allWyklady\\readEx1.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());
            fr.close();
        } catch (FileNotFoundException e) {
            e.getClass();
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
