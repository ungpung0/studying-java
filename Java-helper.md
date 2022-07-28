<h3>원시 자료형(primitive data type)</h3><hr/>
<p>int, long, double, float, boolean, char 등의 일반적인 literal 값을 사용하는 변수에 사용하는 자료형이다. 주의할 것은 String은 literal 표기가 가능하나 primitive 자료형이 아니라는 것이다.</p>
<p>primitive 자료형은 각자 대응하는 Wrapper 클래스가 존재한다. 값 대신에 객체를 교환할 때 사용하며 객체 중심적 설계에 유리하다.</p>

<h3>String 메소드</h3><hr/>
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

<style>
    h3 
    {
        font-weight: bold;
        margin-top: 5px;
    }

    li 
    {
        font-weight: bold;
    }
</style>