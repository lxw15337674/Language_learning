package Primary;

/**
 * Created by 40417 on 2016/9/27 0027.
 */
interface drawTest{
    public void draw();
}
class ParallelogramgleUseinterface extends QuadrangleUseInterface
        implements drawTest{
    public void draw(){
        System.out.println("平行四边形.draw()");
    }
    public void doAnyThing(){

    }
}
class SquareUseinterface extends QuadrangleUseInterface
        implements drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    public void doAnyThing(){
    }
}
class AnyThingUseinterface extends QuadrangleUseInterface {
    public void doAnyThing(){

    }
}
public class QuadrangleUseInterface {
    public void doAnyThing(){

    }

    public static void main(String[] args) {
        drawTest[] d ={new SquareUseinterface(),new ParallelogramgleUseinterface()
        };
        for(int i=0;i<d.length;i++){
            d[i].draw();
        }
    }
}
