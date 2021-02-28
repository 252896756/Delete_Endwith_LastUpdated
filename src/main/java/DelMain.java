import java.io.File;
import java.util.Scanner;

public class DelMain {

    public static String LOCAL_MAVEN_PATH="D:\\Xumf-Area\\My-Java\\Java-Software\\apache-maven-3.6.3\\setting_20210124_rep";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        File file = new File(next);
        File[] files = file.listFiles();
        recursionDel(files);

    }

    public static void recursionDel(File[] files){
        for (File file : files) {
            if(file.isDirectory()){
                recursionDel(file.listFiles());
            }else{
                if(file.getName().endsWith(".lastUpdated")){
                    boolean delete = file.delete();
                    System.out.println(file.getName() + "[删除]" + delete);
                }
            }
        }

    }
}
