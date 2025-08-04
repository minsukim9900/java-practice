## Java 실습

자바 실습을 통해 자바 문법 관련된 것을 연습

### 도서 관련 실습

1. 도서 객체 생성
   - 요구사항
     - Book 정보를 저장할 클래스 생성
     - Book 클래스가 가지고 있는 정보를 문자열로 리턴 시켜주는 toString 메소드 작성
     - Book 클래스에 생성자를 구현하고 활용
     - Book 객체를 생성하고 정보를 출력하는 BookTest 클래스 작성하여 테스트
2. 도서 배열 관리
   - 요구사항
     - Book 클래스에 Encapsulation을 적용
     - 도서리스트를 배열로 관리할 BookManager 클래스 생성 (도서정보는 최대 100권을 넘지 않는다.)
     - BookManager 클래스에 도서 정보를 등록하는 add 메소드 생성
     - BookManager 클래스에 고유 번호로 도서정보 삭제하는 remove 메소드를 생성
     - BookManager 클래스에 도서 리스트 반환하는 getList 메소드를 생성
     - BookManager 클래스에 고유 번호로 도서정보 반환하는 searchByIsbn 메소드 생성
     - 도서 객체 등록, 삭제, 조회를 테스트할 BookTest 클래스 작성
3. 도서 상속 실습
   - 요구사항
     - 도서 정보를 저장하기 위해 Book 클래스를 작성
     - Book 클래스를 확장하여 잡지 정보를 저장할 Magazine 클래스를 작성
       - 속성: year, month
       - 생성자, Encapsulation, toString 적용
     - 도서(일반도서, 잡지) 리스트를 배열로 관리할 BookManager 클래스를 생성
       - 일반도서와 잡지를 모두 관리하도록 작성
     - BookManager 클래스에 도서 제목을 포함검색(일치 검색이 아닌 해당 제목을 일부 또는 전체로 포함하는 검색) 처리하여 도서리스트를 반환하는 searchByTitle 메소드 생성
     - BookManager 클래스에 잡지가 아닌 일반도서 리스트를 반환하는 getBooks 메소드를 생성
     - BookManager 클래스에 잡지리스트를 반환하는 getMegazines 메소드를 생성
     - BookManager 클래스에 도서리스트의 가격의 총합을 반환하는 getTotalPrice 메소드를 생성
     - BookManager 클래스에 도서 가격의 평균을 반환하는 getPriceAvg 메소드를 생성
4. 도서 매니저 인터페이스
5. 도서 ArrayList 실습
6. 도서 예외처리
7. 도서파일 입출력