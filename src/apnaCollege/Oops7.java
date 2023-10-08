package apnaCollege;

public class Oops7 {
    public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();

    Bear b = new Bear();
    b.eatGrass();
    b.eatFlesh();
    }
}

interface ChessPlayer{
    void moves();    //function/method (public,abstract,without implementation)
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (only 1 step)");
    }
}

interface Herbivore {
    void eatGrass();
}

interface Carnivore {
    void eatFlesh();
}

class Bear implements Herbivore, Carnivore {
public void eatGrass(){
    System.out.println("apnaCollege.Bear eats grass");
}
    public void eatFlesh(){
        System.out.println("apnaCollege.Bear also eats flesh");
    }

}
