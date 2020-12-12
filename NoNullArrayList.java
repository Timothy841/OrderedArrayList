import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

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

}
