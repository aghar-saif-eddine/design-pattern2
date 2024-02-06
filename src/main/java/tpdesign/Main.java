package tpdesign;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Création du gestionnaire de création de monstres
        MonsterManager manager = new MonsterManager();

        // Ajout des prototypes de monstres
        manager.addMonsterPrototype("Fire", new FireMonster());
        manager.addMonsterPrototype("Ice", new IceMonster());

        // Clone et affichage des monstres
        Monster fireMonster = manager.cloneMonster("Fire");
        fireMonster.display();

        Monster iceMonster = manager.cloneMonster("Ice");
        iceMonster.display();

        // Modification des attributs pour créer de nouvelles variations
        fireMonster = manager.cloneMonster("Fire");
        fireMonster.display();
        fireMonster = manager.cloneMonster("Fire");
        fireMonster.display();
    }
}