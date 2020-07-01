package be.vdab.mammal;

public class Dog {

    private Commands command;

    private String bark() {
        return "WOEF WOEF";
    }

    private String beg() {
        return "Kajieet";
    }

    private String chase() {
        return "GRRRR";
    }

    public String react(Commands command) {
        if (command == Commands.SPEAK) {
            return bark();
        } else {
            if (command == Commands.BEG) {
                return beg();
            } else {
                if (command == Commands.CHASE) {
                    return chase();
                }
                return "the dog doesn't understand your command, try again.";
            }
        }
    }

    public enum Commands {
        SPEAK,
        BEG,
        CHASE,
    }
}
