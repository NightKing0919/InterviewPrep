import Algorithms.UnionFind.QuickUnionUF;

public class Main {

    public static void main(String[] args) {

        QuickUnionUF uf=new QuickUnionUF(10);
        uf.union(2,9);
        uf.union(4,9);
        uf.union(4,3);
        uf.union(6,5);

        System.out.println(uf.connected(5,3));
        uf.union(4,6);

        System.out.println(uf.connected(5,3));
    }
}
