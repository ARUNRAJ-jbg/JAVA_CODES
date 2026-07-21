class Main {
    public static void main(String[] args) {
        String[] name={"arun","anbu","raj","deepath"};
        int[][] marks={{78,87,54,34,79},{56,43,45,77,57},{34,34,23,34,23},{23,57,35,34,56}};
        for(int i=0;i<name.length;i++)
        {
            System.out.println("name="+name[i]);
            double total=0;
            for(int j=0;j<marks.length;j++)
            {
                System.out.println(marks[i][j]+"");
                total+=marks[i][j];
            }
            System.out.println();
            System.out.println("average"+(total/5)+"%");
            System.out.println();
        }
    }
}
