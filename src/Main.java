import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countOfCorrectlySpecifiedPathsToFiles = 0;

        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                System.out.println("Указанный файл не существует. Или указанный путь является путём к папке" + "\n");
                continue;
            } else {
                System.out.println("Путь указан верно");
                countOfCorrectlySpecifiedPathsToFiles++;
                System.out.println("Это файл номер " + countOfCorrectlySpecifiedPathsToFiles + "\n");
            }
        }
    }
}
