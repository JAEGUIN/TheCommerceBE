# 더 커머스 실기과제

더 커머스 백엔드 개발자 기술 과제 restful api 백엔드 서버

언어 : jdk1.8 (java8)

프레임워크 : java spring boot 2.6.8

db매핑 : spring jpa

db : h2

Swagger 주소 :
http://localhost:8080/swagger-ui.html#/


1. 회원가입

| 기능 명칭 | 회원 가입 |
| --- | --- |
| 기능 설명 | 입력된 정보를 기반으로 회원 정보를 데이터베이스에 저장합니다. |
| url | /api/user/join |
| 접근방식 | POST |
| 요청 파라미터 | 회원id비밀번호
닉네임
이름
전화번호
이메일주소 |
| 응답 | 정상 동작한 경우 응답코드 201 |


1. 회원 목록 조회

| 기능 명칭 | 회원 목록 조회 |
| --- | --- |
| 기능 설명 | 입력된 회원들의 정보를 목록으로 조회합니다. |
| url | /api/user/list |
| 접근방식 | GET |
| 요청 파라미터 | 쿼리스트링 방식으로 요청합니다.page : 페이지 번호
pageSize : 한 페이지에 표시될 수 있는 최대 회원 수
sort: 가입일 순 / 이름순 |
| 응답 | 정상 동작한 경우 응답코드 200프론트에서 paging 처리를 할 수 있는 적절한 형태의 응답 |


1. 회원 수정

| 기능 명칭 | 회원 정보 수정 |
| --- | --- |
| 기능 설명 | 해당하는 아이디를 가진 회원의 정보가 수정됩니다. |
| url | /api/user/{로그인아이디} |
| 접근방식 |  |
| 요청 파라미터 |  |
| 응답 | 변경 내역을 확인할 수 있는 적절한 형태의 응답 |

과제의 평가 기준 :

제출한 repository에서 pull 받은 소스의 동작 여부요구된 기능의 구현 정도소프트웨어의 설계 방식코드 작성 스타일소프트웨어가 동작하는데 있어서 필요한 사항에 대한 안내가 충분한지

- ex) persistence layer 접근 등

다음과 같은 사항이 추가적으로 고려됩니다.

예외 처리유효성 검사

테스트 코드 

작성 open api명세를 확인할 수 있는 기능

log관련 기능깃허브 사용방식 및 습관

위 사항들을 종합적으로 판단하여 평가가 이루어집니다.
