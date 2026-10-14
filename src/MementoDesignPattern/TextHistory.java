package MementoDesignPattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class TextHistory {
    private final Deque<EditorMemento> historyStack = new ArrayDeque<>();

    public void push(EditorMemento memento) {
        historyStack.push(memento);
    }

    public EditorMemento pop() {
        if (!historyStack.isEmpty()) {
            return historyStack.pop();
        }
        return null;
    }
}
