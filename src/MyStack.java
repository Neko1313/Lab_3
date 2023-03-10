public class MyStack <T extends Comparable> {
    private final int MAX = 10;
    private int size;
    private ArrayList<T> array;

    public MyStack ()  {
        size = 0;
        array = new ArrayList<>(MAX);
    }

    public void add(T x) {
        if (size < MAX) {
            array.add(x);
            size++;
        }
    }
    public void del(T x) {
        if (size > 0) {
            array.del(x);
            size--;
        }
    }

    public int isSmaller(T x)
    {
        int count_smail = 0;
        for (int i = 0; i < size; i++)
        {
            if (array.get(i) < x ) {
                count_smail++;
            }
        }
        return count_smail;
    }

    public boolean checkDoubleNumder(T x, int index)
    {
        for (int i= 0 ; i < size; i++){
            if (i != index){
                if (x ==  array.get(i)){
                  return true;
                }
            }
        }
        return false;
    }

    public boolean checkDouble(){
        for (int i = 0; i<size; i++){
            if (checkDoubleNumder(array.get(i), i) == true){
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++)
        {
            result = result + array.get(i) + ", ";

        }
        return result;
    }
}
