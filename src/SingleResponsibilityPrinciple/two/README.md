1. 저장 기능 분리
    * Repository 에 저장 기능을 위임
        * 저장
        * 리스트 가져오기
    * 저장소에서 판매 리스트를 식별하기 위해 Salesperson에 id라는 필드의 식별자를 만들어줌
    * 저장소를 new 키워드로 재생성 하지 않도록 SingleTon 방식으로 만듬
        * repository 패키지 생성
        * Repository class에서 public 키워드를 지움
            * => Repository 클래스는 외부에서 접근 불가
        * RepositoryManager 생성 
        * 그리고 Repository를 받을 수 있는 인터페이스를 생성해서 Salesperson이 Repository의 기능을 사용할 수 있도록 할 것 
            * Repository 인터페이스를 생성한 대신, 기존 Repository 클래스 이름은 Repository를 구현했다는 뜻에서 RepositoryImpl로 변경
            1. RepositoryImpl 클래스에서 인터페이스를 구현했음을 알리기 위해서 implements 키워드 추가
            2. RepositoryManager의 getInstance 메소드에서 RepositoryImpl대신 Repository 인터페이스를 리턴

2. 계산 기능 분리
    * PerformanceCalculator 에 계산 기능을 위이
        * 저장소와 Salesperson의 id를 받아 판매 물품을 가져와 급여를 계산
    * 마찬가지로 PerformanceCalculator 를 받을 수 있도록 인터페이스 생성 & Singleton 방식응로 Manager가 Impl을 리턴

3. 이렇게 해서 단일 책임 원칙을 지켰다.