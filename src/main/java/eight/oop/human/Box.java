package eight.oop.human;

public class Box<F> {

    private F field;

    public F getField(){
        return field;
    }
    public void setField(F field){
        this.field = field;
    }
}
