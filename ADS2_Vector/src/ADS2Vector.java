public class ADS2Vector {
    private int[] container;
    private int length;

    public ADS2Vector(){
        container = new int[1];
        length = 0;
    }

    public ADS2Vector(int ini_C){
        length = 0;
        container = new int[ini_C];
    }

    public void Append(int value)
    {
        if(length == container.length){
            int[] longerArray = new int[container.length*2];
            for(int i=0; i<container.length;i++){
                longerArray[i]=container[i];
            }
            container=longerArray;
        }
        container[length++]=value;
    }

    public int GetCapacity()
    {
        return container.length;
    }

    public int GetNoOfItems()
    {
        return length;
    }

    public int GetItem(int index)
    {
        return container[index];
    }

    public int Find(int value)
    {
        for(int i=0; i<length; i++){
            if (container[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void InsertItem(int index, int value)
    {
        if (container.length == length){
            Append(0);
        }
        for(int i = 1;i<index;i++){
            container[length-i+1] = container[length-i];
        }
        container[index] = value;
        length++;
    }

    public void DeleteItem(int index)
    {
        for(int i = index;i<length-1;i++){
            container[i] = container[i+1];
        }
        length--;
    }
}
