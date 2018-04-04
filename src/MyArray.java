public class MyArray {
    private int[] arr;
    private int size;

    MyArray(int maxSize) {
        this.size = 0;
        this.arr = new int[maxSize];
    }

    void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

    void insert(int value) {
        if (this.size == this.arr.length) {
            int[] tempArr = this.arr;
            this.arr = new int[(this.size+1) * 2];
            System.arraycopy(tempArr, 0, this.arr, 0, size);
        }
       /* int i;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] > value) break;
        }
        System.arraycopy(this.arr, i, this.arr, i + 1, this.size - i);
        arr[i] = value;*/
       arr[this.size]=value;
        this.size++;
    }

    boolean delete(int value) {
        int pos = getPosition(value);
        if (pos != -1) {
            System.arraycopy(this.arr, pos + 1, this.arr, pos, this.size - pos - 1);
            this.size--;
            return true;
        }
        return false;
    }

    int getPosition(int value) {
        for (int i = 0; i < this.size; i++)
            if (this.arr[i] == value)
                return i;
        return -1;
    }

    boolean isInArray(int value) {
        for (int i = 0; i < this.size; i++)
            if (this.arr[i] == value)
                return true;
        return false;
    }

    boolean hasValue(int value) {
        int low = 0;
        int high = this.size - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (value == this.arr[mid]) {
                return true;
            } else {
                if (value < this.arr[mid])
                    high = mid;
                else
                    low = mid + 1;
            }
        }
        return false;
    }

    void sortBubble() {  // O(n * k)
        for (int out = this.size - 1; out > 1; out--)
            for (int in = 0; in < out; in++)
                if (this.arr[in] > this.arr[in + 1])
                    itemSwap(in, in + 1);
    }

    void sortSelect() { //сортировка выбором
       int min = 0;
       for (int k = 0; k < size; k++) {
           min=k;
           for (int i = k+1; i < size; i++) {
                if (arr[i]<arr[min]) min=i;
            }
           itemSwap(min,k);
       }

    }

    void sortInsert() {
    int mark=0;

        for (int i = 1; i < size; i++) {
          //если элемент справа меньше элемента слева, то надо элемент справа провести по всем слева, чтобы понять где его оставить.
//           if(arr[mark]>arr[i])  {
               for (int j = i; j >0 && arr[j-1]>arr[j]; j--) {
                   itemSwap(j-1,j);
               }
//           }
//           mark=i;
        }


    }

    private void itemSwap(int from, int to) {
        int tmp = this.arr[from];
        this.arr[from] = this.arr[to];
        this.arr[to] = tmp;
    }

}
