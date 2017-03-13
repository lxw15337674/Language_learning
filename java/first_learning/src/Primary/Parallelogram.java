package Primary;

class Quadrange{
    public static void draw(Quadrange q){
    }
}
class Square extends Quadrange{

}
class Anythinkg{

}
public class Parallelogram extends Quadrange{
    public static void main(String[] args) {
        Quadrange q = new Quadrange();
        if(q instanceof  Parallelogram){
            Parallelogram p = (Parallelogram) q;
        }
        if(q instanceof Square){
            Square s =(Square) q;
        }

    }
}