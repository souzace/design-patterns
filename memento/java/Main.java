
class MementoPattern {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setContent("Test 1");
		caretaker.push(originator.createState());
		originator.setContent("Test 2");
		caretaker.push(originator.createState());
		originator.setContent("Test 3");
		caretaker.push(originator.createState());
		originator.restore(caretaker.pop());
		originator.restore(caretaker.pop());
		System.out.println(originator.getContent());
	}
}
