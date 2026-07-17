class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int n=5;
        int m=10;
        pat(n);
        pat(m);
        pat(3);
        pat(4);
    }
    static void pat(int k)
    {
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            }
        }
    }
