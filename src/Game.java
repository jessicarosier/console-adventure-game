

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


        System.out.println("···············································································\n" +
                ":.___________. __    __   _______                                             :\n" +
                ":|           ||  |  |  | |   ____|                                            :\n" +
                ":`---|  |----`|  |__|  | |  |__                                               :\n" +
                ":    |  |     |   __   | |   __|                                              :\n" +
                ":    |  |     |  |  |  | |  |____                                             :\n" +
                ":    |__|     |__|  |__| |_______|                                            :\n" +
                ":                                                                             :\n" +
                ": __    __       ___      __    __  .__   __. .___________. _______  _______  :\n" +
                ":|  |  |  |     /   \\    |  |  |  | |  \\ |  | |           ||   ____||       \\ :\n" +
                ":|  |__|  |    /  ^  \\   |  |  |  | |   \\|  | `---|  |----`|  |__   |  .--.  |:\n" +
                ":|   __   |   /  /_\\  \\  |  |  |  | |  . `  |     |  |     |   __|  |  |  |  |:\n" +
                ":|  |  |  |  /  _____  \\ |  `--'  | |  |\\   |     |  |     |  |____ |  '--'  |:\n" +
                ":|__|  |__| /__/     \\__\\ \\______/  |__| \\__|     |__|     |_______||_______/ :\n" +
                ":                                                                             :\n" +
                ": __    __    ______    __    __       _______. _______                       :\n" +
                ":|  |  |  |  /  __  \\  |  |  |  |     /       ||   ____|                      :\n" +
                ":|  |__|  | |  |  |  | |  |  |  |    |   (----`|  |__                         :\n" +
                ":|   __   | |  |  |  | |  |  |  |     \\   \\    |   __|                        :\n" +
                ":|  |  |  | |  `--'  | |  `--'  | .----)   |   |  |____                       :\n" +
                ":|__|  |__|  \\______/   \\______/  |_______/    |_______|                      :\n" +
                "···············································································" +
                "\nWelcome to \"The Haunting on Hawthorn Hill,\" an interactive choose-your-own-adventure game for your console. In this spine-tingling adventure, you'll step into the shoes of Emma, a young paranormal investigator. Your mission is to explore the notorious Hawthorn Hill Mansion, a place rumored to be haunted for centuries. Your choices will determine your fate and uncover the mysteries hidden within. Are you ready to begin?\n 1. Yes.\n 2. No.");
        if (input.yesNo()) {
            System.out.println("You arrive at the Hawthorn Hill Mansion with your trusted team of investigators. As you stand in front of the imposing mansion, you feel a shiver run down your spine. The wind howls, and the moon casts eerie shadows. Your first choice:\n 1. Enter the mansion through the front door. \n 2. Search for an alternate entrance around the back.");

            if(input.yesNo()) {
                System.out.println("Inside the mansion, you find yourself in a grand, dusty foyer. The air is thick with foreboding. You can hear faint whispers echoing through the halls. Your next choice:\n 1. Investigate the whispers and follow them down the corridor.\n 2. Ignore the whispers and proceed further into the foyer.");
            } else {
                System.out.println("You dont find another way in, you go back to th front door and enter.");
            }
        }


    }
}
