# >>  SPRING BOOT REST API << 



# 1. Setting

> Step 1 ) STS에서 Spring Boot 생성

- Package Exploer 에서 마우스 우클릭 > New > Spring Starter Projcect를 클릭합니다.

  ![1](/img/1.png)

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



# 2. pom.xml 에서 Dependencies 설정

> Dependencies 설정하기

- pom.xml 에서 필요한 Dependency들을 설정해줍니다.
- 저는 mybatis, mysql 등 필요한 것들을 설정하였습니다.



# 3. DB

> MySql을 사용하여 DB 생성

- Board Schema를 생성한다.

- User table 을 생성한다.
  <img src="/img/4.png" alt="4"/>

- Columns

  | useri**d**         | **varchar(10) PK** |
  | ------------------ | ------------------ |
  | **userpw**         | **varchar(10)**    |
  | **username**       | **varchar(20)**    |
  | **useremailfront** | **varchar(30)**    |
  | **useremailback**  | **varchar(30)**    |
  | **joindate**       | **timestamp**      |

  

# 4. swagger에서 api 확인하기

> 링크 접속 

- http://localhost:8080/swagger-ui/index.html



