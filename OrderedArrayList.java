import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T a){
    super.add(this.position(a),a);
    return true;
  }

  public void add(int b, T a){
    super.add(this.position(a),a);
  }

  public T set(int b, T a){
    T c = get(b);
    remove(b);
    super.add(this.position(a),a);
    return c;
  }

  private int position(T a){
    for (int i = 0; i<this.size();i++){
      if (this.get(i).compareTo(a)==1){
        return i;
      }
    }
    return this.size();
  }


}
