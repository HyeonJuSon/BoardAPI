# >>  SPRING BOOT REST API << 

# 📎 INDEX

- [⚙️Setting](#⚙️Setting)
- [Summary](#Summary)
-  



# ⚙️Setting

## Project 생성

> Step 1 ) STS에서 Spring Boot 생성

- Package Explorer 에서 마우스 우클릭 > New > Spring Starter Projcect를 클릭합니다.

  ![1](/img/1.png

- Name에 이름을 입력하고 Next를 눌립니다.

  <img src="/img/2.png" alt="2" style="zoom:80%;" />

- Dependency 설정을 하고 Finsh하면 Spring Boot Project가 생성됩니다.
  (저는 pom.xml에서 설정할 예정이라서 그냥 넘어간 후 생성헀습니다. )

- 조금 대기 후 프로젝트가 생성됨을 확인합니다.

> Step 2 ) Git 연동

- 프로젝트 생성이 완료되었으면 Git과 연결해줍니다.
  - Git과의 연동은 [ 프로젝트 우클릭 > Team > Share Project > Commit > 연동할 url 입력 후 Push 완료 ] 로 진행하시면 됩니다.
  - 자세한 건 구글링 부탁드립니다.

> Step 3 ) 완료

- Git 과 연동까지 되었으면 다음과 같이 프로젝트가 구성됩니다.

  ![3](/img/3.png)

## pom.xml에서 Dependencies 설정

> Dependencies 설정하기

- pom.xml 에서 필요한 Dependency들을 설정해줍니다.
- 저는 mybatis, mysql 등 필요한 것들을 설정하였습니다.



## DB

> MySql을 사용하여 DB 생성

- Board Schema를 생성한다.

- User table 을 생성한다.

  <img src="/img/4.png" alt="4"  />

  - Columns

    | **userid**     | varchar(10) PK |
    | -------------- | :------------- |
    | userpw         | varchar(10)    |
    | username       | varchar(20)    |
    | useremailfront | varchar(30)    |
    | useremailback  | varchar(30)    |
    | joindate       | timestamp      |



<hr>

# ✏️Summary

## REST API

> REST

- Representation State Transfer의 약자
- 2000년도 로이 필딩의 박사 학위 논문에서 최초로 소개
- 웹(HTTP)의 장점을 최대한 활용할 수 있는 아키텍처로써 REST를 발표하였습니다.

> REST의 구성

- 자원(Resource) - URI
- 행위(Verb) - HTTP Method
- 표현(Representations)

> REST의 특징 

- Uniform ( 유니폼 인터페이스 )
  - URI로 지정한 리소스에 대한 조작을 통일되고 한정적인 인터페이스로 수행하는 아키텍처
- Stateless ( 무상태성 )
  - 세션이나 쿠키 등에 상태 정보를 따로 저장하고 관리하지 않고, API 요청에 대한 처리만 수행한다
- Cacheable ( 캐시 가능 )
  - Last-Modefied나 E-Tag를 이용한 캐싱 등 기본적으로 웹 HTTP 프로토콜이 가지는 캐싱 기능을 활용한다
- Self-descriptiveness ( 자체 표현 구조 )
  - REST API의 규격과 메시지만 보고도 동작에 대한 이해를 쉽게할 수 있는 자체 표현 구조로 되어있다
- Client-Server 구조
  - REST API 서버는 API 제공, 클라이언트는 사용자 인증 등으로 역할 분리
  - 상호 의존성이 줄어들게 된다.
- 계층형 구조
  - REST API 서버는 추가적인 계층 구축에 구조상의 유연함을 가진다.
