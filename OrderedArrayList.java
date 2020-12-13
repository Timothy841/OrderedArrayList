import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public boolean add(T a){
    if (a==null){
      throw new IllegalArgumentException();
    }
    super.add(this.position(a),a);
    System.out.println(this.position(a)+","+a);
    return true;
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
