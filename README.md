# framework-demo-lucy-xss-filter
## lucy-xss-servlet-filter 적용방법
1. pom.xml에 lucy-xss-servlet 디펜던시 추가한다.
2. @Configuration을 작성하여 lucy xss servlet filter bean을 등록한다.
3. resources 폴더 아리에 lucy-xss-servlet-filter-rule.xml 설정파일을 생성한 후 필터링 대상 URL및 파라미터들에 대한 커스터마이징을 수행한다.
  - 필터링 대상은 전체 URL(Bean등록 시 filter 적용 URL을 지정함) 전체 파리미터이다.
  - 특정 url을 제외시키는 설정을 lucy-xss-servlet-filter-rule.xml 설정파일에 넣을 수 있다.
  - 특정 파라미터명이나 특정 prefix로 시작하는 파라미터명의 파라미터를 제외시키는 설정을 lucy-xss-servlet-filter-rule.xml 설정파일에 넣을 수 있다.
  - *** request body에 들어오는 값을 필터링할 수 없다. ***
