public class Main {
    public static void main(String[] args) {
        System.out.println("Running Pokemon Examples...");

        Pokemon pikachu = new Pokemon("Pikachu");
        pikachu.sayHi();
        pikachu.attack();

        Pokemon charzard = new FireType("Charzard", 50);
        charzard.sayHi();
        charzard.attack();

        System.out.println(charzard.getClass().toString());

        Pokemon blastoise = new WaterType("Blastoise", 75);
        blastoise.sayHi();
        blastoise.attack();

        System.out.println(blastoise.getClass().toString());
    }
}
