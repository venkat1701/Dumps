import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class FileWorker {
    static Scanner sc=new Scanner(System.in);

    static void FileFinder(){
        System.out.println("Enter the name of File");
        String filename="";
            filename=sc.next();
            try
            {
            Path p= FileSystems.getDefault().getPath(filename);
            System.out.println(p.toRealPath());
            }
            catch(Exception e){}
    }
    static void FileCreator()
    {

    }
    static void FileReader()
    {

    }


    static void FileManager()
    {
        System.out.println("Welcome to File Manager");
        System.out.println("Press 1 to Find a File");
        System.out.println("Press 2 to Create a File");
        System.out.println("Press 3 to Read a File");
        int choice=sc.nextInt();
        if(choice==1)
            FileFinder();
        else if(choice==2)
            FileCreator();
        else if(choice==3)
            FileReader();
    }
    public static void main(String[] args) {

        System.out.println("Press 1 to Enter File Worker");
        int choice=sc.nextInt();
        if(choice==1)
            FileManager();
    }
}
