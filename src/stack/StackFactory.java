package stack;

public interface StackFactory<E> {

	public Stack<E> newInstance();

}