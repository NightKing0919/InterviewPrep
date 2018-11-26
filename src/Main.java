import Algorithms.UnionFind.QuickFindUF;

public class Main {

    public static void main(String[] args) {

        QuickFindUF uf=new QuickFindUF(4);
        uf.union(0,1);uf.union(2,3);
        System.out.println(uf.connected(0,0));
    }
}
