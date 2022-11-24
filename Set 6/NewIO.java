package com.company;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class NewIO {
    private static final int BSIZE=4096;
    public static void main(String[] args) throws IOException{
        //Accepting Inputs of Text from User.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Some Lines of Text");
        String str=sc.nextLine();

        //Creating FileChannel and FileOutputStream and Writing Text in Files.
        FileChannel fl1=new FileOutputStream("file6.txt").getChannel();
        fl1.write(ByteBuffer.wrap(str.getBytes()));
        fl1.close();

        //Creating RandomAccessFile Object Instance to read-write.
        fl1=new RandomAccessFile("file6.txt","rw").getChannel();
        fl1.position(fl1.size());
        fl1.close();

        //Creating FileInputStream Object Instance to Read File.
        fl1=new FileInputStream("file6.txt").getChannel();
        ByteBuffer bf=ByteBuffer.allocate(BSIZE);
        fl1.read(bf);
        bf.flip();
        while(bf.hasRemaining())
            System.out.print((char)bf.get());

    }
}

