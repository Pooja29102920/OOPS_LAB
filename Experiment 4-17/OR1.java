class GameCharacter {
    void attackMove() {
        System.out.println("GameCharacter attacks!");
    }
}

class Warrior extends GameCharacter {
    @Override
    void attackMove() {
        System.out.println("Warrior swings a sword!");
    }
}

class Archer extends GameCharacter {
    @Override
    void attackMove() {
        System.out.println("Archer shoots an arrow!");
    }
}

class Mage extends GameCharacter {
    @Override
    void attackMove() {
        System.out.println("Mage casts a spell!");
    }
}

public class OR1 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior();
        GameCharacter archer = new Archer();
        GameCharacter mage = new Mage();

        warrior.attackMove();
        archer.attackMove();
        mage.attackMove();
    }
}
