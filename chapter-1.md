<h2>자바(Java)</h2><hr>
<p>1991년 '썬 마이크로시스템즈(Sun Microsystems)'社에서 가전제품용 소프트웨어의 개발을 위한 프로그래밍 언어 'Oak'를 개발했다. 그러나 다른 회사에 같은 명칭의 상표를 등록한 관계로 커피에서 유래한 'Java'라는 명칭을 채택한다.<br>Java는 이용자의 수가 계속하여 증가하고 있는 프로그래밍 언어이다. 이것은 Java만의 여러 특징 덕분인데 대략적으로 아래와 같다.</p>

- <b>무료 제공</b> : 프로그래밍을 위한 개발 툴이 무료로 제공된다.
- <b>Write Once, Run Everywhere</b> :  대부분의 언어로 작성된 프로그램은 특정 기기나 환경에 맞추어 프로그램을 재작성해야만 했다. 그러나 Java 프로그램은 Java를 지원하는 모든 플랫폼에서 동작한다.
- <b>C/C++와 유사한 구문</b> : Java의 문법체계는 C와 C++ 언어를 참고하여 개발되었기 때문에 경험자는 보다 쉽게 Java를 학습할 수 있다.
- <b>엄격한 형 지정</b> : '정수, 실수, 문자, 문자열' 등의 데이터 형을 엄격하게 관리한다. 최종적으로 신뢰성이 높은 프로그램을 개발할 수 있다.
- <b>객체지향 프로그래밍</b> : 클래스를 기반으로 캡슐화, 상속, 다형성과 같은 기술을 지원한다.
- <b>다양한 라이브러리</b> : 문자 및 도형 표시, 네트워크 제어 등의 프로그램의 모든 부분을 전부 개발하는 것은 불가능할 뿐더러 비효율적이다. Java의 기본 API 뿐만 아니라 다양한 개발자들이 미리 만들어놓은 라이브러리를 활용하여 효율적으로 개발할 수 있다.
- <b>가비지 콜렉션</b> : 기존의 프로그래밍 언어에서는 더이상 필요없는 객체의 해제를 개발자가 직접 수행해야만 했다. Java는 객체의 해제를 자동으로 수행하기 때문에 관리가 용이하다.
- <b>예외 처리</b> : 예상치 못한 에러 등의 예외 상황을 처리하여 비정상적인 종료를 방지할 수 있다.
- <b>병행 처리</b> : 하나의 프로그램에서 동시에 다양한 연산을 수행할 수 있다.
- <b>패키지 분류</b> : 일반적인 파일들을 관리할 때 사용하는 디렉터리와 비슷하게, 클래스를 패키지를 통해 분류하여 관리할 수 있다.

<h3>소스(Source)</h3>
<p>모든 프로그램은 우리가 일상에서 사용하는 고급 언어로 작성된다. 이런 프로그램을 소스 프로그램(Source Program)이라고 하며, 소스 프로그램을 저장한 파일을 소스 파일(Source File)이라고 한다. 소스파일의 이름은 클래스명에 '.java' 확장자를 붙여서 만들어진다.</p>

<h3>컴파일(Compile)</h3>
<p>컴퓨터는 고급언어를 바로 이해하여 실행할 수 없다. 때문에 고급언어를 저급언어로 변환하는 단계를 밟아야 하는데 이것을 컴파일(Compile)이라 한다. 자바에서는 javac 명령어로 컴파일을 수행한다.<br>컴파일이 완료되면 '.class' 확장자를 가진 클래스 파일(Class File)이 생성된다. 클래스 파일은 바이트 코드(Byte Code)로 이루어진다.</p>

<h3>바이트 코드(Bytecode)</h3>
<p>자바 가상 머신(</p>

<h3>실행(Execution)</h3>
<p>java 명령어를 통해 클래스 파일에서 클래스를 읽고 실행할 수 있다. 주의할 것은 실행할 파일을 입력할 때 확장자(.class)를 제외해야 한다는 것이다.</p>

```java
// Compile (Hello.java -> Hello.class)
javac Hello.java
// Execute (Hello.class -> GO!)
java Hello
```

<h3>주석(Comment)</h3>
<p>주석은 실행에 영향을 미치지 않기 때문에 소스 파일을 읽는 다른 개발자에게 전달하고 싶은 내용을 입력할 때 사용할 때 사용한다. Java의 사용할 수 있는 주석은 세 가지가 있다.</p>

- <b>전통적인 주석(Traditional Comment)</b> : 주석을 '/* */' 사이에 입력한다. 여러 줄에 걸친 주석을 입력할 때 주로 사용한다. '전통적(Traditional)'이란 명칭은 1970년대부터 사용했기에 붙었다.
- <b>문서화 주석(Documentation Comment)</b> : 주석을 '/** */' 사이에 입력한다. 전통적인 주석과 비슷한데 추가적으로 프로그램 사양서가 되는 문서를 생성할 수 있다.
- <b>한줄 주석(End of Line Comment)</b> : 주석을 '//' 뒤에 입력한다. 여러 줄이 아닌 한 줄에 짧은 주석을 입력할 때 사용한다.

```java
/*
    1) Traditional Comment
*/

/*
*   2) Documentation Comment
* */

//  3) End of Line Comment
```

<h2>프로그램의 구조</h2><hr>
<p>Java의 기본적인 구조의 예는 다음과 같다.</p>

```java
class Hello {                                           // Class Declaration. (Hello)
    public static void main(String[] args) {            // Main Method.
        System.out.println("MY FIRST JAVA PROGRAM.");   // Print Statement.
        System.out.println("PRINTING TO CONSOLE.");
    }
}
```

- <b>클래스(Class)</b> : 클래스는 프로그램의 골격으로 해당한다. 첫 문자는 대문자로 쓰는 것이 원칙이며 소스 파일명과 클래스 명은 동일해야 정상적으로 동작한다. 
- <b>메소드(Method)</b> : 수학의 함수와 비슷한 개념으로 행동을 정의하는 것이 메소드이다.
- <b>문(Statement)</b> : 문은 프로그램 실행의 단위이고, 프로그램을 실행하면 메소드 안의 문이 순차적으로 실행된다.
- <b>리터럴(Literal)</b> : 리터럴은 '문자 그대로의' 의미이다. '정수, 부동소수점, 문자, 문자열' 등의 리터럴이 있다.
- <b>스트림(Stream)</b> : 콘솔 화면을 포함하여 입출력에는 스트림을 사용한다. 예를 들어 'System.out'은 콘솔 화면과 결합된 '표준 출력 스트림(standard output stream)'이다.

```java
class HowAreYou {
    public static void main(String[] args) {
        System.out.println("HELLO" + "HOW ARE YOU?" + "\n");
    }
}
```

- <b>문자열 연결</b> : Java에서 문자열 리터럴은 '+'를 사용하여 연결할 수 있다.
- <b>줄 바꿈</b> : 문자열 리터럴에서 줄 바꿈을 '\n'을 통해 사용할 수 있다.

<h2>JRE와 JDK</h2><hr>

<h3>JDK(Java Development Kit)</h3>
<p>JDK는 컴파일러, 개발 도구, JRE 등을 포함하고 있는 프로그램이다.</p>

<h3>JRE(Java Runtime Envelopment)</h3>
<p>JRE는 Java 실행 환경으로서 JDK에 포함되어 있다. 크게 JVM(Java Virtual Machine), 라이브러리로 구성된다. JVM은 Java 프로그램의 실행에 필요한 가상 머신이고, 클래스 파일 내의 명령어를 해석하며 작동한다.</p>

