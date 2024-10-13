import java.util.*;
public class CollectionOperations {

    public static void arrayListOps() {
        List<String> arrayList = new ArrayList<>();
        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        
        arrayList.set(1, "Kinnow");
        arrayList.remove("Orange");
        
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("ArrayList using iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("ArrayList using enhanced for loop: ");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("ArrayList using forEach method: ");
        arrayList.forEach(System.out::println);
    }

    public static void linkedListOps() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        
        linkedList.set(1, 25);
        
        linkedList.remove(Integer.valueOf(30));
        
        System.out.println("LinkedList using Iterator:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("LinkedList using enhanced for loop:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        System.out.println("LinkedList using forEach method:");
        linkedList.forEach(System.out::println);
    }

    public static void hashSetOps() {
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Bird");
       
        hashSet.remove("Bird");
        
        System.out.println("HashSet using iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("HashSet using enhanced for loop:");
        for (String animal : hashSet) {
            System.out.println(animal);
        }

        System.out.println("HashSet using forEach method:");
        hashSet.forEach(System.out::println);
    }

    public static void treeSetOps() {
        Set<Integer> treeSet = new TreeSet<>();
        
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        
    
        treeSet.remove(40);
        
        System.out.println("TreeSet using Iterator:");
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("TreeSet using Enhanced For Loop:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        System.out.println("TreeSet using forEach method:");
        treeSet.forEach(System.out::println);
    }

    public static void hashMapOps() {
        Map<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        hashMap.put(2, "Two is updated");
        
        hashMap.remove(3);
        
        System.out.println("HashMap using Iterator:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        System.out.println("HashMap using enhanced For Loop:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }

        System.out.println("HashMap using forEach method:");
        hashMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
public static void hashTableOps() {
    Map<String, Integer> hashtable = new Hashtable<>();
    
    hashtable.put("A", 100);
    hashtable.put("B", 200);
    hashtable.put("C", 300);
    
    hashtable.put("B", 250);
    
    hashtable.remove("C");
    
    System.out.println("Hashtable using Iterator:");
    for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    
    System.out.println("Hashtable using Enhanced For Loop:");
    for (String key : hashtable.keySet()) {
        System.out.println(key + " -> " + hashtable.get(key));
    }

    System.out.println("Hashtable using forEach method:");
    hashtable.forEach((key, value) -> System.out.println(key + " -> " + value));
}

public static void treeMapOps() {
    Map<Integer, String> treeMap = new TreeMap<>();
    
    treeMap.put(1, "Red");
    treeMap.put(3, "Blue");
    treeMap.put(2, "Green");
    
    treeMap.put(2, "Yellow");
    
    treeMap.remove(3);
    
    System.out.println("TreeMap using Iterator:");
    for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
    
    System.out.println("TreeMap using Enhanced For Loop:");
    for (Integer key : treeMap.keySet()) {
        System.out.println(key + " -> " + treeMap.get(key));
    }

    System.out.println("TreeMap using forEach method:");
    treeMap.forEach((key, value) -> System.out.println(key + " -> " + value));
}

public static void stackOps() {
    Stack<String> stack = new Stack<>();
    
    stack.push("First");
    stack.push("Second");
    stack.push("Third");
    
    stack.pop();
    stack.push("Updated Third");
    
    stack.pop();
    
    System.out.println("Stack using Iterator:");
    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    System.out.println("Stack using Enhanced For Loop:");
    for (String item : stack) {
        System.out.println(item);
    }

    System.out.println("Stack using forEach method:");
    stack.forEach(System.out::println);
}

public static void queueOps() {
    Queue<Integer> queue = new LinkedList<>();
    
    
    queue.add(100);
    queue.add(200);
    queue.add(300);
    
    queue.remove();
    queue.add(250);
    
    queue.remove(250);
    
    System.out.println("Queue using Iterator:");
    Iterator<Integer> iterator = queue.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    System.out.println("Queue using Enhanced For Loop:");
    for (Integer num : queue) {
        System.out.println(num);
    }

    System.out.println("Queue using forEach method:");
    queue.forEach(System.out::println);
}

public static void vectorOps() {
    Vector<Double> vector = new Vector<>();
    
    vector.add(10.5);
    vector.add(20.5);
    vector.add(30.5);
    
    vector.set(1, 25.5);
    
    vector.remove(2);
    
    System.out.println("Vector using Iterator:");
    Iterator<Double> iterator = vector.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    System.out.println("Vector using Enhanced For Loop:");
    for (Double num : vector) {
        System.out.println(num);
    }

    System.out.println("Vector using forEach method:");
    vector.forEach(System.out::println);
}

public static void priorityQueueOps() {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    
    priorityQueue.add(15);
    priorityQueue.add(5);
    priorityQueue.add(30);
    
    priorityQueue.poll();
    priorityQueue.add(10);
    
    priorityQueue.remove(30);
    
    System.out.println("PriorityQueue using Iterator:");
    Iterator<Integer> iterator = priorityQueue.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    
    System.out.println("PriorityQueue using Enhanced For Loop:");
    for (Integer num : priorityQueue) {
        System.out.println(num);
    }

    System.out.println("PriorityQueue using forEach method:");
    priorityQueue.forEach(System.out::println);
}
    public static void main(String[] args) {

        System.out.println("=== ArrayList Operations ===");
        arrayListOps();
        
        System.out.println("\n=== LinkedList Operations ===");
        linkedListOps();
        
        System.out.println("\n=== HashSet Operations ===");
        hashSetOps();
        
        System.out.println("\n=== TreeSet Operations ===");
        treeSetOps();
        
        System.out.println("\n=== HashMap Operations ===");
        hashMapOps();
        
        System.out.println("\n=== Hashtable Operations ===");
        hashTableOps();
        
        System.out.println("\n=== TreeMap Operations ===");
        treeMapOps();
        
        System.out.println("\n=== Stack Operations ===");
        stackOps();
        
        System.out.println("\n=== Queue Operations ===");
        queueOps();
        
        System.out.println("\n=== Vector Operations ===");
        vectorOps();
        
        System.out.println("\n=== PriorityQueue Operations ===");
        priorityQueueOps();
    }
}

