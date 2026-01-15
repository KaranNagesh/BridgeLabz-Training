package texteditor;


import java.util.Stack;

public class TextEditor {
	
	//Creating two stack to store undo and redo state
	Stack<String> undoStack = new Stack<>();
	Stack<String> redoStack = new Stack<>();
	
	//Method to perform undo operation
	void undo() {
		if(undoStack.size() <=1) {
			System.out.println("No Undo state available");
			return;
		}
		redoStack.push(undoStack.pop());
	}
	
	//Method to perform redo operation
	void redo() {
		if(redoStack.size() <=1) {
			System.out.println("No Redo state available");
			return;
		}
		undoStack.push(redoStack.pop());
	}
	
	//Method to add text
	void addText(String text) {
		undoStack.push(text);
		redoStack.clear();
	}
	//Method to display text state
	void displaytext() {
		System.out.println(undoStack.peek());
	}
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		
		//Performing Add state, undo and redo operation
		editor.addText("Hello");
		editor.displaytext();
		editor.addText("Hello world");
		editor.displaytext();
		editor.addText("Hello world, Testing");
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.addText("This is the new state");
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.undo();
		editor.displaytext();
		editor.redo();
		editor.displaytext();
		editor.addText("Walking to the end");
		editor.displaytext();
		editor.redo();
		editor.displaytext();
		

	}

}