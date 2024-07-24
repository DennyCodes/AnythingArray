// Main.java

class Main {
    public static void main(String[] args) {
      
      Node<String> testString = new Node<>("HelloWorld");
      
      Node<String> addC = new Node<>("!");
      addC.set("Yeah" + addC.get());
      
      Node[] arr = new Node[5];
      arr[0] = testString;
      arr[1] = addC;
      arr[2] = new Node<Double>(1.4342);
      arr[3] = new Node<Boolean>(true);
      arr[4] = new Node<Integer>(40);
      for (int i = 0; i<arr.length; i++ ) {
        System.out.println(arr[i]);
      }
      
    	//NODE TESTS
      Node<Character> characterNode = new Node<>('A');
      characterNode.set('B');
      characterNode.set('C');
      
      Node<String> stringNode = new Node<>("hello");
      stringNode.set(stringNode.get() + " world");
  
      //ARRAY OF NODES
      Node[] array = new Node[5];
      array[0] = characterNode;
      array[1] = stringNode;
      array[2] = new Node<Boolean>(true);
      array[3] = new Node<Integer>(100);
      array[4] = new Node<Double>(3.1415);
      
      for (int i = 0; i<array.length; i++ ) {
        System.out.println(array[i]);
      }
    }
}