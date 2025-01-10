import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

class FileManagement {
    public static void main(String[] args) {

        // 1. Creating an file
        File file = new File("my_text_file.txt");

        try {
            boolean result = file.createNewFile();

            if (result) {
                System.out.println("File created");
            } else {
                System.out.println("Failed to crarte the file");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 2. Writing on the file
        String data = "Hi, My name is Tahmeed";

        try {
            FileWriter fw = new FileWriter("my_text_file.txt");
            fw.write(data);
            System.out.println("Data writing complete");
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 3. Reading the data
        char[] array = new char[200];

        try {
            FileReader fr = new FileReader("my_text_file.txt");
            fr.read(array);
            System.out.println("The data is: ");
            System.out.println(array);
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4. Delete the file
        boolean result = file.delete();
        if (result) {
            System.out.println("File deleted");
        } else {
            System.out.println("Unable to delete the file");
        }

    }
}