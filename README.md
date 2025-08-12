# Java 개인 공부 정리

## 💡 클래스가 필요한 이유(class1 패키지 참고)

* **데이터 관리의 복잡성 해결:**
    * 객체(데이터 덩어리)가 추가되거나 변경될 때마다 관련된 변수들을 일일이 추가/수정하는 것은 매우 번거롭습니다.
    * 데이터의 양이 많아지면 유지보수가 어려워지고, 오류 발생 가능성이 커집니다.
    * 배열로 관리하는 것도 한계가 있으며, 각 데이터의 의미를 명확히 표현하기 어렵습니다.

* **데이터를 하나로 묶어 체계적으로 관리:**
    * 이러한 한계를 극복하기 위해, 서로 연관된 데이터(속성)와 그 데이터를 다루는 기능(메소드)을 **하나의 묶음**으로 정의하고 관리하기 위해 클래스를 사용합니다.
    * **예시:** `학생`이라는 클래스 안에 `이름`, `성적`, `나이`와 같은 속성들을 함께 정의하여, 학생 한 명에 대한 정보를 하나의 단위로 다룰 수 있게 합니다. 이는 코드의 **유지보수성**을 크게
      향상시킵니다.

* **클래스는 '설계도'와 같은 역할:**
    * 클래스 자체는 실제 존재하는 것이 아니라, 객체를 어떻게 만들 것인지에 대한 **정의 또는 설계도**와 같습니다.

---

### 📝 멤버 변수 (필드)

* **개념:** 클래스 내부에 정의된 변수들을 지칭하며, 일반적으로 **필드(Field)** 라고도 합니다.
* **역할:** 클래스를 통해 만들어질 객체(인스턴스)가 가질 **데이터(속성)** 를 정의합니다.
* **타입의 확장:** `int`(정수), `String`(문자열)과 같이 기본적으로 제공되는 데이터 타입 외에, 개발자가 직접 새로운 데이터 타입(`학생`, `자동차` 등)을 정의하고 싶을 때 **클래스를 만드는
  것**입니다.

---

### 🏛️ 객체(Object) / 인스턴스(Instance)

* **개념:** 클래스(설계도)를 기반으로 **메모리(컴퓨터의 작업 공간)에 실제로 만들어진 실체**를 '객체' 또는 '인스턴스'라고 합니다.
* **생산물:** 클래스가 붕어빵 틀이라면, 객체/인스턴스는 그 틀로 찍어낸 **실제 붕어빵** 하나하나를 의미합니다. 각 인스턴스는 클래스에 정의된 속성들을 가지며, 독립적으로 존재하고 데이터를 가질 수
  있습니다.

* **객체와 인스턴스 뉘앙스 차이:**
    * 객체와 인스턴스는 비슷한 의미로 사용되지만, '인스턴스'는 **어떤 클래스로부터 만들어진 객체인지**를 명확히 지칭할 때 사용됩니다.
    * **예시:** `student1`, `student2`는 각각 하나의 객체이며, 동시에 `Student` 클래스로부터 만들어진 인스턴스라고 설명할 수 있습니다.
    * 실제 개발에서는 두 용어를 크게 구분하지 않고 혼용하여 사용하는 경우가 많습니다.

* **객체 생성: `new 클래스명()` 사용**
    * `new Student()`는 `Student` 클래스 정보를 기반으로 새로운 객체를 생성하라는 명령어입니다.
    * 이 명령이 실행되면 자바는 메모리에 실제 `Student` 객체를 위한 공간(멤버 변수에 따라 필요한 메모리)을 확보합니다.

* **객체 참조값 (메모리 주소):**
    * 객체가 생성되면 자바는 해당 객체가 메모리 어딘가에 있음을 나타내는 **참조값(Reference Value) 또는 주소**를 반환해줍니다.
    * `new Student()`가 반환하는 값은 `x001`과 같은 가상의 주소 값입니다.
    * 이 참조값을 변수(예: `Student s1 = new Student();` 에서 `s1`)에 저장함으로써, 우리는 해당 변수를 통해 메모리에 있는 실제 객체에 접근하고 사용할 수 있게 됩니다.
    * **출력 예시:** `Student@2f4d3709`와 같이 `클래스명@참조값(해시코드)` 형태로 나타나는 것이 바로 이 객체의 참조값입니다.

* **객체 사용:**
    * 객체 내부에 있는 멤버 변수(필드)나 메소드에 접근하여 사용하려면, **참조값을 가지고 있는 변수 뒤에 마침표(`.`)를 붙여서** 접근합니다.
    * **예시:** `student1.name`, `student1.score`, `student1.calculateAverage()`와 같은 형태로 사용합니다.

---

### 📚 배열을 사용한 객체 관리

* **목적:** 배열을 사용하면 동일한 `클래스` 타입의 여러 객체(인스턴스)들을 **연속된 데이터 구조로 묶어서** 편리하게 관리할 수 있습니다.
* **참조값 저장:** 배열의 각 항목(요소)도 변수와 마찬가지로 객체의 **참조값을 저장**합니다.
* **객체 접근:** 배열에 저장된 참조값을 통해 `. (점)` 연산자를 사용하여 실제 메모리상의 객체에 접근하고, 그 객체의 멤버 변수나 메소드를 호출할 수 있습니다.

---

### 🔑 자바에서의 대입 (할당) 연산자 `=`

* **값의 복사 원칙:** 자바에서 대입 연산자 `=`는 항상 **변수에 들어 있는 '값'을 복사해서 전달**합니다.
* **기본형(Primitive Type) 변수의 대입:** `int a = 10; int b = a;` 와 같이 기본형 변수를 대입할 때는 실제 값(10)이 복사됩니다.
* **참조형(Reference Type) 변수의 대입 (중요):**
    * 객체(인스턴스)를 다루는 참조형 변수를 대입할 때는 **객체 자체가 복사되는 것이 아니라, 객체의 '참조값(메모리 주소)'이 복사됩니다.**
    * **예시:** `Student s2 = s1;` 이라고 한다면, `s1`이 가지고 있던 `Student` 객체의 참조값(예: `x001`)이 `s2`에도 그대로 복사됩니다.
    * 결과적으로 `s1`과 `s2`는 **동일한 메모리 주소에 있는 하나의 인스턴스를 함께 참조하게 됩니다.**
    * **주의:** 기존 인스턴스 자체는 복사되지 않고, 그 인스턴스를 가리키는 참조값만 복사되므로, `s1`을 통해 객체의 내용을 변경하면 `s2`를 통해 접근했을 때도 변경된 내용이 보입니다.

---

### 🔁 객체 배열 반복 (Iteration) 및 `iter` 단축키

* **For문으로 객체 배열 출력/처리:**
    * 배열에 저장된 객체들을 순회하며 각 객체의 데이터를 출력하거나 특정 작업을 수행할 때 `for` 문을 사용합니다.
    * **향상된 for문 (Enhanced For Loop) 사용:** 객체 배열의 모든 요소를 간결하게 순회할 수 있어 편리합니다.
        ```java
        // 예시: Student 배열 students를 순회
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 점수: " + s.score);
        }

* **IntelliJ IDEA `iter` 단축키:**
    * 인텔리제이에서 배열이나 컬렉션을 향상된 `for` 문으로 빠르게 선언하고 싶을 때 사용하는 Live Template 단축키입니다.
    * 배열 또는 컬렉션 변수 뒤에 `.iter`를 입력하고 `Tab` 키를 누르면 자동으로 향상된 `for` 문 구조를 생성해 줍니다.
    * **사용 예시:**
        1. `Student[] students = new Student[3];` (배열 선언)
        2. `students.iter` 입력 후 `Tab` 키 누르기
        3. 결과: `for (Student student : students) { ... }`

## 📌 기본형 vs 참조형 (Java 기준)

---

### ✅ 1. 기본 개념

| 구분     | 기본형 (Primitive Type)         | 참조형 (Reference Type)        |
|--------|------------------------------|-----------------------------|
| 저장 내용  | 실제 값                         | 객체의 주소값                     |
| 예시     | int, long, double, boolean 등 | String, int[], 사용자 정의 클래스 등 |
| 메모리 구조 | 스택(Stack)에 값 저장              | 스택에 참조값, 힙(Heap)에 실제 객체 저장  |
| 사용 방식  | 변수에 직접 값을 저장                 | 변수에 객체의 메모리 주소를 저장          |
| 접근 방식  | 변수 자체로 값 사용                  | 주소를 통해 접근 (ex: data.value)  |
| 명명 규칙  | 소문자로 시작                      | 보통 대문자로 시작 (클래스명이므로)        |

---

### ✅ 2. 변수 대입 차이

```java
// 기본형 예시
int a = 10;
int b = a;  // 값 자체가 복사됨 (a와 b는 독립적)

// 참조형 예시
Data dataA = new Data();
dataA.value =10;
Data dataB = dataA;  // 주소값이 복사됨 (같은 객체를 참조)
dataB.value =20;
// dataA.value도 20이 됨
```

---

## ✅ 3. 메서드 호출 시 동작

### 📌 기본형은 값 복사 (Call by Value)

```java
void changePrimitive(int x) {
    x = 20;
}

int a = 10;

changePrimitive(a);
// a는 여전히 10
```

### 📌 참조형은 주소값 복사 (Call by Reference처럼 동작)

```java
void changeReference(Data dataX) {
    dataX.value = 20;
}

Data dataA = new Data();
dataA.value =10;

changeReference(dataA);
// dataA.value는 20으로 변경됨
```

---

## ✅ 4. null과 NullPointerException

- 참조형 변수는 **아직 객체를 참조하지 않을 경우 null**로 초기화할 수 있음
- null은 아무런 주소도 가리키지 않는다는 뜻
- null 상태에서 객체에 접근하면 `NullPointerException` 발생

```java
Data data = null;
data.value =10;  // 예외 발생! (주소가 없기 때문)
```

- 사용되지 않는 참조형 객체는 **JVM의 가비지 컬렉터(GC)** 가 자동으로 메모리에서 제거

---

## 📌 절차 지향 프로그래밍 vs 객체 지향 프로그래밍(oop 패키지 참고)

**프로그래밍 패러다임**은 프로그램을 구조화하는 방식에 대한 접근법입니다.  
절차 지향과 객체 지향은 크게 대별되는 두 가지 주요 패러다임입니다.

---

### 1. 절차 지향 프로그래밍 (Procedural Programming)

절차 지향 프로그래밍은 **프로그램의 흐름을 순차적으로 처리**하는 방식에 중점을 둡니다.  
→ "**어떻게(How to)** 문제를 해결할 것인가?"에 초점

#### ✅ 특징

- **데이터와 기능의 분리**
    - 데이터(변수)와 이를 처리하는 기능(함수)이 별도로 정의됨
    - 프로그램은 이러한 함수들을 **순서대로 호출**하며 작업 수행

- **모듈화**
    - 반복되는 작업을 함수로 묶어 **코드의 재사용성과 가독성 향상**

#### ❌ 한계

- **유지보수의 어려움**
    - 데이터 구조가 변경되면 이를 사용하는 함수들도 함께 수정해야 함
    - 대규모 프로젝트에서 **수정의 영향 범위 파악이 어려움**

---

### 2. 객체 지향 프로그래밍 (Object-Oriented Programming, OOP)

객체 지향 프로그래밍은 **현실 세계의 사물**을 '객체(Object)'로 보고,  
객체들 간의 **상호작용을 중심으로 프로그래밍**하는 방식입니다.  
→ "**무엇을(What to)** 다룰 것인가?"에 초점

#### ✅ 특징

- **데이터와 기능의 결합 (캡슐화)**
    - 데이터(속성)와 기능(메서드)을 **클래스(Class)** 내에 함께 정의
    - 하나의 **객체 단위로 묶여 관리**

- **캡슐화(Encapsulation)**
    - 외부는 객체의 내부 구현을 몰라도 됨
    - 객체가 제공하는 메서드만 사용하면 됨
    - **내부 구현을 숨겨 복잡성 감소 + 유지보수 용이**

- **재사용성과 확장성**
    - 잘 정의된 클래스는 **재사용 가능**
    - **상속, 다형성**을 통해 프로그램 구조를 유연하게 확장 가능

---

### ✅ 비교 요약

| 항목       | 절차 지향 프로그래밍          | 객체 지향 프로그래밍          |
|----------|----------------------|----------------------|
| 중심 개념    | 함수 (Function) 중심     | 객체 (Object) 중심       |
| 설계 관점    | **어떻게(How)** 해결할 것인가 | **무엇을(What)** 다룰 것인가 |
| 구조       | 데이터와 기능 분리           | 데이터와 기능 결합 (캡슐화)     |
| 유지보수     | 구조 변경 시 영향 범위 큼      | 변경이 객체 내부로 한정되어 쉬움   |
| 재사용성/확장성 | 낮음                   | 높음 (상속, 다형성 등 지원)    |

## 📌 생성자(Constructor)와 this 키워드 -> constructor 패키지 참고

### ✅ this 사용 이유

- **this** 키워드는 현재 객체를 참조하는 데 사용됩니다.
- 생성자에서 매개변수와 멤버 변수가 같은 이름을 가질 때, this를 사용하여 멤버 변수를 명확히 구분할 수 있습니다.
- 예를 들어, 생성자에서 매개변수로 받은 값을 멤버 변수에 할당할 때 this를 사용하지 않으면, 매개변수 값이 멤버 변수에 할당되지 않습니다.
- 근데 매개변수명과 멤버 변수명이 다를 경우에는 this를 사용하지 않아도 됩니다.(생략이 되어 있는 상태)

```java
public class Student {
    String name;
    int score;

    // 생성자
    public Student(String name, int score) {
        this.name = name;  // this를 사용하여 멤버 변수와 매개변수 구분
        this.score = score;
    }

    // 메소드
    public void displayInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }
}
```

---

### ✅ 생성자는 클래스 이름과 동일하게 정의되며, 객체가 생성될 때 자동으로 호출됩니다.

- 생성자는 객체의 초기 상태를 설정하는 데 사용됩니다.
- 생성자는 반환 타입이 없으며, void도 사용하지 않습니다.
- 첫 줄에 `this` 키워드를 사용하여 현재 객체를 참조할 수 있습니다.

---

### ✅ 생성자의 장점

- **초기화 코드의 일관성**: 객체가 생성될 때 항상 필요한 초기화 작업을 수행할 수 있습니다.
- **객체 생성 시 필수 데이터 설정**: 객체가 생성될 때 필요한 데이터를 반드시 제공하도록 강제할 수 있습니다.
- **코드 가독성 향상**: 생성자 이름이 클래스 이름과 동일하므로, 객체 생성 시 어떤 클래스의 인스턴스를 만드는지 명확하게 알 수 있습니다.

---

### ✅ 기본 생성자

- 기본 생성자는 매개변수가 없는 생성자로, 클래스에 명시적으로 정의하지 않으면 자바 컴파일러가 자동으로 생성합니다.
- 기본 생성자는 객체를 생성할 때 아무런 초기화 작업도 수행하지 않습니다.
- 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.

```java
public class Student {
    String name;
    int score;

    // 기본 생성자
    public Student() {
        this.name = "Unknown";  // 기본값 설정
        this.score = 0;         // 기본값 설정
    }
    // 매개변수가 있는 생성자

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 메소드
    public void displayInfo() {
        System.out.println("이름: " + name + ", 점수: " + score
        );
    }
}
  ```

---

### ✅ 생성자 오버로딩

- 생성자 오버로딩은 같은 클래스 내에서 매개변수의 타입, 개수, 순서가 다른 여러 생성자를 정의하는 것입니다.
- 이를 통해 객체를 다양한 방식으로 초기화할 수 있습니다.
    - 예를 들어, 매개변수가 없는 기본 생성자와 매개변수가 있는 생성자를 함께 정의할 수 있습니다.
    - 이렇게 하면 객체를 생성할 때 필요한 정보에 따라 적절한 생성자를 선택할 수 있습니다.
    - 생성자 오버로딩은 코드의 유연성과 가독성을 높이는 데 도움이 됩니다.
      ```java
        public class Student {
            String name;
            int score;
            // 기본 생성자
            public Student() {
      
                this.name = "Unknown";  // 기본값 설정
                this.score = 0;         // 기본값 설정
            }
              // 매개변수가 있는 생성자 
              public Student(String name, int score) {
                  this.name = name;
                  this.score = score;
              }     
              // 또 다른 매개변수가 있는 생성자
        
              public Student(String name) {
                  this.name = name;
                  this.score = 0; // 기본값 설정
              }
              // 메소드
              public void displayInfo() {
                  System.out.println("이름: " + name + ", 점수: " + score);
              }
          }
        ```

      ---

### ✅ 생성자와 메소드의 차이점

| 항목    | 생성자 (Constructor)         | 메소드 (Method)            |
|-------|---------------------------|-------------------------|
| 이름    | 클래스 이름과 동일                | 임의의 이름 가능               |
| 반환 타입 | 없음 (void 사용하지 않음)         | 반환 타입 지정 가능             
| 매개변수  | 매개변수 가질 수 있음              | 매개변수 가질 수 있음            |      
| 호출 시점 | 객체 생성 시 자동 호출             | 명시적으로 호출해야 함            |     
| 목적    | 객체 초기화                    | 특정 작업 수행                |
| 사용 예시 | `new Student("John", 90)` | `student.displayInfo()` |             

---

## 💡패키지(Package) -> package 패키지 참고

* **패키지(Package)** 는 자바 클래스들을 그룹화하여 관리하는 방법입니다.

- 같은 패키지에 속한 클래스는 public이 아니어도 서로 접근할 수 있습니다.
- 다른 패키지의 클래스는 import를 통해 접근해야 합니다.
- import \*를 사용하면 해당 패키지의 모든 클래스를 한 번에 가져올 수 있습니다.
- 만약 클래스 이름이 같아도 패키지 이름이 다르면 충돌하지 않습니다.

---

### 📦 패키지 사용 예시

```java
package com.example.myapp; // 패키지 선언

import java.util.ArrayList; // 외부 패키지 클래스 가져오기
import java.util.*; // 모든 클래스를 가져오기

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // ArrayList 사용
        list.add("Hello");
        System.out.println(list);
    }
}
```

---

### 📌 패키지 규칙

1.패키지의 이름과 위치는 디렉토리 구조와 일치해야 합니다.

2.패키지 이름은 소문자로 작성하는 것이 일반적입니다.

3.패키지 이름의 앞 부분에는 일반적으로 회사의 도메인을 거꾸로 사용한다.

4.패키지가 계층 구조를 가진다고 해도 모든 패키지는 서로 다른 패키지입니다.

---

### 📌 패키지 활용

> 서로 관련된 클래스는 하나의 패키지에 모으고 관련이 적은 클래스는 다른 패키지로 분리하는 것이 좋다.

---

## 접근제어자(access 패키지 참고)

접근제어자는 클래스, 변수, 메소드 등의 접근 범위를 제어하는 키워드입니다.
클래스를 외부로 노출시키지 않거나, 특정 클래스에서만 접근할 수 있도록 제한할 수 있습니다.

### ✅ 접근제어자 종류

| 접근제어자     | 설명                                 | 사용 예시                               |
|-----------|------------------------------------|-------------------------------------|
| public    | 모든 클래스에서 접근 가능                     | `public class MyClass { ... }       
| protected | 같은 패키지 내 또는 상속받은 클래스에서 접근 가능       | `protected void myMethod() { ... }` |
| private   | 같은 클래스 내에서만 접근 가능                  | `private int myVariable;            
| default   | 같은 패키지 내에서만 접근 가능 (접근제어자 생략 시 기본값) | `class MyClass { ... }`             |

### ✅ 접근제어자 사용 예시

```java
package com.example.accesscontrol;

public class MyClass {
    public int publicVar;          // 모든 클래스에서 접근 가능
    protected int protectedVar;    // 같은 패키지 또는 상속받은 클래스에서 접근 가능
    private int privateVar;        // 같은 클래스 내에서만 접근 가능
    int defaultVar;                // 같은 패키지 내에서만 접근 가능 (default)

    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }
}

```

---

### ✅ 접근제어자 사용 - 클래스 레벨

- 클래스 레벌의 접근 제어자는 public과 default(생략)만 사용 가능합니다.
- protected와 private는 클래스 레벨에서 사용할 수 없습니다.
- pulic 클래스는 파일명과 같아야 합니다.
- public 클래스는 하나만 존재할 수 있습니다.
- default 클래스는 파일명과 관계없이 같은 패키지 내에서만 사용됩니다.

---

### ✅ 클래스 레벨 예시

```java
package com.example.accesscontrol;

public class PublicClass { // public
    // public 클래스는 파일명과 같아야 합니다.
}
package com.example.accesscontrol;

class DefaultClass { // default
    // default 클래스는 파일명과 관계없이 같은 패키지 내에서만 사용됩니다
}
```

---

### 😊 캡슐화

캡슐화는 객체 지향 프로그래밍의 핵심 개념 중 하나로, 데이터와 메소드를 하나의 단위로 묶고, 외부에서 직접 접근하지 못하도록 제한하는 것입니다.
> **데이터 보호**: 클래스 내부의 속성(데이터)를 외부에서 직접 수정하지 못하도록 보호하고 필요한 기능만 접근하게 합니다.
---

### 😁 캡슐화 예시

```java
package com.example.encapsulation;

public class Person {
    private String name; // private 변수로 외부에서 직접 접근 불가
    private int age;     // private 변수로 외부에서 직접 접근 불가

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) { // 유효성 검사
            this.age = age;
        }
    }
}
```

## 💡자바 메모리 구조(static 패키지 참고)

예시

- 메서드영역 (Method Area): 클래스 정보, 상수, 정적 변수 등을 저장합니다.(ex 붕어빵 틀)
- 힙 영역 (Heap Area): 객체 인스턴스와 배열을 저장합니다.(ex 붕어빵)
- 스택 영역 (Stack Area): 실제 프로그램이 실행되는 영역입니다.(ex 붕어빵을 만드는 과정)

실제

- **메서드 영역 (Method Area)**: 클래스 정보, 상수, 정적 변수 등을 저장합니다. 클래스가 로드될 때 메모리에 올라갑니다.
    - static 변수와 메소드, 클래스 정보 등이 저장됩니다.
    - 런타임 상수 풀 (Runtime Constant Pool)도 이 영역에 포함되어, 문자열 리터럴과 같은 상수 값이 저장됩니다.

- **힙 영역 (Heap Area)**: 객체 인스턴스와 배열을 저장합니다.
    - 객체가 생성될 때 메모리에 할당됩니다.
    - 모든 객체와 배열은 힙 영역에 저장되며, 가비지 컬렉터(Garbage Collector)가 이 영역을 관리합니다.

- **스택 영역 (Stack Area)**: 메서드 호출 시 생성되는 프레임(스택 프레임)을 저장합니다.
    - 각 스레드마다 별도의 스택 영역이 있으며, 메서드 호출 시 지역 변수, 매개변수, 리턴 주소 등을 저장합니다.
    - 메서드가 호출될 때마다 새로운 스택 프레임이 생성되고, 메서드 실행이 끝나면 해당 프레임이 제거됩니다.

### ✅ 스택과 큐 자료 구조

- **스택 (Stack)**: 후입선출(LIFO, Last In First Out) 구조로, 가장 나중에 들어온 데이터가 가장 먼저 나갑니다.
    - 예시: 웹 브라우저의 뒤로 가기 기능, 함수 호출 스택 등
    - 자바에서는 `java.util.Stack` 클래스를 사용하여 스택을 구현할 수 있습니다.
    - 스택은 `push()` 메소드로 데이터를 추가하고, `pop()` 메소드로 데이터를 제거합니다.
- **큐 (Queue)**: 선입선출(FIFO, First In First Out) 구조로, 가장 먼저 들어온 데이터가 가장 먼저 나갑니다.
    - 예시: 프린터 대기열, 프로세스 스케줄링 등
    - 자바에서는 `java.util.Queue` 인터페이스와 `java.util.LinkedList` 클래스를 사용하여 큐를 구현할 수 있습니다.
        - 큐는 `offer()` 메소드로 데이터를 추가하고, `poll()` 메소드로 데이터를 제거합니다.
        - `peek()` 메소드를 사용하면 큐의 첫 번째 요소를 확인할 수 있지만 제거하지는 않습니다.

### ✅ 스택영역

코드 예시

```java
public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }


    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 start");

    }
}
```

### ✅ 실행 결과

```
main start
method1 start
method2 start
method2 start
method1 end
main end
```

---

### ✅ static 키워드(static 패키지 참고)

- **static** 키워드는 클래스 레벨에서 공유되는 변수나 메소드를 정의할 때 사용됩니다.
- static 변수는 클래스가 메모리에 로드될 때 생성되며, 모든 인스턴스가 동일한 값을 공유합니다.
- static 메소드는 인스턴스 없이 .을 사용해서 클래스 이름으로 호출할 수 있으며, 인스턴스 변수에 접근할 수 없습니다.
- static이 붙으면 정적 변수나 메소드가 되며, 클래스가 로드될 때 메모리에 할당됩니다.
- static 메소드는 인스턴스 없이 클래스 이름으로 호출할 수 있습니다.

---

### ✅ static 변수와 메소드 주의 사항

- static 변수는 static 메소드에서만 접근할 수 있습니다.
- static 메소드는 인스턴스 변수에 접근할 수 없습니다.
- static 메소드는 static 변수와 메소드만 사용할 수 있습니다.
- 인스턴스 메소드는 static 변수와 메소드에 접근할 수 있지만, static 메소드에서는 인스턴스 변수와 메소드를 사용할 수 없습니다.

### ✅ static 변수와 메소드 예시

```java
public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        staticValue++; // 정적 변수 접근
        staticmethod(); // 정적 메서드 호출

    }

    private void instanceCall() {

        instanceValue++; // 인스턴스 변수 접근
        staticValue++; // 정적 변수 접근

    }

    private static void staticmethod() {
        // 정적 메서드에서는 인스턴스 변수에 접근할 수 없음
        // instanceValue++; // 컴파일 오류
        staticValue++; // 정적 변수 접근
    }

```

---

### ✅ 정리

> 클래스메서드 -> static 메소드로 정의되어 클래스 이름으로 호출 가능
>
>인스턴스메소드 -> 인스턴스 생성 후 객체를 통해 호출 가능

---

## final 키워드(final 패키지 참고)

- final 키워드는 변수, 메소드, 클래스에 적용할 수 있으며, 각각의 의미가 다릅니다.
- 변수는 최초의 한번 만 값을 할당할 수 있으며, 이후에는 변경할 수 없습니다.
- 멤버 변수로 final이 생성 되어 있고 초기값이 없다면 생성자로 값을 할당해야 합니다.
- 메소드는 final로 선언하면 오버라이드(재정의)를 할 수 없습니다.
- 클래스는 final로 선언하면 상속을 할 수 없습니다.
- 즉 절대 변경하지 않을 값을 final로 선언하여 코드의 안정성을 높일 수 있습니다.

### ✅ final 변수 예시

```java
public class FinalExample {
    final int MAX_VALUE = 100; // final 변수 선언
    final String NAME; // final 변수 선언, 초기화는 생성자에서

    public FinalExample(String name) {
        this.NAME = name; // 생성자에서 초기화
    }

    public void display() {
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        System.out.println("NAME: " + NAME);
    }
}
```

### ✅ final 메소드 예시

```java
public class FinalMethodExample {
    public final void display() { // final 메소드 선언
        System.out.println("This is a final method.");
    }
    // 이 메소드는 오버라이드할 수 없습니다.
}

public class SubClass extends FinalMethodExample {
    // 아래 메소드는 컴파일 오류가 발생합니다.
    // public void display() {
    //     System.out.println("Trying to override final method.");
    // }
}
```

### ✅ final 클래스 예시

```java
public final class FinalClass { // final 클래스 선언
    public void display() {
        System.out.println("This is a final class.");
    }
}

// 이 클래스는 상속할 수 없습니다.
public class SubClass extends FinalClass { // 컴파일 오류 발생
    // 상속할 수 없습니다.
}
```

### ✅ final 키워드 요약

| 적용 대상     | 설명                          | 예시                                      |
|-----------|-----------------------------|-----------------------------------------|
| final 변수  | 값을 한 번만 할당할 수 있으며, 이후 변경 불가 | `final int MAX_VALUE = 100;`            |
| final 메소드 | 오버라이드(재정의)를 할 수 없음          | `public final void display() { ... }`   |
| final 클래스 | 상속을 할 수 없음                  | `public final class FinalClass { ... }` |

---

### ✅ 상수

- 상수는 변하지 않는 값을 의미하며, 일반적으로 final 키워드를 사용하여 선언합니다.
- 상수는 대문자로 작성하며, 단어 사이에 언더스코어(_)를 사용하여 구분합니다.
- 상수는 프로그램 전체에서 동일한 값을 유지하며, 변경할 수 없습니다.
- 상수는 주로 프로그램의 설정 값이나 고정된 값을 표현할 때 사용됩니다.
- 상수는 클래스 레벨에서 선언되며, static 키워드를 함께 사용하여 클래스 이름으로 접근할 수 있습니다.
- 상수는 클래스의 멤버 변수로 선언되며, 초기화 후에는 값을 변경할 수 없습니다.

### ✅ 상수 예시

```java
public class Constants {
    public static final int MAX_USERS = 100; // 상수 선언
    public static final String APP_NAME = "My Application"; // 상수 선언
    public static final double PI = 3.14159; // 상수 선언

    public static void main(String[] args) {
        System.out.println("Max Users: " + MAX_USERS);
        System.out.println("App Name: " + APP_NAME);
        System.out.println("PI: " + PI);
    }
}
```

### ✅ 상수 요약

| 적용 대상 | 설명                                  | 예시                                                        |
|-------|-------------------------------------|-----------------------------------------------------------|
| 상수    | 변하지 않는 값을 의미하며, final 키워드를 사용하여 선언  | `public static final int MAX_USERS = 100;`                |
| 상수 이름 | 대문자로 작성하며, 단어 사이에 언더스코어(_)를 사용하여 구분 | `public static final String APP_NAME = "My Application";` |
| 상수 접근 | 클래스 이름으로 접근 가능하며, static 키워드를 함께 사용 | `public static final double PI = 3.14159;`                |
| 상수 사용 | 프로그램 전체에서 동일한 값을 유지하며, 변경할 수 없음     | `System.out.println("Max Users: " + MAX_USERS);`          |

---

## 💡 상속(Inheritance) -> extends1 패키지 참고

- 상속은 객체 지향 프로그래밍의 핵심 개념 중 하나로, 기존 클래스의 속성과 메소드를 새로운 클래스에서 재사용할 수 있게 해줍니다.
- 상속을 통해 코드의 재사용성을 높이고, 클래스 간의 관계를 명확히 할 수 있습니다.
- 부모 클래스는 자식클래스에 접근 할 수 없지만 자식 클래스는 부모 클래스에 접근할 수 있습니다.
- 자식 클래스는 부모 클래스의 멤버 변수와 메소드를 상속받아 사용할 수 있으며, 필요에 따라 오버라이드(재정의)할 수 있습니다.
- 상속은 하나만 받을 수 있습니다. (단일 상속) 하지만 인터페이스를 구현하면 다중 상속이 가능합니다.

### ✅ 상속과 메모리 구조

- 상속을 통해 부모 클래스의 멤버 변수와 메소드를 자식 클래스가 상속받게 되면, 자식 클래스의 객체가 생성될 때 부모 클래스의 멤버 변수와 메소드도 함께 메모리에 할당됩니다.
- 자식 클래스의 객체는 부모 클래스의 멤버 변수와 메소드를 사용할 수 있으며, 부모 클래스의 멤버 변수와 메소드를 오버라이드하여 자식 클래스에서 새로운 기능을 추가할 수 있습니다.
- 상속을 통해 부모 클래스의 멤버 변수와 메소드를 자식 클래스에서 재사용할 수 있으므로, 코드의 중복을 줄이고 유지보수성을 높일 수 있습니다.

### ✅ 상속 예시

```java
// 부모 클래스
public class Car {
    String color; // 색상
    int speed; // 속도

    // 생성자
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // 메소드
    public void drive() {
        System.out.println("차가 달립니다. 색상: " + color + ", 속도: " + speed);
    }
}

// 자식 클래스
public class SportsCar extends Car { // Car 클래스를 상속받음
    int horsepower; // 마력

    // 생성자
    public SportsCar(String color, int speed, int horsepower) {
        super(color, speed); // 부모 클래스의 생성자 호출
        this.horsepower = horsepower;
    }

    // 메소드 오버라이드
    @Override
    public void drive() {
        System.out.println("스포츠카가 달립니다. 색상: " + color + ", 속도: " + speed + ", 마력: " + horsepower);
    }
}
```

### ✅ 상속 사용 구조

- 자식 객체가 생성되면 부모 객체도 같이 생성이 되는데 호출하는 변수가 자식인지 부모인지에 따라 메소드가 결정됩니다.
- 상속 관계의 객체를 호출 할 때 대상 타입을 정해야 하고 현태 타입에서 기능을 찾지 못하면 부모 타입으로 찾아갑니다.

### ✅ 상속과 메서드 오버라이딩

- 자식 클래스에서 부모 클래스의 메소드를 재정의(오버라이드)할 수 있습니다.
- 오버라이드된 메소드는 자식 클래스의 객체에서 호출될 때 자식 클래스의 메소드가 실행됩니다.
- 부모 클래스의 메소드를 오버라이드할 때는 `@Override` 어노테이션을 사용하여 명시적으로 표시하는 것이 좋습니다.
- 오버라이드된 메소드는 부모 클래스의 메소드와 동일한 시그니처(메소드 이름, 매개변수 타입, 개수)를 가져야 합니다.
- 오버라이드된 메소드는 부모 클래스의 접근 제어자보다 더 제한적이지 않아야 합니다. 즉, 부모 클래스의 메소드가 `public`이면 자식 클래스의 오버라이드된 메소드는 `public` 또는 `protected`로
  선언할 수 있습니다.
- 멤버 변수는 오버라이드할 수 없으며, 메서드만 오버라이드할 수 있습니다.
- 오버라이드 된 메서드는 절대적으로 먼저 호출 됩니다.

---

### ✅ 상속이 안되는 경우

- 클래스가 `final`로 선언된 경우: `final` 클래스는 상속할 수 없습니다.
- 클래스가 `private`로 선언된 경우: `private` 클래스는 외부에서 접근할 수 없으므로 상속할 수 없습니다.
- static 메소드: static 메소드는 클래스 레벨에서 공유되므로 상속되지 않습니다.
- 생성자는 오버라이딩이 불가능합니다.

### ✅ super 키워드

- 자식 클래스에서 부모 클래스의 생성자를 호출할 때 `super()`를 사용합니다.
- 부모 클래스의 멤버 변수와 자식 클래스의 멤버 변수가 같은 이름을 가질 때, `super` 키워드를 사용하여 부모 클래스의 멤버 변수에 접근할 수 있습니다.

---

### ✅ super 키워드 예시

```java
public class Panent {
    String name; // 부모 클래스의 멤버 변수

    // 생성자
    public Parent(String name) {
        this.name = name; // 부모 클래스의 멤버 변수 초기화
    }

    public void display() {
        System.out.println("부모 클래스 이름: " + name);
    }
}

public class Child extends Parent {
    String name; // 자식 클래스의 멤버 변수

    // 생성자
    public Child(String parentName, String childName) {
        super(parentName); // 부모 클래스의 생성자 호출
        this.name = childName; // 자식 클래스의 멤버 변수 초기화
    }

    @Override
    public void display() {
        super.display(); // 부모 클래스의 display 메소드 호출
        System.out.println("자식 클래스 이름: " + name);
    }
}
```

---

## 💡다형성(poly 패키지 참고)

- 다형성(Polymorphism)은 객체 지향 프로그래밍의 핵심 개념 중 하나로, 동일한 인터페이스를 사용하여 다양한 객체를 처리할 수 있는 능력을 의미합니다.
- 다형성은 주로 메소드 오버라이딩과 인터페이스를 통해 구현됩니다.
- 다형성은 한 객체가 여러 타입의 객체로 동작할 수 있게 해줍니다.

---

### ✅ 다형성 특징

- 부모는 자식을 참조할 수 있지만, 자식은 부모를 참조할 수 없습니다.
- 하지만 부모 클래스는 자식의 메서드는 호출할 수 없습니다.

```java
Parent parent = new Child(); // 부모 클래스 타입으로 자식 클래스 객체를 참조

Child child = new Parent(); // 컴파일 오류 발생 (부모 클래스 타입으로 자식 클래스 객체를 참조할 수 없음)
```

---

### ✅ 캐스팅

- 부모 타입을 자식 타입으로 변환하는 것을 **다운캐스팅(Downcasting)**이라고 합니다.
- 다형성을 활용할 때, 부모 클래스 타입으로 자식 클래스 객체를 참조할 수 있습니다. 이를 **업캐스팅(Upcasting)**이라고 합니다.
- 업캐스팅은 자동으로 이루어지지만, 다운캐스팅은 명시적으로 해야 합니다.

```java
 Child child = (Child) parent; // 명시적 다운 캐스팅

((Child)parent).

childMethod(); // 일시적 다운 캐스팅

```

---

### ✅ instanceof 연산자

- `instanceof` 연산자는 객체가 특정 클래스의 인스턴스인지 확인하는 데 사용됩니다.
- 이를 통해 다운캐스팅을 안전하게 수행할 수 있습니다.
- `instanceof` 연산자는 객체가 특정 클래스의 인스턴스인지 확인하고, 결과는 `true` 또는 `false`로 반환됩니다.

```java
if(parent instanceof Child){
Child child = (Child) parent; // 안전한 다운 캐스팅
    child.

childMethod(); // 자식 클래스의 메소드 호출
}else{
        System.out.

println("parent는 Child의 인스턴스가 아닙니다.");
}
```

---

### ✅ 추상클래스

- 추상 클래스는 인스턴스를 생성할 수 없는 클래스입니다.
- 추상 클래스는 하나 이상의 추상 메소드를 가질 수 있으며, 이 메소드들은 자식 클래스에서 반드시 구현해야 합니다.
- 추상 클래스는 일반 메소드와 추상 메소드를 모두 가질 수 있습니다.
- 추상 클래스는 상속을 통해 자식 클래스에서 구현되어야 합니다.
- 추상 클래스는 `abstract` 키워드를 사용하여 선언합니다.
- 추상 클래스는 다형성을 지원하며, 자식 클래스에서 오버라이드된 메소드를 통해 다양한 동작을 구현할 수 있습니다.
- 인스턴스로 만들 수 없지만 자식 클래스에서 상속받아 사용할 수 있습니다.

---

### ✅ 추상 클래스 예시

```java
public abstract class Animal {
    // 추상 메소드
    public abstract void makeSound();

    // 일반 메소드
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

public class Dog extends Animal {
    // 추상 메소드 구현
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}
```

---

### ✅ 인터페이스

- 인터페이스는 클래스가 구현해야 하는 메소드의 집합을 정의하는 것입니다.
- 인터페이스는 다중 상속을 지원하며, 여러 인터페이스를 구현할 수 있습니다.
- 인터페이스는 `interface` 키워드를 사용하여 선언합니다.
- 인터페이스는 모든 메소드가 추상 메소드이며, 기본적으로 `public`입니다.
- 인터페이스는 상수 필드를 가질 수 있으며, 이 필드는 `public static final`로 선언됩니다.
- 인터페이스는 클래스가 구현해야 하는 메소드의 시그니처만 정의하며, 실제 구현은 클래스에서 수행합니다.
- 인터페이스는 다형성을 지원하며, 인터페이스 타입으로 객체를 참조할 수 있습니다.
- 인터페이스는 클래스와 달리 인스턴스를 생성할 수 없습니다.
- 다중 구현이 가능하기 때문에 추상 클래스와

---

### ✅ 인터페이스 예시

```java
public interface Animal {
    void makeSound(); // 추상 메소드

    void eat(); // 추상 메소드
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}
```

---

### ✅ 인터페이스와 다중 상속

- 자바는 클래스의 다중 상속을 지원하지 않지만, 인터페이스의 다중 상속은 가능합니다.
- 인터페이스는 여러 개를 구현할 수 있으며, 이를 통해 다중 상속의 효과를 얻을 수 있습니다.
- 인터페이스를 구현하는 클래스는 여러 인터페이스의 메소드를 오버라이드하여 다양한 기능을 제공할 수 있습니다.

```java
public interface Animal {
    void makeSound();
}

public interface Pet {
    void play();
}

public class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}
```

---

### ✅ Ocp 원칙

> 객체 지향 설계 원칙 중 하나로 OCP 원칙 인데 기존의 코드의 수정 없이 새로운 기능을 추가할 수 있게 해야 한다는 의미













