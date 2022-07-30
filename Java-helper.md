<h2>원시 자료형(primitive data type)</h2><hr/>
<p>int, long, double, float, boolean, char 등의 일반적인 literal 값을 사용하는 변수에 사용하는 자료형이다. 주의할 것은 String은 literal 표기가 가능하나 primitive 자료형이 아니라는 것이다.</p>
<p>primitive 자료형은 각자 대응하는 Wrapper 클래스가 존재한다. 값 대신에 객체를 교환할 때 사용하며 객체 중심적 설계에 유리하다.</p>

<h2>String 메소드</h2><hr/>
<li>equals</li>
<p>equals는 문자열의 일치 여부를 boolean 값으로 반환한다.</p>

```java
String a = "Hello";
String b = "Java";
String c = new String("Hello");
System.out.println(a.equals(b)); // false.
System.out.println(a.equals(c)); // true.
System.out.println(a == c);      // false.
```

<p>== 연산자는 일반적으로 객체를 비교하는 연산자이다. 때문에 String을 비교할 때는 반드시 equals을 사용해야 하는 것이다.</p>

<li>indexOf</li>
<p>indexOf는 문자열에서 특정 문자의 시작 index를 int 값으로 반환한다.</p>

```java
String a = "Hello Java";
System.out.println(a.indexOf("Java")); // 6.
```

<p>Java의 인덱스는 0부터 시작하기 때문에 결과값은 "J"의 6이다.</p>

<li>contains</li>
<p>contains는 문자열에서 특정 문자열의 포함 여부를 boolean 값으로 반환한다.</p>

```java
String a = "Hello Java";
System.out.println(a.contains("Java")); // true.
```

<p>a는 "Java" 문자열을 포함하기 때문에 true를 반환한다.</p>

<li>charAt</li>
<p>charAt은 문자열에서 특정 index의 문자를 반환한다.</p>

```java
String a = "Hello Java";
System.out.println(a.charAt(6)); // "J".
```

<p>a의 7번째 index는 "J"이다.</p>

<li>replaceAll</li>
<p>replaceAll은 문자열의 특정 문자열을 다른 문자열로 교체한다.</p>

```java
String a = "Hello Java";
System.out.println(a.replaceAll("Java", "World")); // "Hello World".
```
<p>"Hello Java"의 "Java"를 "World"로 교체했다.</p>

<li>substring</li>
<p>substring은 문자열의 시작과 끝의 index 사이의 문자를 추출할 때 사용한다.</p>

```java
String a = "Hello Java";
System.out.println(a.substring(0, 5)); // "Hello".
```

<p>0부터 5까지의 문자를 추출했다.</p>

<li>toUpperCase</li>
<p>문자열 전체를 대문자로 변경할 때 사용한다.</p>

```java
String a = "Hello Java";
System.out.println(a.toUpperCase()); // "HELLO JAVA".
System.out.println(a.toLowerCase()); // "hello java".
```

<p>toUpperCase는 대문자, toLowerCase는 소문자로 변경한다.</p>

<li>split</li>
<p>split은 문자열을 특정 구분자로 분리할 때 사용한다.</p>

```java
String a = "a b c d";
String[] result = a.split(" "); // {"a", "b", "c", "d"}.
```

<p>" ", 즉 공백을 구분자로 나누어 배열을 생성했다.</p>

<h3>String 포매팅(formatting)</h3>
<p>문자열의 특정 부분의 값을 동적으로 처리하기 위해 사용한다.</p>

```java
int threeInt = 3, persent = 100;
String threeStr = "three";

System.out.println(String.format("I eat %d apples.", 3)) // "I eat 3 apples."
System.out.println(String.format("I eat %s apples.", "three")) // "I eat three apples."
System.out.println(String.format("%s apples mean %d apples.", threeStr, threeInt)); // "3 apples is three apples." 
System.out.println(String.format("apple is %d%% good for health.", persent)); // "apple is 100% good for health."
```

<p>c언어의 "<b>printf("%d", number)</b>"와 비슷하게 동작하는 String.format 메소드를 사용한다. 파라미터로 값이나 변수를 대입할 수 있다. "%d"와 같은 포매팅 연산자가 존재할 때 "%"를 문자열로 표현하고 싶을 때 반드시 "%%"로 작성해야 한다.</p>

```java
System.out.println(String.format("I eat %d apples.", 3)); // "I eat 3 apples."
System.out.printf("I eat %d apples.", 3); // "I eat 3 apples."
```

<p>String.format은 문자열을 리턴하는데 콘솔 창에 출력하기 위해서 System.out과 함께 사용해야 한다. 이것을 System.out.printf을 활용하여 단축할 수 있다.</p>

<h2>StringBuffer</h2><hr>
<p>StringBuffer는 문자열의 추가와 변경에 주로 사용하는 자료형이다.</p>
<li>append</li>
<p>StringBuffer는 append 메소드로 문자열을 추가할 수 있다.</p>

```java
// StringBuffer의 경우.
StringBuffer stringBuffer = new StringBuffer();
stringBuffer.append("Hello");
stringBuffer.append(" ");
stringBuffer.append("Java.");
String result = stringBuffer.toString();

// String + 의 경우.
result += " hello";
result += " ";
result += "java.";
System.out.println(result); // "Hello Java. hello java."
```

<p>StringBuffer의 append 메소드와 String의 "+" 연산자의 실행 결과는 동일하다. 그러나 StringBuffer 객체는 한 번만 생성되는 반면에, "+" 연산자는 매번 새로운 String 객체를 생성한다. String 자료형은 값을 변경할 수 없는 immutable 객체이기 때문이다.</p>
<p>그렇다면 StringBuffer 객체를 사용하는 것이 권장되는가? 용도에 따라서 다르다. StringBuffer는 일반적으로 String보다 용량과 속도에서 불리하기 때문이다. 때문에 작업이 많을 경우에 StringBuffer를, 작업이 적을 경우 String을 사용하는 것이 좋다.</p>

```java
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Hello");
stringBuilder.append(" ");
stringBuilder.append("Java.");
String result = stringBuilder.toString();
System.out.println(result); // "Hello Java."
```

<p>StringBuilder와 비슷하게 동작하는 자료형으로 StringBuilder가 있다. StringBuilder는 StringBuffer보다 성능이 우수하나 멀티스레드 환경에서 불리하다. 동기화가 불필요한 환경에서 사용하면 좋을 것이다.</p>

<li>insert</li>
<p>insert를 사용하여 특정 index에 원하는 문자열을 삽입한다.</p>

```java
StringBuffer stringBuffer = new StringBuffer();
stringBuffer.append("Hello, Java.");
stringBuffer.insert(0, "Welcome! ");
System.out.println(stringBuffer.toString()); // "Welcome! Hello, Java."
```

<p>insert를 사용하여 첫번째 index에 "Welcome! "을 삽입했다.</p>

<li>substring</li>
<p>String 자료형과 동일하게 사용한다.</p>

```java
StringBuffer stringBuffer = new StringBuffer();
stringBuffer.append("Hello Java.");
System.out.println(stringBuffer.substring(0, 5)); // "Hello"
```

<h2>리스트(List)</h2><hr>
<p>List는 배열의 단점인 정적인 크기를 동적으로 관리하기 위해 고안된 자료형이다. List 자료형에는 ArrayList, Vector, LinkedList 등이 있다.</p>
<li>Vector</li>
<p>Vector는 후술할 ArrayList의 기능에 추가적인 자동 동기화 기능을 갖는다. 즉, 복수 사용자가 공통 자원에 접근하는 멀티스레드 환경에서 사용할 때 유리하다. 그러나 동기화가 불필요한 환경에서 리소스 낭비를 가져올 수 있다.</p>
<li>ArrayList</li>
<p>ArrayList는 배열의 장점인 index를 활용하여 검색에 용이한 자료형이다. 그러나 인덱스를 밀거나 당겨서 삭제와 추가 작업이 이루어지므로, 변화가 잦은 데이터의 경우 성능의 손실을 가져올 수 있다.</p>
<li>LinkedList</li>
<p>ArrayList의 단점을 해결하기 위해 고안된 자료형이다. 연결리스트를 사용하여 요소 사이를 링크로 연결하여 구성된다. 데이터의 삽입, 삭제 작업이 일어날 때 중간 노드의 주소지만 바꾸어주면 되므로 유리하다.</p>

<h2>List 메소드</h2><hr>
<li>add</li>
<p>add는 값을 list에 삽입할 때 사용한다.</p>

```java
ArrayList arrayList = new ArrayList();
arrayList.add("1");
arrayList.add("2");
arrayList.add("3");
```

<li>get</li>
<p>get은 list에서 특정 index의 값을 추출하기 위해 사용한다.</p>

```java
System.out.println(arrayList.get(1));
```

<li>size</li>
<p>ArrayList의 개수를 반환한다.</p>

```java
System.out.println(arrayList.size());
```

<li>contains</li>
<p>contains는 List 안의 항목 존재 여부를 판단하여 boolean값을 반환한다.</p>

```java
System.out.println(arrayList.contains("1"));
```

<li>remove</li>
<p>remove는 List의 해당 객체를 삭제할때 사용한다.</p>

```java
System.out.println(arrayList.remove("1")); // true
System.out.println(arrayList.remove(0));   // "2"
```

<p>remove는 전달되는 파라미터에 따라서 반환값이 다르다. 삭제할 데이터를 전달하면 삭제 결과를 boolean으로 반환한다. 삭제할 index를 전달하면 삭제한 데이터를 반환한다.</p>

<li></li>

<style>
    h2 
    {
        font-weight: bold;
        margin-top: 5px;
    }

    li 
    {
        font-weight: bold;
    }
</style>