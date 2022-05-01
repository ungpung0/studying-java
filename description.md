<h1>Java Description</h1>
<h2>Java 정의</h2>
<p>Java는 선 마이크로시스템즈(Sun Microsystems)社에서 개발된 <b>객체지향 프로그래밍 언어(OOP: Object-Oriented Programming)</b>이다. 기존의 'Windows, Unix, Linux' 등의 플랫폼에 구애받던 다른 프로그래밍 언어와 달리, 독립적인 실행환경인 <b>자바 플랫폼(Java Platform)</b>을 통해 프로그램을 실행할 수 있다.</p>

<h2>Java 특징</h2>
<ul>
    <li><b>별도의 플랫폼 지원.</b> 별도의 Java 플랫폼을 통해 운영체제의 제한을 받지않고 실행할 수 있다.</li>
    <li><b>객체 지향 언어.</b> 특정 역할을 수행하는 객체들로 구성된 프로그램을 완성하는 기법으로 캡슐화, 상속성, 다형성 등의 개념을 지원한다.</li>
    <li><b>다양한 개발 기능.</b> Java는 콘솔 프로그램, 웹 어플리케이션, 모바일 어플리케이션 등의 다양한 프로그램을 개발을 지원한다.</li>
    <li><b>예외 처리 기능.</b> 프로그램의 실행 도중 오류가 발생하더라도 대안을 제시할 수 있는 예외 처리 기능을 지원한다.</li>
    <li><b>멀티 스레딩 지원.</b> 하나의 프로그램의 병렬처리를 지원하는 멀티 스레드를 라이브러리로 쉽게 구현할 수 있다.</li>
    <li><b>가비지 콜렉터.</b> Java는 가비지 콜렉터(Garbage Collector)로 불필요한 객체를 제거하는 등의 메모리 공간을 자동으로 관리하여 개발자의 생산성을 올릴 수 있다.</li>
    <li><b>동적 로딩.</b> 애플리케이션을 실행할 때 모든 객체를 생성하지 않고 적절한 시점에 동적으로 생성한다.</li>
</ul>

<h2>Java 프로그램</h2>
<p>개발자가 Java 언어로 작성한 '.java' 확장자의 소스 파일을 컴파일하면 'class' 확장자의 파일이 생성되는데, 이를 Java 프로그램이라 한다. 이 파일은 실행 방식에 따라서 <b>애플리케이션(Application)</b>과 <b>애플릿(Applet)</b> 두 가지로 나눌 수 있다.</p>

> <b>Java 애플리케이션</b><br>
> Java 언어로 작성되어 컴파일된 후에 Java 플랫폼에서 바로 실행하는 것이 가능한 일반적인 형태의 프로그램을 말한다.

> <b>Java 애플릿</b><br>
> Java 언어로 작성되어 컴파일된 후에 HTML 기반의 웹페이지에 포함되어 웹 브라우저를 통해 실행되는 Java 프로그램을 말한다. 이는 사용자가 브라우저를 이용하여 요청할 때, 애플릿 코드가 클라이언트 PC에 저장되었다가 브라우저에서 실행된다.

<h2>Java 플랫폼</h2>
<p>C와 같은 언어로 작성된 파일의 경우에는 운영체제에서 바로 실행된다. 따라서 운영체제에 맞추어 프로그램을 개발할 필요가 있다. 반면에 Java 언어로 작성된 프로그램은 전용 플랫폼을 거쳐서 실행되기 때문에 올바른 환경만 구성한다면 운영체제와 무관하게 실행하는 것이 가능하다. Java 플랫폼은 'J2SE, J2EE, J2ME' 등이 있다.</p>

> <b>J2SE(Java 2 Standard Edition)</b><br>
> 가장 보편적으로 사용되는 Java API로서 일반 Java 애플리케이션의 개발을 위한 용도로 사용되고 있다.

> <b>J2EE(Java 2 Enterprise Edition)</b><br>
> 서버를 개발하기 위한 플랫폼으로서 JSP, Servlet과 같은 기능들을 지원하며, 주로 WAS(Web Application Service) 개발에 사용되고 있다.

> <b>J2ME(Java 2 Micro Edition)</b><br>
> 자원이 제한되어 있는 모바일 환경에서 Java 언어를 지원하기 위해 만들어진 플랫폼이다. 주로 임베디드 시스템 개발에 사용되고 있다.

<p>
    Java 플랫폼은 크게 Java 가상머신(JVM, Java Virtual Machine)과 Java API(Application Programming Interface)로 구성된다. 또한 Java 소스 코드의 컴파일 및 실행을 위해 필요한 'Java 컴파일러, JVM, API'를 묶어서 <b>Java SDK(Java Software Development Kit)</b>으로 부른다.
</p>

> <b>JVM(Java Virtual Machine)</b><br>
> JVM은 Java 프로그램을 실행할 때 필요한 구동 엔진을 의미한다. JVM의 대표적인 기능으로 <b>가비지 콜렉션(Garbage Collection)</b>과 같은 메모리 정리 기능이 있다.

> <b>Java API(Application Programming Interface)</b><br>
> Java 프로그램을 실행할 때 필요한 라이브러리로, Java 플랫폼에 기본적으로 포함되어 있는 기본 API와 별도로 설치하여 사용하는 확장 API로 구분할 수 있다. 예는 아래와 같다.
> <ul>
>   <li><b>java.util</b>: 문자열과 자료형을 제어할 때 필요한 유틸리티 클래스를 모아놓은 라이브러리.</li>
>   <li><b>java.lang</b>: Java 프로그래밍에 관련한 가장 기본적인 클래스를 모아 놓은 라이브러리.</li>
>   <li><b>java.swing</b>: 일관적인 GUI(Graphic User Interface)를 구현하기 위한 라이브러리.</li>
> </ul>

<h2>객체지향 프로그래밍</h2>
<p>객체 지향 프로그래밍(OOP, Object-Oriented Programming)에서 <b>객체(object)</b>는 현실에서의 사물과 같은 개념으로 상태와 동작을 정의한다. 개발자는 객체를 사용하여</p>

<h2>코드 구성 요소</h2>

> <b>주석(Comments)</b><br>
> 주석은 개발자가 소스 코드의 설명을 위해 사용하는 문장으로 컴파일에서 제외되어 프로그램의 작동과 관계없이 작성하는 것이 가능하다.
> - <b>/* ... */</b>: 여러 줄에 걸쳐서 작성하는 주석이다.
> - <b>/** ... **/</b>: 위와 마찬가지로 여러 줄에 걸쳐서 작성하는 주석이다. 'javadoc' 유틸리티를 사용하면 해당 소스의 메뉴얼을 생성할 수 있다.
> - <b>//</b>: 한 줄 주석이다.

> <b>클래스(Class)</b><br>
> 모든 Java 프로그램은 하나 이상의 클래스를 갖고 있다. 예시는 아래와 같다.
> ```java
> class 클래스명 {
>   // 내용.
> }
> ```
> 위의 소스코드를 컴파일하면 '<b>클래스명.class</b>'이란 이름의 클래스 파일이 생성된다. 즉, 클래스 파일은 소스 코드명이 아닌 소스 코드 내부의 클래스명으로 생성되는 것을 알 수 있다.

> <b>메소드(Method)</b><br>
> Java에서 메소드는 클래스 안에서만 정의할 수 있으며, '<b>main()</b>' 메소드는 우선 순위가 가장 높은 메소드를 의미한다.
> ```java
> public static void main(String[] args) {
>   // 내용.
> }
> ```
> 반드시 위와 같이 작성되어야 정상적으로 작동한다.

```java
/**
 * 'Hello World' example.
**/
public class HelloApplication {
    public static void main(String[] args) { // Main Method.
        // Print 'Hello World'.
        System.out.print("Hello World");
    }
}
```
<p>△Hello World를 출력하는 Java 애플리케이션 소스 코드 예제.</p>



<style>
    h2 {
        margin-top: 15px;
        margin-bottom: 5px;
    }
    li {
        margin-bottom: 2px;
    }
    p {
        margin-bottom: 10px;
    }
</style>