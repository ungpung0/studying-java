<h1>Java Description 2장.</h1>

<h2>리터럴</h2>
<p>변수와 필드에서 사용할 수 있는 자료형의 실제 값을 <b>리터럴(literal)</b>이라 한다. 예로 '0, 1, 2, 3'은 정수 리터럴이고, "Hello World!"는 문자열 리터럴이다.</p>

<h2>자료형</h2>
<p>Java의 변수, 필드, 메소드는 정해진 <b>자료형(data type)</b>으로 선언되고, 적용가능한 연산이 결정되며, 이는 <b>기본형(primitive type)</b>과 <b>참조형(reference type)</b>으로 나눌 수 있다.</p>

> <b>기본형(primitive type)</b><br>
> 기본형이란 자료형의 값을 의미하며 정수형, 실수형, 문자형, 논리형 등이 있다.
> <ul>
>   <li><b>'정수형'</b>은 숫자를 표현하는 자료형으로 길이에 따라서 '<b>byte(1)</b>', '<b>short(2)</b>', '<b>int(4)</b>', '<b>long(8)</b>'로 나눈다.</li>
>   <li><b>'실수형'</b>은 소수점이 있는 숫자를 표현하는 자료형으로 '<b>float(4)</b>, '<b>double(8)</b>'로 나뉜다. 또한 '<b>POSITIVE_INFINITY(양의 무한대)</b>', '<b>NEGATIVE_INFINITY(음의 무한대)</b>'와 같은 특별한 리터럴을 가지고 있으므로 연산 중에 오류를 발생시키는 경우가 없다.</li>
>   <li><b>'문자형(char)'</b>은 2byte의 UNICODE를 사용하여 다양한 국가의 문자를 나타낼 수 있다. 예로 'A'는 65의 코드를 사용하며, '한'은 54620의 코드를 사용한다.</li>
>   <li><b>논리형(boolean)</b>은 1byte를 사용하여 참(true), 거짓(false)을 표현하기 위한 자료형이다.</li>
> </ul>
> <b>참조형(reference type)</b><br>
> C언어의 포인터와 같이 메모리 주소를 의미하며 기본형을 제외한 모든 자료형이다. 클래스형 변수, 배열형 변수, 문자열형 변수 등이 여기에 해당된다.

<h2>형변환</h2>
<p>Java는 자료형을 엄격하게 검사하기 때문에 변수와 상수의 값의 형태가 선언된 형태와 일치하지 않을 경우, 오류가 발생하거나 <b>형변환(type conversion)</b>이 일어난다. 이는 <b>묵시적 형변환</b>과 <b>명시적 형변환</b>으로 나눌 수 있다.</p>

> <b>묵시적 형변환</b><br>
> 변수에 다른 자료형의 값을 대입할때 표현 범위안에 속할 경우 자동으로 형변환이 이루어지는데 이를 <b>묵시적 형변환(implicit type conversion)</b>이라 한다.
> ```java
> float number = 5.7;
> double result = number; // float(4) -> double(8).
> ```
> ▲ 묵시적 형변환의 예

> <b>명시적 형변환</b><br>
> 묵시적 형변환이 정상적으로 이루어지지 않을 때, 프로그래머가 수동으로 형변환을 할 수 있는데 이를 <b>명시적 형변환(explicit type conversion)</b>이라 한다.
> ```java
> int number = 3;
> double result = (double)number; // int(4) -> double(8).
> ```
> ▲ 명시적 형변환의 예

<h2>연산자</h2>
<p>Java 프로그래밍의 연산자는 C/C++의 연산자와 거의 일치한다.</p>

> <b>산술 연산자</b>
> <li></li>

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