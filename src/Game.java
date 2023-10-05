import org.w3c.dom.ls.LSOutput;

public class Game {
    public static void main(String[] args) {
        Input input = new Input();
        Characters playerOne = new Characters("you", 100, 10, 5);
        Items pumpkin = new Items("Pumpkin", "0", "15");
        Characters skeleton = new Characters("Giant Skeleton", 100, 10, 5);
        Characters ghost = new Characters("Scary Ghost", 100, 10, 5);
        Characters vampire = new Characters("Vampire", 100, 10, 5);
        Characters werewolf = new Characters("Werewolf", 100, 10, 5);
        Characters witch = new Characters("Witch", 100, 10, 5);

        Items sword = new Items("Sword", "20", "0");
        Items shield = new Items("Shield", "0", "10");
        Items potion = new Items("Potion", "0", "0");
        Items axe = new Items("Axe", "15", "0");


        System.out.println("Boo! It’s Halloween! You love all things Spooky Season and you remembered your classmate told you about a new Haunted House downtown. Do you want to check it out? (Y/N)");
        if (input.yesNo()) {
            Story hauntedHouse = new Story("Haunted House", "You arrive at the Haunted House and it looks spooky. You walk up to the front door and it creaks open. You walk inside and the door slams behind you. You are trapped! You must find a way out!");
            hauntedHouse.getDescription();
        } else {
            System.out.println("You are lame. You are going to the Haunted House anyway.");
            Story hauntedHouse = new Story("Haunted House", "You arrive at the Haunted House and it looks spooky. You walk up to the front door and it creaks open. You walk inside and the door slams behind you. You are trapped! You must find a way out!");
            hauntedHouse.getDescription();
        }

    }
}
