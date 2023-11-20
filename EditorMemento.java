// Memento class
class EditorMemento {
    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Originator class
class TextEditor {
    private String content;

    public void write(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}

// Caretaker class
class History {
    private TextEditor editor;
    private EditorMemento savedState;

    public History(TextEditor editor) {
        this.editor = editor;
    }

    public void save() {
        savedState = editor.save();
    }

    public void undo() {
        if (savedState != null) {
            editor.restore(savedState);
            savedState = null;
        }
    }
}

public class MementoPatternExample {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History(textEditor);

        textEditor.write("Hello, ");
        System.out.println("Current Content: " + textEditor.getContent());

        history.save();

        textEditor.write("world!");
        System.out.println("Current Content: " + textEditor.getContent());

        history.undo();
        System.out.println("Content after Undo: " + textEditor.getContent());
    }
}
