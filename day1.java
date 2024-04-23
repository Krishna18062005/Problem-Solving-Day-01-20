class day1 {
    public static void main(String args[]) {
        int a[] = { 10, 20, 30, 29, 39, 39 };
        int i;
        int k = 3;// key to search element present or not
        for (i = 0; i < a.length; i++) {// loop to check the key
            if (a[i] == k) {
                break;// break if element present
            }
        }
        if (i == a.length) {// if the loop fully travelled
            // means the elements is not inarry

            System.out.println("Element not found");

        } else {
            System.out.println("Element found at index: " + i);
        }

    }

}
