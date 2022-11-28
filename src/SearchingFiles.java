import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchingFiles {
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<>();
        searchFileByName(new File("C:\\"), fileList, "pejzazh-gor-s-nebom-i-oblakami");

        System.out.println("Найденные файлы: ");
        fileList.forEach(e -> System.out.println(e.getAbsolutePath()));

    }

    public static void searchFileByName(File rootFile, List<File> fileList, String fileName) {
        if (rootFile.isDirectory()) {
            System.out.println(rootFile.getAbsolutePath());
            File[] files = rootFile.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        searchFileByName(file, fileList, fileName);
                    } else {
                        if (file.getName().toLowerCase().startsWith(fileName)) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}
