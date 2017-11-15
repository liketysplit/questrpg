import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class ItemCreator {
    private int id;
    private String name;
    private String Description;
    private double level;
    private double intL;
    private double range;
    private double agl;
    private double def;
    private double hp;
    private double str;
    private int count;
    private boolean stackable;
    private boolean equipable;
    private int itemtype;
    private boolean consumable;
    private int rarity;


    public static void main(String args[]) throws Exception {

        File folder = new File(System.getProperty("user.dir") + "/items");
        File[] listOfFiles = folder.listFiles();

        int i = 1;
        for (;i < listOfFiles.length;i++);

// System.out.println("Working Directory = " + System.getProperty("user.dir"));

        try {

            PrintWriter writer = new PrintWriter(System.getProperty("user.dir") + "/items/" + i + ".bin", "UTF-8");
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter in item name: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in description: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in level: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in intelligence: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in range: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in agility: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in defense: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in hp: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in str: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in count: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in item type: ");
            writer.println(scan.nextLine());
            System.out.println("Enter in item rarity: ");
            writer.println(scan.nextLine());
            System.out.println("Is it stackable? (true or false): ");
            writer.println(scan.nextLine());
            System.out.println("Is it equipable? (true or false): ");
            writer.println(scan.nextLine());
            System.out.println("Is it consumable? (true or false): ");
            writer.println(scan.nextLine());
            writer.close();


        } catch (Exception e) {
            System.out.println("Saved Failed");
        }

    }

}
