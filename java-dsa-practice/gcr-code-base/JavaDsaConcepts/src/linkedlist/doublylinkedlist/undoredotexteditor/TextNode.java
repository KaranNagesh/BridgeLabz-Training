package linkedlist.doublylinkedlist.undoredotexteditor;
class TextNode {
    String content;
    TextNode prev;
    TextNode next;

    TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
