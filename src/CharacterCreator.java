import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharacterCreator {
    public static void main(String args[]){

        File folder = new File(System.getProperty("user.dir") + "/Character");
        File[] listOfFiles = folder.listFiles();

        int i = 1;
        for (;i < listOfFiles.length;i++);

        try {

            PrintWriter writer = new PrintWriter(System.getProperty("user.dir") + "/Character/" + "Character"+ i + ".bin", "UTF-8");
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter in character name: ");
            writer.println(scan.nextLine());
            writer.close();

        } catch (Exception e) {
            System.out.println("Character Save Failed");
        }


        CharacterClass char1 = new CharacterClass();

        char1.setXp(2700);
        //char1.addXp(0);
        System.out.println(char1.getXp());
        System.out.println(char1.getLevel());


    }
}
