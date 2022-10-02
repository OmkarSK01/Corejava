package collectionframework;


import kotlin.jvm.internal.SpreadBuilder;

public interface ListInterface {

    void show();

    void display();
}

class ArrayListClass implements ListInterface{


    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void display() {
        System.out.println("In display");
    }

    public void add(){
        System.out.println("In add method");
    }

    public static void main(String[] args) {
        ListInterface obj = new ArrayListClass();
        obj.display();
        obj.show();
      //  obj.add(); -he nka deu//((ArrayListClass) obj).add(); - he jr dil tr add method hoil print

    }
}


