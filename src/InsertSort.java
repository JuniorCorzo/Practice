import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertSort {
    public static List<Integer> insertSort(List<Integer> listDisordered) {
        LinkedList<Integer> listSort = new LinkedList<>();
        listSort.add(listDisordered.get(0));
        listDisordered.remove(0);

        int index = 0;
        while (!listDisordered.isEmpty()) {
            if (listSort.get(index) >= listDisordered.get(0)) {
                if (index > 0 && listSort.get(index - 1) <= listDisordered.get(0)) {
                    listSort.add(index, listDisordered.get(0));
                    listDisordered.remove(0);
                    index++;
                } else if (index == 0) {
                    listSort.add(index, listDisordered.get(0));
                    listDisordered.remove(0);
                } else {
                    index--;
                }

            } else if (listSort.get(index) <= listDisordered.get(0)) {
                if (index < listSort.size() && listSort.get(index) >= listDisordered.get(0)) {
                    listSort.add(index + 1, listDisordered.get(0));
                    listDisordered.remove(0);
                    index++;
                } else if (index == listSort.size() - 1) {
                    listSort.add(index + 1, listDisordered.get(0));
                    listDisordered.remove(0);
                    index++;
                } else {
                    index++;
                }
            }
        }
        return listSort;
    }

    public static void main(String[] args) {
        List<Integer> listSorted = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 6, 8, 7 ,10, 5, 0));
        System.out.println(insertSort(listSorted));
    }
}
