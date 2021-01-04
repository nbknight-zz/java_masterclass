public class Player {
    //this class will not have encapsulation

    //three fields that relate to the player
    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }


}
