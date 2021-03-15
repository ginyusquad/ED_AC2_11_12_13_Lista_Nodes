package source;

public interface Position<E> {
	E element();
	PositionList<E> getListNodes();
	void setListNodes(PositionList<E> lista);
}
