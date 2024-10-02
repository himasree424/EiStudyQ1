package structural2;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Directory subDir = new Directory("SubDir");
        File file3 = new File("File3.txt");

        root.add(file1);
        root.add(file2);
        subDir.add(file3);
        root.add(subDir);

        root.showDetails();
    }
}