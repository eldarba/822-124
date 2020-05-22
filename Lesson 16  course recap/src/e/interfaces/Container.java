package e.interfaces;

/**
 * an interface is a list of methods without implementations that can be
 * implemented by classes regardless of inheritance.
 * 
 * 1. Cannot be instantiated
 * 
 * 2. can contain abstract methods
 * 
 * 3. can contain constants
 * 
 */

public interface Container<T> {

	// constant
	int MIN = 0;

	// methods
	void add(T content);

	void clear();
}
