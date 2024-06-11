class day4 {
    public static void main(String[] args) {
        // selection sort
        int a[] = { 5, 6, 1, 7, 9, 28, 8, 66 };
        for (int i = 0; i < a.length; i++) {
            int id = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    id = j;
                }
            }
            int t = a[i];
            a[i] = a[id];
            a[id] = t;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
