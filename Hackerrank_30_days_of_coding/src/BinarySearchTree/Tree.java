package BinarySearchTree;

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinaliyt();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
