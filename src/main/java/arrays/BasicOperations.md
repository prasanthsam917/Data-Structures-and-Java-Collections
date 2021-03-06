## Arrays Basic Opearations

* ### Array to List:
   * Boxing: Primitives needs to be boxed to Objects:
   	 	```java 
        int[] a ={1,2,3,4,5};
        Arrays.stream(a).boxed().collect(Collectors.toList());
        ```
   * Create a List of Integer objects: 
       ```java
       Arrays.asList(1,2,3,4,5);
       ```
       *  Arrays.asList: [Returns a fixed-size list backed by the specified array](https://stackoverflow.com/questions/5755477/java-list-add-unsupportedoperationexception)
       * Thus it does not support any structural modification (i.e. removing or adding elements)
* ### Random: getRandomIndex()
	* Math.random(): Range [min, max] inclusive:
      ```java
      (int)(Math.random() * ((max - min) + 1) + min)
      ```
    * Random class:
      ```java
      Random r = new Random();
      int random = r.nextInt(i); // Range: 0 to i
      ```
* ### Sort Array: O(nLogn)
    * min to max:
      ```java
       Arrays.sort(arr); 
      ```
    * max to min:
      ```java
       Arrays.sort(arr, Collections.reverseOrder()); 
      ```
* ### Compare 2 Arrays:
     ```java
     Arrays.equals(arr1, arr2);
     ```
* ### Set to List:
     ```java
     List<?> list = new ArrayList<?>(set);
     ```
