package stack;

import exceptions.StackException;

public interface IStackADT {
    boolean isEmpty();
    // Determines whether the stack is empty.
    // Precondition: None.
    // Postcondition: Returns true if the stack is empty;
    // other wise returns false.

    void push(Object newItem);
    // Adds an item to the top of the stack.
    // Precondition: newItem is the item to be added.
    // Postcondition: If insertion is successful, newItem
    // is on the top of the stack.

    // Exception: Some implementations may throw
    // StackException when newItem cannot be placed on
    // the stack.

    Object pop() throws StackException;
    // Removes the top of a stack.
    // Precondition: None.
    // Postcondition: If the stack is not empty, the item
    // that was added most recently is removed from the
    // stack and returned.
    // Exception: Throws StackException if the stack is empty.

    void popAll();
    // Removes all the items from the stack.
    // Precondition: None.
    // Postcondition: Stack is empty.

    Object peek() throws StackException;
    // Retrieves the top of a stack.
    // Precondition: None.
    // Postcondition: If the stack is not empty, the item
    // that was added most recently is returned. The
    // stack is unchanged.
    // Exception: Throws StackException if the stack is
    // empty
}
