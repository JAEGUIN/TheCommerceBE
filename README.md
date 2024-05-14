# 더 커머스 실기과제

더 커머스 백엔드 개발자 기술 과제 restful api 백엔드 서버

언어 : jdk1.8 (java8)

프레임워크 : java spring boot 2.6.8

db매핑 : spring jpa

db : h2

Swagger 주소 :
http://localhost:8080/swagger-ui.html#/

h2 주소
http://localhost:8080/h2-console


id : sa

pw : 



회원가입

| 기능 명칭 | 회원 가입 |
| --- | --- |
| 기능 설명 | 입력된 정보를 기반으로 회원 정보를 데이터베이스에 저장합니다. |
| url | /api/user/join |
| 접근방식 | POST |
| 추가 기능 | 중복 가입 X |
| 요청 파라미터 | 회원id, 비밀번호, 닉네임, 이름, 전화번호, 이메일주소 |
| 응답 | 정상 동작한 경우 응답코드 201 |





회원 목록 조회

| 기능 명칭 | 회원 목록 조회 |
| --- | --- |
| 기능 설명 | 입력된 회원들의 정보를 목록으로 조회합니다. |
| url | /api/user/list |
| 접근방식 | GET |
| 요청 파라미터 | 쿼리스트링 방식으로 요청 | 
| ex1 | http://localhost:8080/api/user/list?page=1&pageSize=10&sortBy=name&sortDirection=desc |
| ex2 | http://localhost:8080/api/user/list?page=1&pageSize=10&sortBy=regiTime&sortDirection=asc |
| 응답 | 정상 동작한 경우 응답코드 200프론트에서 paging 처리를 할 수 있는 적절한 형태의 응답 |





회원 수정

| 기능 명칭 | 회원 정보 수정 |
| --- | --- |
| 기능 설명 | 해당하는 아이디를 가진 회원의 정보가 수정됩니다. |
| url | /api/user/{로그인아이디} |
| 응답 | 변경 내역을 확인할 수 있는 적절한 형태의 응답 |


