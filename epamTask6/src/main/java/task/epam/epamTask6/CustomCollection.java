package task.epam.epamTask6;

public class CustomCollection {

	private Object[] Array= new Object[10];
    private int count = 0;
    public void add(Object obj)
    {
        if(count == Array.length)
        {
            increaseCapacity(); 
        }
        Array[count] = obj;
        count++;
    }
    public void increaseCapacity(){
        int newCapacity = Array.length * 2;
        Object[] nextArray = new Object[newCapacity];
        //copying old list to new list
        for(int i = 0; i < Array.length;i++){
            nextArray[i] = Array[i];
        }
        Array = nextArray;
    }
    
    public void fetch(int i)
    {
    	System.out.println("Element is:" + Array[i]);
    }
    public void remove(int i)
    {
        if(count == 0)
        {
            System.out.println("List is empty,Cannot delete the elements...");
        }
        else {
            Object r = Array[i];
            System.out.println("\nRemoved element is "+ r);
            System.arraycopy(Array, i + 1, Array, i, Array.length - i - 1);
            count--;
        }
    }
    public void printList() {
            for(Object obj1 : Array)
                if(obj1 == null)
                    break;
                else
                    System.out.print(obj1 + " ");
            System.out.println();
    }
    public String toString() {
        if (count == 0)
            return "[ ]";
        else {
            String res = "[ ";
            for (Object obj1 : Array)
                if (obj1 == null)
                    break;
                else
                    res += obj1 + " , ";

            res = res.substring(0, res.length() - 2);

            res += "]\n";
            return res;
        }
    }
    public Object get(int index){
        if(index<0||index >= count){
            throw new IndexOutOfBoundsException("" + index);
        }
        return  Array;
    }
    
   

}