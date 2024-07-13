public class nextgreatestletter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'h', 'j'};
        char target = 'd';
       char ans = nextgreatestletter(letters, target);
        System.out.println(ans);
    }

    //return the index of smallest letter i.e. greater than or equal to target
    //return -1 if target does not exist
    static char nextgreatestletter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            //find the middle element
//            int mid = (start + end) / 2;
            //might be possible that start+end exceed from range of int
            int mid = start + (end - start) / 2;

            if ((target < letters[mid])) {
                end = mid - 1;
            } else {
                // ans found
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
