import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T a){
    if (a==null){
      throw new IllegalArgumentException();
    }
    super.add(a);
    return true;
  }

  public void add(int b, T a){
    if (a==null){
      throw new IllegalArgumentException();
    }
    super.add(b, a);
  }

  public T set(int b, T a){
    if (a==null){
      throw new IllegalArgumentException();
    }
    super.set(b, a);
    return a;
  }

}
