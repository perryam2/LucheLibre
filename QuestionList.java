package LuchaLegend;

public class QuestionList {
	public class Node{
		public Question question;
		public Node next;
		
		public Node(Question question, Node next) {
			this.question = question;
			this.next = next;
		}
		public Node getNext() {
			return next;
		}
		public Question getQuestion() {
			return question;
		}
	}
	public Node head;
	public QuestionList() {
		head = null;
	}
	
	public void add(Question question) {
		this.head = new Node(question, this.head);
	}
	
}
